package typings
package fullcalendarLib.srcTypesInputDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomButtonInput extends js.Object {
  var bootstrapFontAwesome: js.UndefOr[java.lang.String] = js.undefined
  var bootstrapGlyphicon: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var themeIcon: js.UndefOr[java.lang.String] = js.undefined
  def click(element: fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery): scala.Unit
}

object CustomButtonInput {
  @scala.inline
  def apply(
    click: js.Function1[fullcalendarLib.srcTypesJqueryDashHooksMod.Global.JQuery, scala.Unit],
    text: java.lang.String,
    bootstrapFontAwesome: java.lang.String = null,
    bootstrapGlyphicon: java.lang.String = null,
    icon: java.lang.String = null,
    themeIcon: java.lang.String = null
  ): CustomButtonInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("click")(click)
    __obj.updateDynamic("text")(text)
    if (bootstrapFontAwesome != null) __obj.updateDynamic("bootstrapFontAwesome")(bootstrapFontAwesome)
    if (bootstrapGlyphicon != null) __obj.updateDynamic("bootstrapGlyphicon")(bootstrapGlyphicon)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (themeIcon != null) __obj.updateDynamic("themeIcon")(themeIcon)
    __obj.asInstanceOf[CustomButtonInput]
  }
}

