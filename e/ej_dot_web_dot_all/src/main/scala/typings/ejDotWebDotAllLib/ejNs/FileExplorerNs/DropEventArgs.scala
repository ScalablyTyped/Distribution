package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropEventArgs extends js.Object {
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the action, which is performed after dropping the files (upload/ move).
    */
  var dropAction: js.UndefOr[java.lang.String] = js.undefined
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
  var targetFolder: js.UndefOr[java.lang.String] = js.undefined
  /** returns the path of target folder.
    */
  var targetPath: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DropEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    dropAction: java.lang.String = null,
    fileInfo: js.Any = null,
    model: Model = null,
    target: js.Any = null,
    targetFolder: java.lang.String = null,
    targetPath: java.lang.String = null,
    `type`: java.lang.String = null
  ): DropEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (dropAction != null) __obj.updateDynamic("dropAction")(dropAction)
    if (fileInfo != null) __obj.updateDynamic("fileInfo")(fileInfo)
    if (model != null) __obj.updateDynamic("model")(model)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetFolder != null) __obj.updateDynamic("targetFolder")(targetFolder)
    if (targetPath != null) __obj.updateDynamic("targetPath")(targetPath)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DropEventArgs]
  }
}

