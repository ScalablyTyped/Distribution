package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsShown extends js.Object {
  var isShown: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object AnonIsShown {
  @scala.inline
  def apply(isShown: js.UndefOr[Boolean] = js.undefined, text: String = null): AnonIsShown = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isShown)) __obj.updateDynamic("isShown")(isShown.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsShown]
  }
}

