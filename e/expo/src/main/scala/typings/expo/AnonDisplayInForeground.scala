package typings.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayInForeground extends js.Object {
  var _displayInForeground: js.UndefOr[Boolean] = js.undefined
  var sound: js.UndefOr[Boolean] = js.undefined
}

object AnonDisplayInForeground {
  @scala.inline
  def apply(
    _displayInForeground: js.UndefOr[Boolean] = js.undefined,
    sound: js.UndefOr[Boolean] = js.undefined
  ): AnonDisplayInForeground = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_displayInForeground)) __obj.updateDynamic("_displayInForeground")(_displayInForeground.asInstanceOf[js.Any])
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayInForeground]
  }
}

