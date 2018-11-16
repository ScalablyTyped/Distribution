package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TargetInstancesResource extends js.Object {
  /** Retrieves an aggregated list of target instances. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[TargetInstanceAggregatedList]
  /** Deletes the specified TargetInstance resource. */
  def delete(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenTargetInstance
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified TargetInstance resource. Get a list of available target instances by making a list() request. */
  def get(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenTargetInstanceAlt
  ): gapiDotClientLib.gapiNs.clientNs.Request[TargetInstance]
  /** Creates a TargetInstance resource in the specified project and zone using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of TargetInstance resources available to the specified project and zone. */
  def list(request: gapiDotClientDotComputeLib.Anon_ProjectMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[TargetInstanceList]
}

