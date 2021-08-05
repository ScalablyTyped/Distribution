package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Commit")
@js.native
class Commit protected () extends StObject {
  def this(
    repo: Repo,
    id: String,
    parents: js.Array[js.Any],
    tree: js.Any,
    author: Actor,
    authoredDate: String,
    committer: Actor,
    committedDate: String,
    message: String,
    filechanges: js.Any
  ) = this()
  
  var _id_abbrev: js.Any = js.native
  
  var author: Actor = js.native
  
  // synonym to id
  var authored_date: String = js.native
  
  var committed_date: String = js.native
  
  var committer: Actor = js.native
  
  def diffs(callback: js.Function): Unit = js.native
  
  var filechanges: js.Any = js.native
  
  var id: String = js.native
  
  def id_abbrev(callback: js.Function): Unit = js.native
  
  def load(callback: js.Function): Unit = js.native
  
  var message: String = js.native
  
  var parents: js.Array[js.Any] = js.native
  
  var repo: Repo = js.native
  
  var sha: String = js.native
  
  var short_message: String = js.native
  
  def show(callback: js.Function): Unit = js.native
  
  def toPatch(callback: js.Function): Unit = js.native
  
  var tree: js.Any = js.native
}
/* static members */
object Commit {
  
  @JSImport("git", "Commit")
  @js.native
  val ^ : js.Any = js.native
  
  inline def count(repo: js.Any, ref: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(repo.asInstanceOf[js.Any], ref.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def diff(repo: js.Any, a: js.Any, b: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(repo.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diff(repo: js.Any, a: js.Any, b: js.Any, paths: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(repo.asInstanceOf[js.Any], a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], paths.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def diff(repo: js.Any, a: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(repo.asInstanceOf[js.Any], a.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def find_all(repo: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def find_all(repo: js.Any, reference: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def find_all(repo: js.Any, reference: js.Any, options: js.Any, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("find_all")(repo.asInstanceOf[js.Any], reference.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def list_from_string(repo: js.Any, text: js.Any): js.Array[Commit] = (^.asInstanceOf[js.Dynamic].applyDynamic("list_from_string")(repo.asInstanceOf[js.Any], text.asInstanceOf[js.Any])).asInstanceOf[js.Array[Commit]]
}
