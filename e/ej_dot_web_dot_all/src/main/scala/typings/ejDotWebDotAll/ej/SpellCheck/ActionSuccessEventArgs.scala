package typings.ejDotWebDotAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionSuccessEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the error word details of the given input.
    */
  var errorWordDetails: js.UndefOr[js.Any] = js.undefined
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.SpellCheck.Model] = js.undefined
  /** Returns the request type value.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the error word highlighted string.
    */
  var resultHTML: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ActionSuccessEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    errorWordDetails: js.Any = null,
    model: typings.ejDotWebDotAll.ej.SpellCheck.Model = null,
    requestType: String = null,
    resultHTML: String = null,
    `type`: String = null
  ): ActionSuccessEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (errorWordDetails != null) __obj.updateDynamic("errorWordDetails")(errorWordDetails)
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (resultHTML != null) __obj.updateDynamic("resultHTML")(resultHTML)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionSuccessEventArgs]
  }
}

