package typings.ejDotWebDotAll.ej.SpellCheck

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogBeforeOpenEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the SpellCheck model.
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the request type value.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the spell check window details.
    */
  var spellCheckDialog: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object DialogBeforeOpenEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    requestType: String = null,
    spellCheckDialog: js.Any = null,
    `type`: String = null
  ): DialogBeforeOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (spellCheckDialog != null) __obj.updateDynamic("spellCheckDialog")(spellCheckDialog.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogBeforeOpenEventArgs]
  }
}

