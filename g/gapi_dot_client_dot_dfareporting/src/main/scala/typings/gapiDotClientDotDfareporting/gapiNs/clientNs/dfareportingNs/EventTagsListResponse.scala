package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTagsListResponse extends js.Object {
  /** Event tag collection. */
  var eventTags: js.UndefOr[js.Array[EventTag]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#eventTagsListResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object EventTagsListResponse {
  @scala.inline
  def apply(eventTags: js.Array[EventTag] = null, kind: String = null): EventTagsListResponse = {
    val __obj = js.Dynamic.literal()
    if (eventTags != null) __obj.updateDynamic("eventTags")(eventTags)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[EventTagsListResponse]
  }
}

