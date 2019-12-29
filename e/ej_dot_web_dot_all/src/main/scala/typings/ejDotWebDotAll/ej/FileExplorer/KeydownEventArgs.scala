package typings.ejDotWebDotAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeydownEventArgs extends js.Object {
  /** returns altKey value.
    */
  var altKey: js.UndefOr[Boolean] = js.undefined
  /** Set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** returns ctrlKey value.
    */
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  /** returns the downed key keyCode value
    */
  var keyCode: js.UndefOr[Double] = js.undefined
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the event object.
    */
  var originalArgs: js.UndefOr[js.Any] = js.undefined
  /** returns shiftKey value.
    */
  var shiftKey: js.UndefOr[Boolean] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object KeydownEventArgs {
  @scala.inline
  def apply(
    altKey: js.UndefOr[Boolean] = js.undefined,
    cancel: js.UndefOr[Boolean] = js.undefined,
    ctrlKey: js.UndefOr[Boolean] = js.undefined,
    keyCode: Int | Double = null,
    model: Model = null,
    originalArgs: js.Any = null,
    shiftKey: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null
  ): KeydownEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altKey)) __obj.updateDynamic("altKey")(altKey.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (!js.isUndefined(ctrlKey)) __obj.updateDynamic("ctrlKey")(ctrlKey.asInstanceOf[js.Any])
    if (keyCode != null) __obj.updateDynamic("keyCode")(keyCode.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (originalArgs != null) __obj.updateDynamic("originalArgs")(originalArgs.asInstanceOf[js.Any])
    if (!js.isUndefined(shiftKey)) __obj.updateDynamic("shiftKey")(shiftKey.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeydownEventArgs]
  }
}

