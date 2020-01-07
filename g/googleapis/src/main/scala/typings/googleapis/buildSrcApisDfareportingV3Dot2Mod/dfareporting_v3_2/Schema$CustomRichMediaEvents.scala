package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Custom Rich Media Events group.
  */
@js.native
trait Schema$CustomRichMediaEvents extends js.Object {
  /**
    * List of custom rich media event IDs. Dimension values must be all of type
    * dfa:richMediaEventTypeIdAndName.
    */
  var filteredEventIds: js.UndefOr[js.Array[Schema$DimensionValue]] = js.native
  /**
    * The kind of resource this is, in this case
    * dfareporting#customRichMediaEvents.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$CustomRichMediaEvents {
  @scala.inline
  def apply(filteredEventIds: js.Array[Schema$DimensionValue] = null, kind: String = null): Schema$CustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    if (filteredEventIds != null) __obj.updateDynamic("filteredEventIds")(filteredEventIds.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomRichMediaEvents]
  }
}

