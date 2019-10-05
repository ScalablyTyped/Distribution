package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitTable extends js.Object {
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.undefined
  var rows: js.UndefOr[js.Array[TransitTableTransitTimeRow]] = js.undefined
  var transitTimeLabels: js.UndefOr[js.Array[String]] = js.undefined
}

object TransitTable {
  @scala.inline
  def apply(
    postalCodeGroupNames: js.Array[String] = null,
    rows: js.Array[TransitTableTransitTimeRow] = null,
    transitTimeLabels: js.Array[String] = null
  ): TransitTable = {
    val __obj = js.Dynamic.literal()
    if (postalCodeGroupNames != null) __obj.updateDynamic("postalCodeGroupNames")(postalCodeGroupNames)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (transitTimeLabels != null) __obj.updateDynamic("transitTimeLabels")(transitTimeLabels)
    __obj.asInstanceOf[TransitTable]
  }
}

