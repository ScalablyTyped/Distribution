package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutoscalersResource extends js.Object {
  /** Retrieves an aggregated list of autoscalers. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[AutoscalerAggregatedList]
  /** Deletes the specified autoscaler. */
  def delete(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintAutoscaler): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified autoscaler resource. Get a list of available autoscalers by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintAutoscalerQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[Autoscaler]
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of autoscalers contained within the specified zone. */
  def list(request: gapiDotClientDotComputeLib.Anon_ProjectMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[AutoscalerList]
  /**
               * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
               * patch format and processing rules.
               */
  def patch(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintAutoscalerQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintAutoscalerQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

