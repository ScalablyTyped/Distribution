package typings
package ejDotWebDotAllLib.ejNs.DateRangePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ChangeEventArgs extends js.Object {
  /** Set to true when the event has to be canceled, else false.
               */
  var cancel: js.UndefOr[scala.Boolean] = js.undefined
  /** returns the endDate of the DateRangePicker popup.
               */
  var endDate: js.UndefOr[js.Any] = js.undefined
  /** returns the DateRangePicker model.
               */
  var model: js.UndefOr[Model] = js.undefined
  /** returns the startDate of DateRangePicker.
               */
  var startDate: js.UndefOr[js.Any] = js.undefined
  /** returns the name of the event.
               */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** returns the DateRangePicker input value.
               */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

