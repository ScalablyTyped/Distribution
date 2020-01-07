package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a DimensionValuesRequest.
  */
@js.native
trait Schema$DimensionValueRequest extends js.Object {
  /**
    * The name of the dimension for which values should be requested.
    */
  var dimensionName: js.UndefOr[String] = js.native
  /**
    * The end date of the date range for which to retrieve dimension values. A
    * string of the format &quot;yyyy-MM-dd&quot;.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * The list of filters by which to filter values. The filters are ANDed.
    */
  var filters: js.UndefOr[js.Array[Schema$DimensionFilter]] = js.native
  /**
    * The kind of request this is, in this case
    * dfareporting#dimensionValueRequest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The start date of the date range for which to retrieve dimension values.
    * A string of the format &quot;yyyy-MM-dd&quot;.
    */
  var startDate: js.UndefOr[String] = js.native
}

object Schema$DimensionValueRequest {
  @scala.inline
  def apply(
    dimensionName: String = null,
    endDate: String = null,
    filters: js.Array[Schema$DimensionFilter] = null,
    kind: String = null,
    startDate: String = null
  ): Schema$DimensionValueRequest = {
    val __obj = js.Dynamic.literal()
    if (dimensionName != null) __obj.updateDynamic("dimensionName")(dimensionName.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DimensionValueRequest]
  }
}

