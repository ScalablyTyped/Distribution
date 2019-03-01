package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeGetImageEventArgs extends js.Object {
  /** enable or disable the image compress option.
    */
  var canCompress: js.UndefOr[scala.Boolean] = js.undefined
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the selected item details.
    */
  var selectedItems: js.UndefOr[js.Any] = js.undefined
  /** returns the expected image size.
    */
  var size: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object BeforeGetImageEventArgs {
  @scala.inline
  def apply(
    canCompress: js.UndefOr[scala.Boolean] = js.undefined,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    selectedItems: js.Any = null,
    size: js.Any = null,
    `type`: java.lang.String = null
  ): BeforeGetImageEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canCompress)) __obj.updateDynamic("canCompress")(canCompress)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems)
    if (size != null) __obj.updateDynamic("size")(size)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeGetImageEventArgs]
  }
}

