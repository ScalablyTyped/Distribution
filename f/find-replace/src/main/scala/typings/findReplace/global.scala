package typings.findReplace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def findReplace(array: js.Array[js.Any], findFn: js.Function1[/* x */ js.Any, Boolean], replaceWiths: js.Any*): js.Array[js.Any] = (js.Dynamic.global.applyDynamic("findReplace")(array.asInstanceOf[js.Any], findFn.asInstanceOf[js.Any], replaceWiths.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  inline def findReplace_T[T](
    array: js.Array[T],
    findFn: js.Function1[/* x */ T, Boolean],
    replaceWiths: (T | (js.Function1[/* x */ T, T]))*
  ): js.Array[T] = (js.Dynamic.global.applyDynamic("findReplace")(array.asInstanceOf[js.Any], findFn.asInstanceOf[js.Any], replaceWiths.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
