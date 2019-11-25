package typings.ejDotWebDotAll.ej.DatePicker

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeDateCreateEventArgs extends js.Object {
  /** returns the currently created date object.
    */
  var date: js.UndefOr[js.Any] = js.undefined
  /** returns the current DOM object of the date from the Calendar.
    */
  var element: js.UndefOr[HTMLElement] = js.undefined
  /** returns the DatePicker model.
    */
  var model: js.UndefOr[typings.ejDotWebDotAll.ej.DatePicker.Model] = js.undefined
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
  /** returns the currently created date as string type.
    */
  var value: js.UndefOr[String] = js.undefined
}

object BeforeDateCreateEventArgs {
  @scala.inline
  def apply(
    date: js.Any = null,
    element: HTMLElement = null,
    model: typings.ejDotWebDotAll.ej.DatePicker.Model = null,
    `type`: String = null,
    value: String = null
  ): BeforeDateCreateEventArgs = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeDateCreateEventArgs]
  }
}

