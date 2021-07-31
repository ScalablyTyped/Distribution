package typings.expect

import typings.expect.typesMod.Tester
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmineUtilsMod {
  
  @JSImport("expect/build/jasmineUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def equals_(a: js.Any, b: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(a: js.Any, b: js.Any, customTesters: js.Array[Tester]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(a: js.Any, b: js.Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any], strictCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def equals_(a: js.Any, b: js.Any, customTesters: Unit, strictCheck: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], customTesters.asInstanceOf[js.Any], strictCheck.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def fnNameFor(func: js.Function): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fnNameFor")(func.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def hasProperty(obj: js.Object, property: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(obj.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def hasProperty(obj: Null, property: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(obj.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isA(typeName: String, value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isA")(typeName.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isImmutableUnorderedKeyed(maybeKeyed: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImmutableUnorderedKeyed")(maybeKeyed.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isImmutableUnorderedSet(maybeSet: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImmutableUnorderedSet")(maybeSet.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isUndefined(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
