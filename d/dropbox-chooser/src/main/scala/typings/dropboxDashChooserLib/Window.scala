package typings
package dropboxDashChooserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Dropbox: js.UndefOr[dropboxDashChooserLib.DropboxNs.Chooser] = js.undefined
}

object Window {
  @scala.inline
  def apply(Dropbox: dropboxDashChooserLib.DropboxNs.Chooser = null): Window = {
    val __obj = js.Dynamic.literal()
    if (Dropbox != null) __obj.updateDynamic("Dropbox")(Dropbox)
    __obj.asInstanceOf[Window]
  }
}

