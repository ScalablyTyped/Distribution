package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "Actor")
@js.native
class Actor protected () extends js.Object {
  def this(name: java.lang.String, email: java.lang.String) = this()
  var email: java.lang.String = js.native
  var name: java.lang.String = js.native
}

@JSImport("git", "Actor")
@js.native
object Actor extends js.Object {
  def from_string(str: java.lang.String): gitLib.gitMod.Actor = js.native
}

