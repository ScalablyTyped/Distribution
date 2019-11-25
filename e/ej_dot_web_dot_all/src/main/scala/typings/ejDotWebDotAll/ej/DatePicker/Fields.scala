package typings.ejDotWebDotAll.ej.DatePicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  /** Specifies the CSS class to customize the date.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies the specials dates
    */
  var date: js.UndefOr[String] = js.undefined
  /** Specifies the icon class to special dates.
    */
  var iconClass: js.UndefOr[String] = js.undefined
  /** Specifies the tooltip to special dates.
    */
  var tooltip: js.UndefOr[String] = js.undefined
}

object Fields {
  @scala.inline
  def apply(cssClass: String = null, date: String = null, iconClass: String = null, tooltip: String = null): Fields = {
    val __obj = js.Dynamic.literal()
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

