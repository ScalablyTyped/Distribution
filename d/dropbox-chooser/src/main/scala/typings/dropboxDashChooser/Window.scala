package typings.dropboxDashChooser

import typings.dropboxDashChooser.DropboxNs.Chooser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Dropbox: js.UndefOr[Chooser] = js.undefined
}

object Window {
  @scala.inline
  def apply(Dropbox: Chooser = null): Window = {
    val __obj = js.Dynamic.literal()
    if (Dropbox != null) __obj.updateDynamic("Dropbox")(Dropbox)
    __obj.asInstanceOf[Window]
  }
}

