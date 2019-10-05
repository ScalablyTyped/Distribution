package typings.ejDotWebDotAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFileDetails extends js.Object {
  /** Enables the file upload interactions like remove/cancel in File details of the dialog popup.
    */
  var action: js.UndefOr[Boolean] = js.undefined
  /** Enables the name in the File details of the dialog popup.
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the File size details of the dialog popup.
    */
  var size: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the file uploading status visibility in the dialog file details content.
    */
  var status: js.UndefOr[Boolean] = js.undefined
  /** Enables the title in File details for the dialog popup.
    */
  var title: js.UndefOr[Boolean] = js.undefined
}

object CustomFileDetails {
  @scala.inline
  def apply(
    action: js.UndefOr[Boolean] = js.undefined,
    name: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Boolean] = js.undefined,
    status: js.UndefOr[Boolean] = js.undefined,
    title: js.UndefOr[Boolean] = js.undefined
  ): CustomFileDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(action)) __obj.updateDynamic("action")(action)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status)
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[CustomFileDetails]
  }
}

