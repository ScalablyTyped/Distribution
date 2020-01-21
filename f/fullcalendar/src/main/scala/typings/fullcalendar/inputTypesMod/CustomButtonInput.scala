package typings.fullcalendar.inputTypesMod

import typings.fullcalendar.jqueryHooksMod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomButtonInput extends js.Object {
  var bootstrapFontAwesome: js.UndefOr[String] = js.undefined
  var bootstrapGlyphicon: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var text: String
  var themeIcon: js.UndefOr[String] = js.undefined
  def click(element: JQuery): Unit
}

object CustomButtonInput {
  @scala.inline
  def apply(
    click: JQuery => Unit,
    text: String,
    bootstrapFontAwesome: String = null,
    bootstrapGlyphicon: String = null,
    icon: String = null,
    themeIcon: String = null
  ): CustomButtonInput = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction1(click), text = text.asInstanceOf[js.Any])
    if (bootstrapFontAwesome != null) __obj.updateDynamic("bootstrapFontAwesome")(bootstrapFontAwesome.asInstanceOf[js.Any])
    if (bootstrapGlyphicon != null) __obj.updateDynamic("bootstrapGlyphicon")(bootstrapGlyphicon.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (themeIcon != null) __obj.updateDynamic("themeIcon")(themeIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomButtonInput]
  }
}

