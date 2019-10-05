package typings.ejDotWebDotAll.ej.DropDownTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseEventArgs extends js.Object {
  /** If the event has to be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** DropDownTreeView model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Selected item's text.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Event name
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** Selected item's value.
    */
  var value: js.UndefOr[String] = js.undefined
}

object CloseEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    text: String = null,
    `type`: String = null,
    value: String = null
  ): CloseEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (text != null) __obj.updateDynamic("text")(text)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CloseEventArgs]
  }
}

