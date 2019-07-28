package typings.expo

import typings.expo.expoStrings.`dark-content`
import typings.expo.expoStrings.`light-content`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BackgroundColor extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var barStyle: js.UndefOr[`light-content` | `dark-content`] = js.undefined
}

object Anon_BackgroundColor {
  @scala.inline
  def apply(backgroundColor: String = null, barStyle: `light-content` | `dark-content` = null): Anon_BackgroundColor = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (barStyle != null) __obj.updateDynamic("barStyle")(barStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BackgroundColor]
  }
}

