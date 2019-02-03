package typings
package gitLib.gitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("git", "Merge")
@js.native
class Merge protected () extends js.Object {
  def this(str: java.lang.String) = this()
  var conflicts: js.Any = js.native
  var sections: js.Any = js.native
  var text: js.Any = js.native
}

/* static members */
@JSImport("git", "Merge")
@js.native
object Merge extends js.Object {
  var STATUS_BOTH: java.lang.String = js.native
  var STATUS_OURS: java.lang.String = js.native
  var STATUS_THEIRS: java.lang.String = js.native
}

