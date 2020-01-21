package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomRichMediaEvents extends js.Object {
  var filteredEventIds: js.UndefOr[js.Array[DimensionValue]] = js.undefined
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

