package typings.ejDotWebDotAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImageEventArgs extends js.Object {
  /** returns the action type, which specifies thumbnail preview or opening image.
    */
  var action: js.UndefOr[String] = js.undefined
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** loaded image element
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.FileExplorer.Model] = js.undefined
  /** original arguments of image load or error event
    */
  var originalArgs: js.UndefOr[js.Any] = js.undefined
  /** loaded image path.
    */
  var path: js.UndefOr[String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object GetImageEventArgs {
  @scala.inline
  def apply(
    action: String = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    element: js.Any = null,
    model: typings.ejDotWebDotAll.ej.FileExplorer.Model = null,
    originalArgs: js.Any = null,
    path: String = null,
    `type`: String = null
  ): GetImageEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (element != null) __obj.updateDynamic("element")(element)
    if (model != null) __obj.updateDynamic("model")(model)
    if (originalArgs != null) __obj.updateDynamic("originalArgs")(originalArgs)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GetImageEventArgs]
  }
}

