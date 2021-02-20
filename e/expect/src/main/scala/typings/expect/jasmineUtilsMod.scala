package typings.expect

import typings.expect.typesMod.Tester
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jasmineUtilsMod {
  
  @JSImport("expect/build/jasmineUtils", "equals")
  @js.native
  def equals_(a: js.Any, b: js.Any): Boolean = js.native
  @JSImport("expect/build/jasmineUtils", "equals")
  @js.native
  def equals_(a: js.Any, b: js.Any, customTesters: js.UndefOr[scala.Nothing], strictCheck: Boolean): Boolean = js.native
  @JSImport("expect/build/jasmineUtils", "equals")
  @js.native
  def equals_(a: js.Any, b: js.Any, customTesters: js.Array[Tester]): Boolean = js.native
  @JSImport("expect/build/jasmineUtils", "equals")
  @js.native
  def equals_(a: js.Any, b: js.Any, customTesters: js.Array[Tester], strictCheck: Boolean): Boolean = js.native
  
  @JSImport("expect/build/jasmineUtils", "fnNameFor")
  @js.native
  def fnNameFor(func: js.Function): String = js.native
  
  @JSImport("expect/build/jasmineUtils", "hasProperty")
  @js.native
  def hasProperty(obj: js.Object, property: String): Boolean = js.native
  @JSImport("expect/build/jasmineUtils", "hasProperty")
  @js.native
  def hasProperty(obj: Null, property: String): Boolean = js.native
  
  @JSImport("expect/build/jasmineUtils", "isA")
  @js.native
  def isA(typeName: String, value: js.Any): Boolean = js.native
  
  @JSImport("expect/build/jasmineUtils", "isImmutableUnorderedKeyed")
  @js.native
  def isImmutableUnorderedKeyed(maybeKeyed: js.Any): Boolean = js.native
  
  @JSImport("expect/build/jasmineUtils", "isImmutableUnorderedSet")
  @js.native
  def isImmutableUnorderedSet(maybeSet: js.Any): Boolean = js.native
  
  @JSImport("expect/build/jasmineUtils", "isUndefined")
  @js.native
  def isUndefined(obj: js.Any): Boolean = js.native
}
