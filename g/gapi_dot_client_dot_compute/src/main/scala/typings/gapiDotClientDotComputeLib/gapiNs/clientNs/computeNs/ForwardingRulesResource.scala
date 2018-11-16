package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ForwardingRulesResource extends js.Object {
  /** Retrieves an aggregated list of forwarding rules. */
  def aggregatedList(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[ForwardingRuleAggregatedList]
  /** Deletes the specified ForwardingRule resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintForwardingRule): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified ForwardingRule resource. */
  def get(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintForwardingRuleQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[ForwardingRule]
  /** Creates a ForwardingRule resource in the specified project and region using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of ForwardingRule resources available to the specified project and region. */
  def list(request: gapiDotClientDotComputeLib.Anon_ProjectMaxResultsPrettyPrintPageToken): gapiDotClientLib.gapiNs.clientNs.Request[ForwardingRuleList]
  /** Changes target URL for forwarding rule. The new target should be of the same type as the old target. */
  def setTarget(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintForwardingRule): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

