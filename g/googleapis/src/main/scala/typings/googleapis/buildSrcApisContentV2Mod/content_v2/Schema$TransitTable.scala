package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$TransitTable extends js.Object {
  /**
    * A list of postal group names. The last value can be &quot;all other
    * locations&quot;. Example: [&quot;zone 1&quot;, &quot;zone 2&quot;,
    * &quot;all other locations&quot;]. The referred postal code groups must
    * match the delivery country of the service.
    */
  var postalCodeGroupNames: js.UndefOr[js.Array[String]] = js.native
  var rows: js.UndefOr[js.Array[Schema$TransitTableTransitTimeRow]] = js.native
  /**
    * A list of transit time labels. The last value can be &quot;all other
    * labels&quot;. Example: [&quot;food&quot;, &quot;electronics&quot;,
    * &quot;all other labels&quot;].
    */
  var transitTimeLabels: js.UndefOr[js.Array[String]] = js.native
}

object Schema$TransitTable {
  @scala.inline
  def apply(
    postalCodeGroupNames: js.Array[String] = null,
    rows: js.Array[Schema$TransitTableTransitTimeRow] = null,
    transitTimeLabels: js.Array[String] = null
  ): Schema$TransitTable = {
    val __obj = js.Dynamic.literal()
    if (postalCodeGroupNames != null) __obj.updateDynamic("postalCodeGroupNames")(postalCodeGroupNames.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (transitTimeLabels != null) __obj.updateDynamic("transitTimeLabels")(transitTimeLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TransitTable]
  }
}

