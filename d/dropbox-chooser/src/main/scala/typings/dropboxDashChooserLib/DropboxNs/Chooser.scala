package typings
package dropboxDashChooserLib.DropboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chooser extends js.Object {
  def choose(options: ChooserOptions): scala.Unit
}

object Chooser {
  @scala.inline
  def apply(choose: ChooserOptions => scala.Unit): Chooser = {
    val __obj = js.Dynamic.literal(choose = js.Any.fromFunction1(choose))
  
    __obj.asInstanceOf[Chooser]
  }
}

