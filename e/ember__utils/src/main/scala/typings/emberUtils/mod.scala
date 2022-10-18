package typings.emberUtils

import typings.emberUtils.emberUtilsStrings.undefined
import typings.emberUtils.privateTypesMod.TypeOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ember/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(v: Any, w: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def isBlank(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlank")().asInstanceOf[Boolean]
  inline def isBlank(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlank")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")().asInstanceOf[Boolean]
  inline def isEmpty(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isNone(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNone")().asInstanceOf[Boolean]
  inline def isNone(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNone")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPresent(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresent")().asInstanceOf[Boolean]
  inline def isPresent(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPresent")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def typeOf(): undefined = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")().asInstanceOf[undefined]
  inline def typeOf[T](value: T): TypeOf[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("typeOf")(value.asInstanceOf[js.Any]).asInstanceOf[TypeOf[T]]
}
