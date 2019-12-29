package typings.ejDotWebDotAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragStopEventArgs extends js.Object {
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the action, which is performed after dropping the files (upload/ move).
    */
  var dropAction: js.UndefOr[String] = js.undefined
  /** returns the dragging file details
    */
  var fileInfo: js.UndefOr[js.Any] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the target element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of target element
    */
  var targetElementName: js.UndefOr[String] = js.undefined
  /** returns the path of target element.
    */
  var targetPath: js.UndefOr[String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DragStopEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    dropAction: String = null,
    fileInfo: js.Any = null,
    model: Model = null,
    target: js.Any = null,
    targetElementName: String = null,
    targetPath: String = null,
    `type`: String = null
  ): DragStopEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (dropAction != null) __obj.updateDynamic("dropAction")(dropAction.asInstanceOf[js.Any])
    if (fileInfo != null) __obj.updateDynamic("fileInfo")(fileInfo.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetElementName != null) __obj.updateDynamic("targetElementName")(targetElementName.asInstanceOf[js.Any])
    if (targetPath != null) __obj.updateDynamic("targetPath")(targetPath.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragStopEventArgs]
  }
}

