package typings
package ejDotWebDotAllLib.ejNs.DateTimePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonText extends js.Object {
  /** Sets the text for the Done button inside the datetime popup.
    */
  var done: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the text for the Now button inside the datetime popup.
    */
  var timeNow: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the header text for the Time dropdown.
    */
  var timeTitle: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the text for the Today button inside the datetime popup.
    */
  var today: js.UndefOr[java.lang.String] = js.undefined
}

object ButtonText {
  @scala.inline
  def apply(
    done: java.lang.String = null,
    timeNow: java.lang.String = null,
    timeTitle: java.lang.String = null,
    today: java.lang.String = null
  ): ButtonText = {
    val __obj = js.Dynamic.literal()
    if (done != null) __obj.updateDynamic("done")(done)
    if (timeNow != null) __obj.updateDynamic("timeNow")(timeNow)
    if (timeTitle != null) __obj.updateDynamic("timeTitle")(timeTitle)
    if (today != null) __obj.updateDynamic("today")(today)
    __obj.asInstanceOf[ButtonText]
  }
}

