package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitTable extends js.Object {
  var postalCodeGroupNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var rows: js.UndefOr[js.Array[TransitTableTransitTimeRow]] = js.undefined
  var transitTimeLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object TransitTable {
  @scala.inline
  def apply(
    postalCodeGroupNames: js.Array[java.lang.String] = null,
    rows: js.Array[TransitTableTransitTimeRow] = null,
    transitTimeLabels: js.Array[java.lang.String] = null
  ): TransitTable = {
    val __obj = js.Dynamic.literal()
    if (postalCodeGroupNames != null) __obj.updateDynamic("postalCodeGroupNames")(postalCodeGroupNames)
    if (rows != null) __obj.updateDynamic("rows")(rows)
    if (transitTimeLabels != null) __obj.updateDynamic("transitTimeLabels")(transitTimeLabels)
    __obj.asInstanceOf[TransitTable]
  }
}

