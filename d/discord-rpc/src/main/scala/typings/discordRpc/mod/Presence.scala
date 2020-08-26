package typings.discordRpc.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Presence extends js.Object {
  var details: js.UndefOr[String] = js.native
  var endTimestamp: js.UndefOr[Double | Date] = js.native
  var instance: js.UndefOr[Boolean] = js.native
  var joinSecret: js.UndefOr[String] = js.native
  var largeImageKey: js.UndefOr[String] = js.native
  var largeImageText: js.UndefOr[String] = js.native
  var matchSecret: js.UndefOr[String] = js.native
  var partyMax: js.UndefOr[Double] = js.native
  var partySize: js.UndefOr[Double] = js.native
  var smallImageKey: js.UndefOr[String] = js.native
  var smallImageText: js.UndefOr[String] = js.native
  var spectateSecret: js.UndefOr[String] = js.native
  var startTimestamp: js.UndefOr[Double | Date] = js.native
  var state: js.UndefOr[String] = js.native
}

object Presence {
  @scala.inline
  def apply(): Presence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Presence]
  }
  @scala.inline
  implicit class PresenceOps[Self <: Presence] (val x: Self) extends AnyVal {
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
    def setDetails(value: String): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setEndTimestamp(value: Double | Date): Self = this.set("endTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTimestamp: Self = this.set("endTimestamp", js.undefined)
    @scala.inline
    def setInstance(value: Boolean): Self = this.set("instance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    @scala.inline
    def setJoinSecret(value: String): Self = this.set("joinSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJoinSecret: Self = this.set("joinSecret", js.undefined)
    @scala.inline
    def setLargeImageKey(value: String): Self = this.set("largeImageKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargeImageKey: Self = this.set("largeImageKey", js.undefined)
    @scala.inline
    def setLargeImageText(value: String): Self = this.set("largeImageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLargeImageText: Self = this.set("largeImageText", js.undefined)
    @scala.inline
    def setMatchSecret(value: String): Self = this.set("matchSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchSecret: Self = this.set("matchSecret", js.undefined)
    @scala.inline
    def setPartyMax(value: Double): Self = this.set("partyMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartyMax: Self = this.set("partyMax", js.undefined)
    @scala.inline
    def setPartySize(value: Double): Self = this.set("partySize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartySize: Self = this.set("partySize", js.undefined)
    @scala.inline
    def setSmallImageKey(value: String): Self = this.set("smallImageKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallImageKey: Self = this.set("smallImageKey", js.undefined)
    @scala.inline
    def setSmallImageText(value: String): Self = this.set("smallImageText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmallImageText: Self = this.set("smallImageText", js.undefined)
    @scala.inline
    def setSpectateSecret(value: String): Self = this.set("spectateSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpectateSecret: Self = this.set("spectateSecret", js.undefined)
    @scala.inline
    def setStartTimestamp(value: Double | Date): Self = this.set("startTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimestamp: Self = this.set("startTimestamp", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

