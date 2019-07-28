package typings.discordDashRpc.discordDashRpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guild extends js.Object {
  var icon_url: js.UndefOr[String] = js.undefined
  var id: String
  var members: js.UndefOr[js.Array[_]] = js.undefined
  var name: String
}

object Guild {
  @scala.inline
  def apply(id: String, name: String, icon_url: String = null, members: js.Array[_] = null): Guild = {
    val __obj = js.Dynamic.literal(id = id, name = name)
    if (icon_url != null) __obj.updateDynamic("icon_url")(icon_url)
    if (members != null) __obj.updateDynamic("members")(members)
    __obj.asInstanceOf[Guild]
  }
}

