package typings.ejDotWebDotAll.ejNs.UploadboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogAction extends js.Object {
  /** Once uploaded successfully, the dialog popup closes immediately.
    */
  var closeOnComplete: js.UndefOr[Boolean] = js.undefined
  /** Sets the content container option to the Uploadbox dialog popup.
    */
  var content: js.UndefOr[String] = js.undefined
  /** Enables the drag option to the dialog popup.
    */
  var drag: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the Uploadbox dialogâ€™s modal property to the dialog popup.
    */
  var modal: js.UndefOr[Boolean] = js.undefined
}

object DialogAction {
  @scala.inline
  def apply(
    closeOnComplete: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    drag: js.UndefOr[Boolean] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined
  ): DialogAction = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOnComplete)) __obj.updateDynamic("closeOnComplete")(closeOnComplete)
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(drag)) __obj.updateDynamic("drag")(drag)
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    __obj.asInstanceOf[DialogAction]
  }
}

