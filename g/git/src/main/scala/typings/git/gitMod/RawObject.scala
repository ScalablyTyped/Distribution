package typings.git.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "RawObject")
@js.native
class RawObject protected () extends js.Object {
  def this(`type`: js.Any, content: js.Any) = this()
  var content: js.Any = js.native
  var `type`: js.Any = js.native
  def sha1(): js.Any = js.native
  def sha1(encoding: String): js.Any = js.native
  def sha1_hex(): js.Any = js.native
}

