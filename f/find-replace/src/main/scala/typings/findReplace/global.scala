package typings.findReplace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def findReplace(array: js.Array[Any], findFn: js.Function1[/* x */ Any, Boolean], replaceWiths: Any*): js.Array[Any] = (js.Dynamic.global.applyDynamic("findReplace")((scala.List(array.asInstanceOf[js.Any], findFn.asInstanceOf[js.Any])).`++`(replaceWiths.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[Any]]
  
  inline def findReplace_T[T](
    array: js.Array[T],
    findFn: js.Function1[/* x */ T, Boolean],
    replaceWiths: (T | (js.Function1[/* x */ T, T]))*
  ): js.Array[T] = (js.Dynamic.global.applyDynamic("findReplace")((scala.List(array.asInstanceOf[js.Any], findFn.asInstanceOf[js.Any])).`++`(replaceWiths.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[T]]
}
