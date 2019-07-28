package typings.ejDotWebDotAll.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeDownloadEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the downloaded file names.
    */
  var files: js.UndefOr[js.Array[String]] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.FileExplorerNs.Model] = js.undefined
  /** returns the path of currently opened item.
    */
  var path: js.UndefOr[String] = js.undefined
  /** returns the selected item details.
    */
  var selectedItems: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object BeforeDownloadEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    files: js.Array[String] = null,
    model: typings.ejDotWebDotAll.ejNs.FileExplorerNs.Model = null,
    path: String = null,
    selectedItems: js.Any = null,
    `type`: String = null
  ): BeforeDownloadEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (files != null) __obj.updateDynamic("files")(files)
    if (model != null) __obj.updateDynamic("model")(model)
    if (path != null) __obj.updateDynamic("path")(path)
    if (selectedItems != null) __obj.updateDynamic("selectedItems")(selectedItems)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BeforeDownloadEventArgs]
  }
}

