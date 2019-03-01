package typings
package ejDotWebDotAllLib.ejNs.SpellCheckNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextClickEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the request type value.
    */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the selected option in the context menu.
    */
  var selectedOption: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the selected error word.
    */
  var selectedValue: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the input string.
    */
  var targetContent: js.UndefOr[java.lang.String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ContextClickEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[scala.Boolean] = js.undefined,
    model: Model = null,
    requestType: java.lang.String = null,
    selectedOption: java.lang.String = null,
    selectedValue: java.lang.String = null,
    targetContent: java.lang.String = null,
    `type`: java.lang.String = null
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

