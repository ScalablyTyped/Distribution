package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionAutoscalersResource extends js.Object {
  /** Deletes the specified autoscaler. */
  def delete(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintAutoscalerQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified autoscaler. */
  def get(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintAutoscalerQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Autoscaler]
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of autoscalers contained within the specified region. */
  def list(request: gapiDotClientDotComputeLib.Anon_ProjectMaxResultsPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[RegionAutoscalerList]
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintAutoscalerQuotaUserKeyUserIpOauthtokenAlt
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintAutoscalerQuotaUserKeyUserIpOauthtokenAlt
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

