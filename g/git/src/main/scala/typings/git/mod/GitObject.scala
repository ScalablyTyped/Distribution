package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "GitObject")
@js.native
open class GitObject () extends StObject
/* static members */
object GitObject {
  
  @JSImport("git", "GitObject")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from_raw(rawObject: Any, repository: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("from_raw")(rawObject.asInstanceOf[js.Any], repository.asInstanceOf[js.Any])).asInstanceOf[Any]
}
