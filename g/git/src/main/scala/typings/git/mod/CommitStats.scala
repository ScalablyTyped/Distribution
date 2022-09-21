package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "CommitStats")
@js.native
open class CommitStats protected () extends StObject {
  def this(repo: Any, id: Any, files: js.Array[Any]) = this()
  
  var additions: Any = js.native
  
  var deletions: Any = js.native
  
  var files: js.Array[Any] = js.native
  
  var id: Any = js.native
  
  var repo: Any = js.native
  
  var total: Any = js.native
}
/* static members */
object CommitStats {
  
  @JSImport("git", "CommitStats")
  @js.native
  val ^ : js.Any = js.native
  
  inline def find_all(repo: Any, reference: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def find_all(repo: Any, reference: Any, options: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def list_from_string(repo: Any, text: String): js.Array[CommitStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("list_from_string")(repo.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Array[CommitStats]]
}
