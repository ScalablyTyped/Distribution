package typings.git.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "CommitStats")
@js.native
class CommitStats protected () extends js.Object {
  def this(repo: js.Any, id: js.Any, files: js.Array[_]) = this()
  var additions: js.Any = js.native
  var deletions: js.Any = js.native
  var files: js.Array[_] = js.native
  var id: js.Any = js.native
  var repo: js.Any = js.native
  var total: js.Any = js.native
}

/* static members */
@JSImport("git", "CommitStats")
@js.native
object CommitStats extends js.Object {
  def find_all(repo: js.Any, reference: js.Any, callback: js.Function): Unit = js.native
  def find_all(repo: js.Any, reference: js.Any, options: js.Any, callback: js.Function): Unit = js.native
  def list_from_string(repo: js.Any, text: String): js.Array[CommitStats] = js.native
}

