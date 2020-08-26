package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurnBasedMatchRematch extends js.Object {
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchRematch. */
  var kind: js.UndefOr[String] = js.native
  /** The old match that the rematch was created from; will be updated such that the rematchId field will point at the new match. */
  var previousMatch: js.UndefOr[TurnBasedMatch] = js.native
  /** The newly created match; a rematch of the old match with the same participants. */
  var rematch: js.UndefOr[TurnBasedMatch] = js.native
}

object TurnBasedMatchRematch {
  @scala.inline
  def apply(): TurnBasedMatchRematch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TurnBasedMatchRematch]
  }
  @scala.inline
  implicit class TurnBasedMatchRematchOps[Self <: TurnBasedMatchRematch] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPreviousMatch(value: TurnBasedMatch): Self = this.set("previousMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousMatch: Self = this.set("previousMatch", js.undefined)
    @scala.inline
    def setRematch(value: TurnBasedMatch): Self = this.set("rematch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRematch: Self = this.set("rematch", js.undefined)
  }
  
}

