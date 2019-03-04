package typings
package domDashClipboardDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Navigator extends js.Object {
  val clipboard: Clipboard
}

object Navigator {
  @scala.inline
  def apply(clipboard: Clipboard): Navigator = {
    val __obj = js.Dynamic.literal(clipboard = clipboard)
  
    __obj.asInstanceOf[Navigator]
  }
}

