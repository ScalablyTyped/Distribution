package typings.findReplace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(array: js.Array[Any], findFn: js.Function1[/* x */ Any, Boolean], replaceWiths: Any*): js.Array[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(array.asInstanceOf[js.Any], findFn.asInstanceOf[js.Any])).`++`(replaceWiths.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Array[Any]]
  
  @JSImport("find-replace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
