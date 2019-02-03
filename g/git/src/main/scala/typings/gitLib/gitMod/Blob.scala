package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "Blob")
@js.native
class Blob protected () extends js.Object {
  def this(repo: js.Any, id: js.Any, mode: js.Any, name: js.Any) = this()
  var basename: js.Any = js.native
  var data: js.Any = js.native
  var id: js.Any = js.native
  var mine_type: js.Any = js.native
  var mode: js.Any = js.native
  var name: js.Any = js.native
  var repo: Repo = js.native
  var size: js.Any = js.native
}

/* static members */
@JSImport("git", "Blob")
@js.native
object Blob extends js.Object {
  def blame(repo: js.Any, commit: js.Any, file: js.Any, callback: js.Function): scala.Unit = js.native
}

