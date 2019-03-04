package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatafeedstatusesResource extends js.Object {
  def custombatch(request: gapiDotClientDotContentLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[DatafeedstatusesCustomBatchResponse]
  /** Retrieves the status of a datafeed from your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def get(request: gapiDotClientDotContentLib.Anon_AltCountry): gapiDotClientLib.gapiNs.clientNs.Request[DatafeedStatus]
  /** Lists the statuses of the datafeeds in your Merchant Center account. This method can only be called for non-multi-client accounts. */
  def list(request: gapiDotClientDotContentLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[DatafeedstatusesListResponse]
}

object DatafeedstatusesResource {
  @scala.inline
  def apply(
    custombatch: js.Function1[
      gapiDotClientDotContentLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[DatafeedstatusesCustomBatchResponse]
    ],
    get: js.Function1[
      gapiDotClientDotContentLib.Anon_AltCountry, 
      gapiDotClientLib.gapiNs.clientNs.Request[DatafeedStatus]
    ],
    list: js.Function1[
      gapiDotClientDotContentLib.Anon_AltFields, 
      gapiDotClientLib.gapiNs.clientNs.Request[DatafeedstatusesListResponse]
    ]
  ): DatafeedstatusesResource = {
    val __obj = js.Dynamic.literal(custombatch = custombatch, get = get, list = list)
  
    __obj.asInstanceOf[DatafeedstatusesResource]
  }
}

