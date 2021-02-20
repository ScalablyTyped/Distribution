package typings.git.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git", "Commit")
@js.native
class Commit protected () extends StObject {
  def this(
    repo: Repo,
    id: String,
    parents: js.Array[_],
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
  
  var parents: js.Array[_] = js.native
  
  var repo: Repo = js.native
  
  var sha: String = js.native
  
  var short_message: String = js.native
  
  def show(callback: js.Function): Unit = js.native
  
  def toPatch(callback: js.Function): Unit = js.native
  
  var tree: js.Any = js.native
}
/* static members */
object Commit {
  
  @JSImport("git", "Commit.count")
  @js.native
  def count(repo: js.Any, ref: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("git", "Commit.diff")
  @js.native
  def diff(repo: js.Any, a: js.Any, b: js.Any, callback: js.Function): Unit = js.native
  @JSImport("git", "Commit.diff")
  @js.native
  def diff(repo: js.Any, a: js.Any, b: js.Any, paths: js.Any, callback: js.Function): Unit = js.native
  @JSImport("git", "Commit.diff")
  @js.native
  def diff(repo: js.Any, a: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("git", "Commit.find_all")
  @js.native
  def find_all(repo: js.Any, callback: js.Function): Unit = js.native
  @JSImport("git", "Commit.find_all")
  @js.native
  def find_all(repo: js.Any, reference: js.Any, callback: js.Function): Unit = js.native
  @JSImport("git", "Commit.find_all")
  @js.native
  def find_all(repo: js.Any, reference: js.Any, options: js.Any, callback: js.Function): Unit = js.native
  
  @JSImport("git", "Commit.list_from_string")
  @js.native
  def list_from_string(repo: js.Any, text: js.Any): js.Array[Commit] = js.native
}
