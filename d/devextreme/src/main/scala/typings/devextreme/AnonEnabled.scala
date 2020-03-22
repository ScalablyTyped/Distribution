package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnabled extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var texts: js.UndefOr[AnonFix] = js.undefined
}

object AnonEnabled {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, texts: AnonFix = null): AnonEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (texts != null) __obj.updateDynamic("texts")(texts.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnabled]
  }
}

