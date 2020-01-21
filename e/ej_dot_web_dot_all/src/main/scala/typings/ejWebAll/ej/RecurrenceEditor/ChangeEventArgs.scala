package typings.ejWebAll.ej.RecurrenceEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** When set to true, event gets canceled.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the Recurrence Editor model
    */
  var model: js.UndefOr[Model] = js.undefined
  /** Returns the recurrence rule value.
    */
  var recurrenceRule: js.UndefOr[String] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ChangeEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    model: Model = null,
    recurrenceRule: String = null,
    `type`: String = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (recurrenceRule != null) __obj.updateDynamic("recurrenceRule")(recurrenceRule.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

