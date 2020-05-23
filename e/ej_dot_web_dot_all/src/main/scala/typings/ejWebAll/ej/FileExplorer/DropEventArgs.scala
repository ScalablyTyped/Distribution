package typings.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropEventArgs extends js.Object {
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns the action, which is performed after dropping the files (upload/ move).
    */
  var dropAction: js.UndefOr[String] = js.undefined
  /** returns the dragging element details.
    */
  var fileInfo: js.UndefOr[js.Any] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the target element.
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** returns the name of target folder.
    */
  var targetFolder: js.UndefOr[String] = js.undefined
  /** returns the path of target folder.
    */
  var targetPath: js.UndefOr[String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DropEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    dropAction: String = null,
    fileInfo: js.Any = null,
    model: Model = null,
    target: js.Any = null,
    targetFolder: String = null,
    targetPath: String = null,
    `type`: String = null
  ): DropEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (dropAction != null) __obj.updateDynamic("dropAction")(dropAction.asInstanceOf[js.Any])
    if (fileInfo != null) __obj.updateDynamic("fileInfo")(fileInfo.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (targetFolder != null) __obj.updateDynamic("targetFolder")(targetFolder.asInstanceOf[js.Any])
    if (targetPath != null) __obj.updateDynamic("targetPath")(targetPath.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropEventArgs]
  }
}

