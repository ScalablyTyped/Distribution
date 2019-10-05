package typings.gapiDotClientDotBigquery.gapi.client.bigquery

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotBigquery.Anon_AltDatasetIdFields
import typings.gapiDotClientDotBigquery.Anon_AltDatasetIdFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabledataResource extends js.Object {
  /** Streams data into BigQuery one record at a time without needing to run a load job. Requires the WRITER dataset role. */
  def insertAll(request: Anon_AltDatasetIdFields): Request[TableDataInsertAllResponse]
  /** Retrieves table data from a specified set of rows. Requires the READER dataset role. */
  def list(request: Anon_AltDatasetIdFieldsKey): Request[TableDataList]
}

object TabledataResource {
  @scala.inline
  def apply(
    insertAll: Anon_AltDatasetIdFields => Request[TableDataInsertAllResponse],
    list: Anon_AltDatasetIdFieldsKey => Request[TableDataList]
  ): TabledataResource = {
    val __obj = js.Dynamic.literal(insertAll = js.Any.fromFunction1(insertAll), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[TabledataResource]
  }
}

