package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTagsListResponse extends js.Object {
  /** Event tag collection. */
  var eventTags: js.UndefOr[js.Array[EventTag]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#eventTagsListResponse". */
  var kind: js.UndefOr[String] = js.native
}

object EventTagsListResponse {
  @scala.inline
  def apply(): EventTagsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTagsListResponse]
  }
  @scala.inline
  implicit class EventTagsListResponseOps[Self <: EventTagsListResponse] (val x: Self) extends AnyVal {
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
    def setEventTagsVarargs(value: EventTag*): Self = this.set("eventTags", js.Array(value :_*))
    @scala.inline
    def setEventTags(value: js.Array[EventTag]): Self = this.set("eventTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTags: Self = this.set("eventTags", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

