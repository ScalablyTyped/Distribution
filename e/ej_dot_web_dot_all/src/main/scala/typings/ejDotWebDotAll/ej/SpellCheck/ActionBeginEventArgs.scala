package typings.ejDotWebDotAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBeginEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the misspellWordCss class name.
    */
  var misspellWordCss: js.UndefOr[String] = js.undefined
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.SpellCheck.Model] = js.undefined
  /** Returns the request type value.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the input string.
    */
  var targetSentence: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ActionBeginEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    misspellWordCss: String = null,
    model: typings.ejDotWebDotAll.ej.SpellCheck.Model = null,
    requestType: String = null,
    targetSentence: String = null,
    `type`: String = null
  ): ActionBeginEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (misspellWordCss != null) __obj.updateDynamic("misspellWordCss")(misspellWordCss)
    if (model != null) __obj.updateDynamic("model")(model)
    if (requestType != null) __obj.updateDynamic("requestType")(requestType)
    if (targetSentence != null) __obj.updateDynamic("targetSentence")(targetSentence)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionBeginEventArgs]
  }
}

