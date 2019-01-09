package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirewallsResource extends js.Object {
  /** Deletes the specified firewall. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsFirewall): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified firewall. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsFirewallKey): gapiDotClientLib.gapiNs.clientNs.Request[Firewall]
  /** Creates a firewall rule in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Retrieves the list of firewall rules available to the specified project. */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[FirewallList]
  /**
    * Updates the specified firewall rule with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: gapiDotClientDotComputeLib.Anon_AltFieldsFirewall): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Updates the specified firewall rule with the data included in the request. Using PUT method, can only update following fields of firewall rule:
    * allowed, description, sourceRanges, sourceTags, targetTags.
    */
  def update(request: gapiDotClientDotComputeLib.Anon_AltFieldsFirewall): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

