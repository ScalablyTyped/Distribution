package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Commit")
@js.native
open class Commit protected () extends StObject {
  def this(
    repo: Repo,
    id: String,
    parents: js.Array[Any],
    tree: Any,
    author: Actor,
    authoredDate: String,
    committer: Actor,
    committedDate: String,
    message: String,
    filechanges: Any
  ) = this()
  
  var _id_abbrev: Any = js.native
  
  var author: Actor = js.native
  
  // synonym to id
  var authored_date: String = js.native
  
  var committed_date: String = js.native
  
  var committer: Actor = js.native
  
  def diffs(callback: js.Function): Unit = js.native
  
  var filechanges: Any = js.native
  
  var id: String = js.native
  
  def id_abbrev(callback: js.Function): Unit = js.native
  
  def load(callback: js.Function): Unit = js.native
  
  var message: String = js.native
  
  var parents: js.Array[Any] = js.native
  
  var repo: Repo = js.native
  
  var sha: String = js.native
  
  var short_message: String = js.native
  
  def show(callback: js.Function): Unit = js.native
  
  def toPatch(callback: js.Function): Unit = js.native
  
  var tree: Any = js.native
}
/* static members */
object Commit {
  
  @JSImport("git", "Commit")
  @js.native
  val ^ : js.Any = js.native
  
  inline def count(repo: Any, ref: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(repo.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def diff(repo: Any, a: Any, b: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(repo.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diff(repo: Any, a: Any, b: Any, paths: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(repo.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diff(repo: Any, a: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(repo.asInstanceOf[js.Any], a.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def find_all(repo: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def find_all(repo: Any, reference: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def find_all(repo: Any, reference: Any, options: Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def list_from_string(repo: Any, text: Any): js.Array[Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("list_from_string")(repo.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Array[Commit]]
}
