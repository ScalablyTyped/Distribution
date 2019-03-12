package typings
package gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabledataResource extends js.Object {
  /** Streams data into BigQuery one record at a time without needing to run a load job. Requires the WRITER dataset role. */
  def insertAll(request: gapiDotClientDotBigqueryLib.Anon_AltDatasetIdFields): gapiDotClientLib.gapiNs.clientNs.Request[TableDataInsertAllResponse]
  /** Retrieves table data from a specified set of rows. Requires the READER dataset role. */
  def list(request: gapiDotClientDotBigqueryLib.Anon_AltDatasetIdFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[TableDataList]
}

object TabledataResource {
  @scala.inline
  def apply(
    insertAll: gapiDotClientDotBigqueryLib.Anon_AltDatasetIdFields => gapiDotClientLib.gapiNs.clientNs.Request[TableDataInsertAllResponse],
    list: gapiDotClientDotBigqueryLib.Anon_AltDatasetIdFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[TableDataList]
  ): TabledataResource = {
    val __obj = js.Dynamic.literal(insertAll = js.Any.fromFunction1(insertAll), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TabledataResource]
  }
}

