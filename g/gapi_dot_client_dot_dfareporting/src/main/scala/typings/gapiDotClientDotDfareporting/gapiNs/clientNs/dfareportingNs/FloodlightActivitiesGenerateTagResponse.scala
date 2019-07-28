package typings.gapiDotClientDotDfareporting.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloodlightActivitiesGenerateTagResponse extends js.Object {
  /** Generated tag for this floodlight activity. */
  var floodlightActivityTag: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivitiesGenerateTagResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object FloodlightActivitiesGenerateTagResponse {
  @scala.inline
  def apply(floodlightActivityTag: String = null, kind: String = null): FloodlightActivitiesGenerateTagResponse = {
    val __obj = js.Dynamic.literal()
    if (floodlightActivityTag != null) __obj.updateDynamic("floodlightActivityTag")(floodlightActivityTag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[FloodlightActivitiesGenerateTagResponse]
  }
}

