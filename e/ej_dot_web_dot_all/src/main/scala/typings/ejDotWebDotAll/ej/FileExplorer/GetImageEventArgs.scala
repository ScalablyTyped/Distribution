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
  var model: js.UndefOr[Model] = js.undefined
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
    model: Model = null,
    originalArgs: js.Any = null,
    path: String = null,
    `type`: String = null
  ): GetImageEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (originalArgs != null) __obj.updateDynamic("originalArgs")(originalArgs.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetImageEventArgs]
  }
}

