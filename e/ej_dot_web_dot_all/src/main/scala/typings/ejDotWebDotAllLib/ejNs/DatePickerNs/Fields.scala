package typings
package ejDotWebDotAllLib.ejNs.DatePickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Specifies the CSS class to customize the date.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the specials dates
    */
  var date: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the icon class to special dates.
    */
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the tooltip to special dates.
    */
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(
    cssClass: java.lang.String = null,
    date: java.lang.String = null,
    iconClass: java.lang.String = null,
    tooltip: java.lang.String = null
  ): Fields = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (date != null) __obj.updateDynamic("date")(date)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[Fields]
  }
}

