package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mobile {
  type Accordion = typings.dojo.dojox.mobile.Accordion_
  type Carousel = typings.dojo.dojox.mobile.Carousel_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/DatePicker.html
    *
    * A wrapper widget around SpinWheelDatePicker or ValuePickerDatePicker.
    * It should be used with the automatic theme loader, dojox/mobile/deviceTheme.
    * Returns ValuePickerDatePicker when the current theme is "android" or "holodark".
    * Returns SpinWheelDatePicker otherwise.
    *
    */
  type DatePicker = js.Function0[scala.Unit]
  type ListItem = typings.dojo.dojox.mobile.ListItem_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/TimePicker.html
    *
    * A wrapper widget around SpinWheelTimePicker or ValuePickerTimePicker.
    * Returns ValuePickerTimePicker when the current theme is "android" or "holodark".
    * Returns SpinWheelTimePicker otherwise.
    *
    */
  type TimePicker = js.Function0[scala.Unit]
  type i18n = typings.dojo.dojox.mobile.i18n_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/pageTurningUtils.html
    *
    * Utilities to provide page turning effects just like turning a real book.
    *
    */
  type pageTurningUtils = js.Function0[scala.Unit]
  type viewRegistry = typings.dojo.dojox.mobile.viewRegistry_
}
