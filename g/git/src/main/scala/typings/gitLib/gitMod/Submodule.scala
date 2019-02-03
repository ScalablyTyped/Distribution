package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "Submodule")
@js.native
class Submodule protected () extends js.Object {
  def this(repo: js.Any, id: js.Any, mode: js.Any, name: js.Any) = this()
  var basename: js.Any = js.native
  var id: js.Any = js.native
  var mode: js.Any = js.native
  var name: js.Any = js.native
  var repo: js.Any = js.native
}

/* static members */
@JSImport("git", "Submodule")
@js.native
object Submodule extends js.Object {
  def config(repo: js.Any, ref: js.Any, callback: js.Function): scala.Unit = js.native
  def create(repo: js.Any, attributes: js.Any, callback: js.Function): scala.Unit = js.native
}

