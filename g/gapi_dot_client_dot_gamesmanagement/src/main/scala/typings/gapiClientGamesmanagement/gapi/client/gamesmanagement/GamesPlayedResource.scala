package typings.gapiClientGamesmanagement.gapi.client.gamesmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GamesPlayedResource extends js.Object {
  /** True if the player was auto-matched with the currently authenticated user. */
  var autoMatched: js.UndefOr[Boolean] = js.native
  /** The last time the player played the game in milliseconds since the epoch in UTC. */
  var timeMillis: js.UndefOr[String] = js.native
}

object GamesPlayedResource {
  @scala.inline
  def apply(): GamesPlayedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamesPlayedResource]
  }
  @scala.inline
  implicit class GamesPlayedResourceOps[Self <: GamesPlayedResource] (val x: Self) extends AnyVal {
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
    def setAutoMatched(value: Boolean): Self = this.set("autoMatched", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoMatched: Self = this.set("autoMatched", js.undefined)
    @scala.inline
    def setTimeMillis(value: String): Self = this.set("timeMillis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeMillis: Self = this.set("timeMillis", js.undefined)
  }
  
}

