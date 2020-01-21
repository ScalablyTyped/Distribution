package typings.git.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "Actor")
@js.native
class Actor protected () extends js.Object {
  def this(name: String, email: String) = this()
  var email: String = js.native
  var name: String = js.native
}

/* static members */
@JSImport("git", "Actor")
@js.native
object Actor extends js.Object {
  def from_string(str: String): Actor = js.native
}

