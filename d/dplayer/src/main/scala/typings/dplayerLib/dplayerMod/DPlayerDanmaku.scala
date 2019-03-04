package typings
package dplayerLib.dplayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerDanmaku extends js.Object {
  var addition: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var api: java.lang.String
  var bottom: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var maximum: js.UndefOr[java.lang.String] = js.undefined
  var token: js.UndefOr[java.lang.String] = js.undefined
  var unlimited: js.UndefOr[scala.Boolean] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
}

object DPlayerDanmaku {
  @scala.inline
  def apply(
    api: java.lang.String,
    id: java.lang.String,
    addition: js.Array[java.lang.String] = null,
    bottom: java.lang.String = null,
    maximum: java.lang.String = null,
    token: java.lang.String = null,
    unlimited: js.UndefOr[scala.Boolean] = js.undefined,
    user: java.lang.String = null
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

