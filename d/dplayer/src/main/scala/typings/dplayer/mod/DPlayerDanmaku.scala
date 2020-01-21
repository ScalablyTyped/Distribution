package typings.dplayer.mod

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
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (addition != null) __obj.updateDynamic("addition")(addition.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (maximum != null) __obj.updateDynamic("maximum")(maximum.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (!js.isUndefined(unlimited)) __obj.updateDynamic("unlimited")(unlimited.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[DPlayerDanmaku]
  }
}

