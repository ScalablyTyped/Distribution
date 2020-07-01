package typings.emotionStyledBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeTheme[Theme /* <: js.Object */] extends js.Object {
  var theme: js.UndefOr[Theme] = js.undefined
}

object ThemeTheme {
  @scala.inline
  def apply[/* <: js.Object */ Theme](theme: Theme = null): ThemeTheme[Theme] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeTheme[Theme]]
  }
}

