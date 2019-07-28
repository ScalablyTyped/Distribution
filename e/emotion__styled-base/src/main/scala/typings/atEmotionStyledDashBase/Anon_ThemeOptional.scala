package typings.atEmotionStyledDashBase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ThemeOptional[Theme /* <: js.Object */] extends js.Object {
  var theme: js.UndefOr[Theme] = js.undefined
}

object Anon_ThemeOptional {
  @scala.inline
  def apply[Theme /* <: js.Object */](theme: Theme = null): Anon_ThemeOptional[Theme] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ThemeOptional[Theme]]
  }
}

