package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragStopEventArgs extends js.Object {
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the action, which is performed after dropping the files (upload/ move).
    */
  var dropAction: js.UndefOr[java.lang.String] = js.undefined
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
  var targetElementName: js.UndefOr[java.lang.String] = js.undefined
  /** returns the path of target element.
    */
  var targetPath: js.UndefOr[java.lang.String] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DragStopEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    dropAction: java.lang.String = null,
    fileInfo: js.Any = null,
    model: Model = null,
    target: js.Any = null,
    targetElementName: java.lang.String = null,
    targetPath: java.lang.String = null,
    `type`: java.lang.String = null
  ): DragStopEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (dropAction != null) __obj.updateDynamic("dropAction")(dropAction)
    if (fileInfo != null) __obj.updateDynamic("fileInfo")(fileInfo)
    if (model != null) __obj.updateDynamic("model")(model)
    if (target != null) __obj.updateDynamic("target")(target)
    if (targetElementName != null) __obj.updateDynamic("targetElementName")(targetElementName)
    if (targetPath != null) __obj.updateDynamic("targetPath")(targetPath)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DragStopEventArgs]
  }
}

