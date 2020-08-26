package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TurnBasedMatchSync extends js.Object {
  /** The matches. */
  var items: js.UndefOr[js.Array[TurnBasedMatch]] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#turnBasedMatchSync. */
  var kind: js.UndefOr[String] = js.native
  /** True if there were more matches available to fetch at the time the response was generated (which were not returned due to page size limits.) */
  var moreAvailable: js.UndefOr[Boolean] = js.native
  /** The pagination token for the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.native
}

object TurnBasedMatchSync {
  @scala.inline
  def apply(): TurnBasedMatchSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TurnBasedMatchSync]
  }
  @scala.inline
  implicit class TurnBasedMatchSyncOps[Self <: TurnBasedMatchSync] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: TurnBasedMatch*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[TurnBasedMatch]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMoreAvailable(value: Boolean): Self = this.set("moreAvailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMoreAvailable: Self = this.set("moreAvailable", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

