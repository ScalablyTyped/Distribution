package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "Commit")
@js.native
class Commit protected () extends js.Object {
  def this(repo: Repo, id: java.lang.String, parents: js.Array[_], tree: js.Any, author: Actor, authoredDate: java.lang.String, committer: Actor, committedDate: java.lang.String, message: java.lang.String, filechanges: js.Any) = this()
  var _id_abbrev: js.Any = js.native
  var author: Actor = js.native
   // synonym to id
  var authored_date: java.lang.String = js.native
  var committed_date: java.lang.String = js.native
  var committer: Actor = js.native
  var filechanges: js.Any = js.native
  var id: java.lang.String = js.native
  var message: java.lang.String = js.native
  var parents: js.Array[_] = js.native
  var repo: Repo = js.native
  var sha: java.lang.String = js.native
  var short_message: java.lang.String = js.native
  var tree: js.Any = js.native
  def diffs(callback: js.Function): scala.Unit = js.native
  def id_abbrev(callback: js.Function): scala.Unit = js.native
  def load(callback: js.Function): scala.Unit = js.native
  def show(callback: js.Function): scala.Unit = js.native
  def toPatch(callback: js.Function): scala.Unit = js.native
}

@JSImport("git", "Commit")
@js.native
object Commit extends js.Object {
  def count(repo: js.Any, ref: js.Any, callback: js.Function): scala.Unit = js.native
  def diff(repo: js.Any, a: js.Any, b: js.Any, callback: js.Function): scala.Unit = js.native
  def diff(repo: js.Any, a: js.Any, b: js.Any, paths: js.Any, callback: js.Function): scala.Unit = js.native
  def diff(repo: js.Any, a: js.Any, callback: js.Function): scala.Unit = js.native
  def find_all(repo: js.Any, callback: js.Function): scala.Unit = js.native
  def find_all(repo: js.Any, reference: js.Any, callback: js.Function): scala.Unit = js.native
  def find_all(repo: js.Any, reference: js.Any, options: js.Any, callback: js.Function): scala.Unit = js.native
  def list_from_string(repo: js.Any, text: js.Any): js.Array[gitLib.gitMod.Commit] = js.native
}

