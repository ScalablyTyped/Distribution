package typings
package ejDotWebDotAllLib.ejNs.FileExplorerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeydownEventArgs extends js.Object {
  /** returns altKey value.
    */
  var altKey: js.UndefOr[scala.Boolean] = js.undefined
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns ctrlKey value.
    */
  var ctrlKey: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the downed key keyCode value
    */
  var keyCode: js.UndefOr[scala.Double] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the event object.
    */
  var originalArgs: js.UndefOr[js.Any] = js.undefined
  /** returns shiftKey value.
    */
  var shiftKey: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object KeydownEventArgs {
  @scala.inline
  def apply(
    altKey: js.UndefOr[scala.Boolean] = js.undefined,
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    ctrlKey: js.UndefOr[scala.Boolean] = js.undefined,
    keyCode: scala.Int | scala.Double = null,
    model: Model = null,
    originalArgs: js.Any = null,
    shiftKey: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null
  ): KeydownEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey)
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey)
    if (keyCode != null) __obj.updateDynamic("keyCode")(keyCode.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model)
    if (originalArgs != null) __obj.updateDynamic("originalArgs")(originalArgs)
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[KeydownEventArgs]
  }
}

