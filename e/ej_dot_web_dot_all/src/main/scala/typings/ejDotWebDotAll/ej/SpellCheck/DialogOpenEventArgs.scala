package typings.ejDotWebDotAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogOpenEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.SpellCheck.Model] = js.undefined
  /** Returns the request type value.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the target input.
    */
  var targetText: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DialogOpenEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: typings.ejDotWebDotAll.ej.SpellCheck.Model = null,
    requestType: String = null,
    targetText: String = null,
    `type`: String = null
  ): DialogOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (targetText != null) __obj.updateDynamic("targetText")(targetText)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DialogOpenEventArgs]
  }
}

