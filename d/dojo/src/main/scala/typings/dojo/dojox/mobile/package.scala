package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mobile {
  type Accordion = Accordion_
  type Carousel = Carousel_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/DatePicker.html
    *
    * A wrapper widget around SpinWheelDatePicker or ValuePickerDatePicker.
    * It should be used with the automatic theme loader, dojox/mobile/deviceTheme.
    * Returns ValuePickerDatePicker when the current theme is "android" or "holodark".
    * Returns SpinWheelDatePicker otherwise.
    *
    */
  type DatePicker = js.Function0[Unit]
  type ListItem = ListItem_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/TimePicker.html
    *
    * A wrapper widget around SpinWheelTimePicker or ValuePickerTimePicker.
    * Returns ValuePickerTimePicker when the current theme is "android" or "holodark".
    * Returns SpinWheelTimePicker otherwise.
    *
    */
  type TimePicker = js.Function0[Unit]
  type i18n = i18n_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/pageTurningUtils.html
    *
    * Utilities to provide page turning effects just like turning a real book.
    *
    */
  type pageTurningUtils = js.Function0[Unit]
  type viewRegistry = viewRegistry_
}
