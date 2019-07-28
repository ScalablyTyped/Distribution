package typings.ejDotWebDotAll.ejNs.SpellCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ejNs.SpellCheckNs.Model] = js.undefined
  /** Returns the request type value.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the selected option in the context menu.
    */
  var selectedOption: js.UndefOr[String] = js.undefined
  /** Returns the selected error word.
    */
  var selectedValue: js.UndefOr[String] = js.undefined
  /** Returns the input string.
    */
  var targetContent: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ContextClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ejNs.SpellCheckNs.Model = null,
    requestType: String = null,
    selectedOption: String = null,
    selectedValue: String = null,
    targetContent: String = null,
    `type`: String = null
  ): ContextClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (selectedOption != null) __obj.updateDynamic("selectedOption")(selectedOption)
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue)
    if (targetContent != null) __obj.updateDynamic("targetContent")(targetContent)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContextClickEventArgs]
  }
}

