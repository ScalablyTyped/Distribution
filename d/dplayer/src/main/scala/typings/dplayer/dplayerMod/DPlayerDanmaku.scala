package typings.dplayer.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerDanmaku extends js.Object {
  var addition: js.UndefOr[js.Array[String]] = js.undefined
  var api: String
  var bottom: js.UndefOr[String] = js.undefined
  var id: String
  var maximum: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var unlimited: js.UndefOr[Boolean] = js.undefined
  var user: js.UndefOr[String] = js.undefined
}

object DPlayerDanmaku {
  @scala.inline
  def apply(
    api: String,
    id: String,
    addition: js.Array[String] = null,
    bottom: String = null,
    maximum: String = null,
    token: String = null,
    unlimited: js.UndefOr[Boolean] = js.undefined,
    user: String = null
  ): DPlayerDanmaku = {
    val __obj = js.Dynamic.literal(api = api, id = id)
    if (addition != null) __obj.updateDynamic("addition")(addition)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom)
    if (maximum != null) __obj.updateDynamic("maximum")(maximum)
    if (token != null) __obj.updateDynamic("token")(token)
    if (!js.isUndefined(unlimited)) __obj.updateDynamic("unlimited")(unlimited)
    if (user != null) __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[DPlayerDanmaku]
  }
}

