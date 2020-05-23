package typings.gapiClientBigquery.gapi.client.bigquery

import typings.gapiClient.gapi.client.Request
import typings.gapiClientBigquery.anon.Oauthtoken
import typings.gapiClientBigquery.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabledataResource extends js.Object {
  /** Streams data into BigQuery one record at a time without needing to run a load job. Requires the WRITER dataset role. */
  def insertAll(request: Oauthtoken): Request[TableDataInsertAllResponse]
  /** Retrieves table data from a specified set of rows. Requires the READER dataset role. */
  def list(request: PageToken): Request[TableDataList]
}

object TabledataResource {
  @scala.inline
  def apply(
    insertAll: Oauthtoken => Request[TableDataInsertAllResponse],
    list: PageToken => Request[TableDataList]
  ): TabledataResource = {
    val __obj = js.Dynamic.literal(insertAll = js.Any.fromFunction1(insertAll), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[TabledataResource]
  }
}

