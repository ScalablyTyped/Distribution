package typings
package gapiDotClientDotFitnessLib.gapiNs.clientNs.fitnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDataPointChangesResponse extends js.Object {
  /** The data stream ID of the data source with data point changes. */
  var dataSourceId: js.UndefOr[java.lang.String] = js.undefined
  /** Deleted data points for the user. Note, for modifications this should be parsed before handling insertions. */
  var deletedDataPoint: js.UndefOr[js.Array[DataPoint]] = js.undefined
  /** Inserted data points for the user. */
  var insertedDataPoint: js.UndefOr[js.Array[DataPoint]] = js.undefined
  /** The continuation token, which is used to page through large result sets. Provide this value in a subsequent request to return the next page of results. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

