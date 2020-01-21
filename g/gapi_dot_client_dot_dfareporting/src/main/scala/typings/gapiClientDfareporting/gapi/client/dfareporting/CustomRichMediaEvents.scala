package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomRichMediaEvents extends js.Object {
  /** List of custom rich media event IDs. Dimension values must be all of type dfa:richMediaEventTypeIdAndName. */
  var filteredEventIds: js.UndefOr[js.Array[DimensionValue]] = js.undefined
  /** The kind of resource this is, in this case dfareporting#customRichMediaEvents. */
  var kind: js.UndefOr[String] = js.undefined
}

object CustomRichMediaEvents {
  @scala.inline
  def apply(filteredEventIds: js.Array[DimensionValue] = null, kind: String = null): CustomRichMediaEvents = {
    val __obj = js.Dynamic.literal()
    if (filteredEventIds != null) __obj.updateDynamic("filteredEventIds")(filteredEventIds.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRichMediaEvents]
  }
}

