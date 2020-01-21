package typings.gapiClientFitness.gapi.client.fitness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateBy extends js.Object {
  /**
    * A data source ID to aggregate. Mutually exclusive of dataTypeName. Only data from the specified data source ID will be included in the aggregation. The
    * dataset in the response will have the same data source ID.
    */
  var dataSourceId: js.UndefOr[String] = js.undefined
  /**
    * The data type to aggregate. All data sources providing this data type will contribute data to the aggregation. The response will contain a single
    * dataset for this data type name. The dataset will have a data source ID of derived:com.google.:com.google.android.gms:aggregated
    */
  var dataTypeName: js.UndefOr[String] = js.undefined
}

object AggregateBy {
  @scala.inline
  def apply(dataSourceId: String = null, dataTypeName: String = null): AggregateBy = {
    val __obj = js.Dynamic.literal()
    if (dataSourceId != null) __obj.updateDynamic("dataSourceId")(dataSourceId.asInstanceOf[js.Any])
    if (dataTypeName != null) __obj.updateDynamic("dataTypeName")(dataTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateBy]
  }
}

