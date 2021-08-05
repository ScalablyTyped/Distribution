package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "CommitStats")
@js.native
class CommitStats protected () extends StObject {
  def this(repo: js.Any, id: js.Any, files: js.Array[js.Any]) = this()
  
  var additions: js.Any = js.native
  
  var deletions: js.Any = js.native
  
  var files: js.Array[js.Any] = js.native
  
  var id: js.Any = js.native
  
  var repo: js.Any = js.native
  
  var total: js.Any = js.native
}
/* static members */
object CommitStats {
  
  @JSImport("git", "CommitStats")
  @js.native
  val ^ : js.Any = js.native
  
  inline def find_all(repo: js.Any, reference: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def find_all(repo: js.Any, reference: js.Any, options: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def list_from_string(repo: js.Any, text: String): js.Array[CommitStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("list_from_string")(repo.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Array[CommitStats]]
}
