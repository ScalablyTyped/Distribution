package typings.devextremeRuntime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsReactEqualByValueMod {
  
  @JSImport("@devextreme/runtime/cjs/react/equal-by-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def equalByValue(object1: Any, object2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalByValue")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalByValue(object1: Any, object2: Any, depth: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalByValue")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalByValue(object1: Any, object2: Any, depth: Double, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalByValue")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalByValue(object1: Any, object2: Any, depth: Unit, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalByValue")(object1.asInstanceOf[js.Any], object2.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toComparable(value: Any, caseSensitive: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("toComparable")(value.asInstanceOf[js.Any], caseSensitive.asInstanceOf[js.Any])).asInstanceOf[Any]
}
