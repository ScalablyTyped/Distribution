package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeUploadEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the path of currently opened item.
    */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** returns the selected item details.
    */
  var selectedItems: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the upload item details.
    */
  var uploadItemDetails: js.UndefOr[js.Any] = js.undefined
}

object BeforeUploadEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    path: java.lang.String = null,
    selectedItems: js.Any = null,
    `type`: java.lang.String = null,
    uploadItemDetails: js.Any = null
  ): BeforeUploadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (path != null) __obj.updateDynamic("path")(path)
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (uploadItemDetails != null) __obj.updateDynamic("uploadItemDetails")(uploadItemDetails)
    __obj.asInstanceOf[BeforeUploadEventArgs]
  }
}

