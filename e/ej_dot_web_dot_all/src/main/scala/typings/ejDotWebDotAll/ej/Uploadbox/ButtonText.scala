package typings.ejDotWebDotAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonText extends js.Object {
  /** Sets the text for the close button.
    */
  var Close: js.UndefOr[String] = js.undefined
  /** Sets the text for the browse button.
    */
  var browse: js.UndefOr[String] = js.undefined
  /** Sets the text for the cancel button.
    */
  var cancel: js.UndefOr[String] = js.undefined
  /** Sets the text for the Upload button inside the dialog popup.
    */
  var upload: js.UndefOr[String] = js.undefined
}

object ButtonText {
  @scala.inline
  def apply(Close: String = null, browse: String = null, cancel: String = null, upload: String = null): ButtonText = {
    val __obj = js.Dynamic.literal()
    if (Close != null) __obj.updateDynamic("Close")(Close.asInstanceOf[js.Any])
    if (browse != null) __obj.updateDynamic("browse")(browse.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonText]
  }
}

