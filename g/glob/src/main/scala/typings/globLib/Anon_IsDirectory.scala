package typings
package globLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsDirectory extends js.Object {
  def isDirectory(): scala.Boolean
}

object Anon_IsDirectory {
  @scala.inline
  def apply(isDirectory: js.Function0[scala.Boolean]): Anon_IsDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDirectory")(isDirectory)
    __obj.asInstanceOf[Anon_IsDirectory]
  }
}

