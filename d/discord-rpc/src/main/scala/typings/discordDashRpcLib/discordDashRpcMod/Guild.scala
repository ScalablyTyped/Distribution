package typings
package discordDashRpcLib.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guild extends js.Object {
  var icon_url: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var members: js.UndefOr[js.Array[_]] = js.undefined
  var name: java.lang.String
}

object Guild {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    icon_url: java.lang.String = null,
    members: js.Array[_] = null
  ): Guild = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    if (icon_url != null) __obj.updateDynamic("icon_url")(icon_url)
    if (members != null) __obj.updateDynamic("members")(members)
    __obj.asInstanceOf[Guild]
  }
}

