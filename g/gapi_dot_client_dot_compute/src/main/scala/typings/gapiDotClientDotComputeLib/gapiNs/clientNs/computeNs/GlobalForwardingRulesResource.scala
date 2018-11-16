package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GlobalForwardingRulesResource extends js.Object {
  /** Deletes the specified GlobalForwardingRule resource. */
  def delete(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintForwardingRuleQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified GlobalForwardingRule resource. Get a list of available forwarding rules by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintForwardingRuleQuotaUserKeyUserIp): gapiDotClientLib.gapiNs.clientNs.Request[ForwardingRule]
  /** Creates a GlobalForwardingRule resource in the specified project using the data included in the request. */
  def insert(
    request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintQuotaUserKeyUserIpOauthtokenAltFieldsRequestId
  ): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves a list of GlobalForwardingRule resources available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[ForwardingRuleList]
  /** Changes target URL for the GlobalForwardingRule resource. The new target should be of the same type as the old target. */
  def setTarget(request: gapiDotClientDotComputeLib.Anon_ProjectPrettyPrintForwardingRuleQuotaUserKey): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

