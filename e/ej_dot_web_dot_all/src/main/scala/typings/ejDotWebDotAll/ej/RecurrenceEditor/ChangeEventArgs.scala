package typings.ejDotWebDotAll.ej.RecurrenceEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeEventArgs extends js.Object {
  /** When set to true, event gets canceled.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the Recurrence Editor model
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.RecurrenceEditor.Model] = js.undefined
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
    model: typings.ejDotWebDotAll.ej.RecurrenceEditor.Model = null,
    recurrenceRule: String = null,
    `type`: String = null
  ): ChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (model != null) __obj.updateDynamic("model")(model)
    if (recurrenceRule != null) __obj.updateDynamic("recurrenceRule")(recurrenceRule)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChangeEventArgs]
  }
}

