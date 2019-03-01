package typings
package ejDotWebDotAllLib.ejNs.UploadboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonText extends js.Object {
  /** Sets the text for the close button.
    */
  var Close: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the text for the browse button.
    */
  var browse: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the text for the cancel button.
    */
  var cancel: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the text for the Upload button inside the dialog popup.
    */
  var upload: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonText {
  @scala.inline
  def apply(
    Close: java.lang.String = null,
    browse: java.lang.String = null,
    cancel: java.lang.String = null,
    upload: java.lang.String = null
  ): ButtonText = {
    val __obj = js.Dynamic.literal()
    if (Close != null) __obj.updateDynamic("Close")(Close)
    if (browse != null) __obj.updateDynamic("browse")(browse)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (upload != null) __obj.updateDynamic("upload")(upload)
    __obj.asInstanceOf[ButtonText]
  }
}

