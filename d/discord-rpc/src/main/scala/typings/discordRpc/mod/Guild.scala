package typings.discordRpc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Guild extends js.Object {
  var icon_url: js.UndefOr[String] = js.native
  var id: String = js.native
  var members: js.UndefOr[js.Array[_]] = js.native
  var name: String = js.native
}

object Guild {
  @scala.inline
  def apply(id: String, name: String): Guild = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guild]
  }
  @scala.inline
  implicit class GuildOps[Self <: Guild] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon_url(value: String): Self = this.set("icon_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon_url: Self = this.set("icon_url", js.undefined)
    @scala.inline
    def setMembersVarargs(value: js.Any*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[_]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
  }
  
}

