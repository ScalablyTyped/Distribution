package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DatafeedstatusesResource extends js.Object {
  def custombatch(request: gapiDotClientDotContentLib.Anon_PrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[DatafeedstatusesCustomBatchResponse]
  /** Retrieves the status of a datafeed from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: gapiDotClientDotContentLib.Anon_DatafeedIdPrettyPrintCountry): gapiDotClientLib.gapiNs.clientNs.Request[DatafeedStatus]
  /** Lists the statuses of the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: gapiDotClientDotContentLib.Anon_MaxResults): gapiDotClientLib.gapiNs.clientNs.Request[DatafeedstatusesListResponse]
}

