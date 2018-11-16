package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AggregateBy extends js.Object {
  /**
               * A data source ID to aggregate. Mutually exclusive of dataTypeName. Only data from the specified data source ID will be included in the aggregation. The
               * dataset in the response will have the same data source ID.
               */
  var dataSourceId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The data type to aggregate. All data sources providing this data type will contribute data to the aggregation. The response will contain a single
               * dataset for this data type name. The dataset will have a data source ID of derived:com.google.:com.google.android.gms:aggregated
               */
  var dataTypeName: js.UndefOr[java.lang.String] = js.undefined
}

