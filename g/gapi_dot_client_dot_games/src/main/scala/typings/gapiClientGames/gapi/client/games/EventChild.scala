package typings.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventChild extends js.Object {
  /** The ID of the child event. */
  var childId: js.UndefOr[String] = js.native
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#eventChild. */
  var kind: js.UndefOr[String] = js.native
}

object EventChild {
  @scala.inline
  def apply(): EventChild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventChild]
  }
  @scala.inline
  implicit class EventChildOps[Self <: EventChild] (val x: Self) extends AnyVal {
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
    def setChildId(value: String): Self = this.set("childId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildId: Self = this.set("childId", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

