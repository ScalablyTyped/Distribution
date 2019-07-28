package typings.git.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "Status")
@js.native
class Status protected () extends js.Object {
  def this(repo: js.Any, callback: js.Function) = this()
  var files: js.Array[_] = js.native
  var repo: js.Any = js.native
  def index(file: js.Any): js.Any = js.native
}

