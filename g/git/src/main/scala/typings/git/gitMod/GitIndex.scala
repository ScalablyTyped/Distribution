package typings.git.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "GitIndex")
@js.native
class GitIndex protected () extends js.Object {
  def this(repo: js.Any) = this()
  var current_tree: js.Any = js.native
  var repo: js.Any = js.native
  var tree: js.Any = js.native
  def add(filePath: js.Any, data: js.Any): Unit = js.native
  def commit(message: js.Any, callback: js.Function): Unit = js.native
  def commit(message: js.Any, parents: js.Any, actor: js.Any, callback: js.Function): Unit = js.native
  def commit(message: js.Any, parents: js.Any, actor: js.Any, lastTree: js.Any, callback: js.Function): Unit = js.native
  def commit(message: js.Any, parents: js.Any, callback: js.Function): Unit = js.native
  def read_tree(tree: js.Any, callback: js.Function): Unit = js.native
  def write_blob(data: js.Any): js.Any = js.native
  def write_tree(tree: js.Any, callback: js.Function): js.Any = js.native
  def write_tree(tree: js.Any, nowTree: js.Any, callback: js.Function): js.Any = js.native
}

