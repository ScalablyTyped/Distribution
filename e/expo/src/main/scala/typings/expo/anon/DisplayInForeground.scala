package typings.expo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayInForeground extends js.Object {
  var _displayInForeground: js.UndefOr[Boolean] = js.undefined
  var sound: js.UndefOr[Boolean] = js.undefined
}

object DisplayInForeground {
  @scala.inline
  def apply(
    _displayInForeground: js.UndefOr[Boolean] = js.undefined,
    sound: js.UndefOr[Boolean] = js.undefined
  ): DisplayInForeground = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(_displayInForeground)) __obj.updateDynamic("_displayInForeground")(_displayInForeground.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sound)) __obj.updateDynamic("sound")(sound.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayInForeground]
  }
}

