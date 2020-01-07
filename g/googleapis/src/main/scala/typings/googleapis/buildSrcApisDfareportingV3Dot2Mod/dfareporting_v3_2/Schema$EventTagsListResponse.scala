package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event Tag List Response
  */
@js.native
trait Schema$EventTagsListResponse extends js.Object {
  /**
    * Event tag collection.
    */
  var eventTags: js.UndefOr[js.Array[Schema$EventTag]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#eventTagsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$EventTagsListResponse {
  @scala.inline
  def apply(eventTags: js.Array[Schema$EventTag] = null, kind: String = null): Schema$EventTagsListResponse = {
    val __obj = js.Dynamic.literal()
    if (eventTags != null) __obj.updateDynamic("eventTags")(eventTags.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$EventTagsListResponse]
  }
}

