package typings.emotionStyledBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThemeOptional[Theme /* <: js.Object */] extends js.Object {
  var theme: js.UndefOr[Theme] = js.undefined
}

object AnonThemeOptional {
  @scala.inline
  def apply[Theme /* <: js.Object */](theme: Theme = null): AnonThemeOptional[Theme] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonThemeOptional[Theme]]
  }
}

