package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DialogMessage extends js.Object {
  /** The message to display to a user when being asked to confirm removal of the extension. */
  var dialogMessage: js.UndefOr[String] = js.undefined
  /** Whether or not a confirm-uninstall dialog should prompt the user. Defaults to false. */
  var showConfirmDialog: js.UndefOr[Boolean] = js.undefined
}

object Anon_DialogMessage {
  @scala.inline
  def apply(dialogMessage: String = null, showConfirmDialog: js.UndefOr[Boolean] = js.undefined): Anon_DialogMessage = {
    val __obj = js.Dynamic.literal()
    if (dialogMessage != null) __obj.updateDynamic("dialogMessage")(dialogMessage)
    if (!js.isUndefined(showConfirmDialog)) __obj.updateDynamic("showConfirmDialog")(showConfirmDialog)
    __obj.asInstanceOf[Anon_DialogMessage]
  }
}

