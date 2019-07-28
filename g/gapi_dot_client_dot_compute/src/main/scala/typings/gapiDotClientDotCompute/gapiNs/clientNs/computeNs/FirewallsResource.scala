package typings.gapiDotClientDotCompute.gapiNs.clientNs.computeNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotCompute.Anon_Alt
import typings.gapiDotClientDotCompute.Anon_AltFieldsFirewall
import typings.gapiDotClientDotCompute.Anon_AltFieldsFirewallKey
import typings.gapiDotClientDotCompute.Anon_AltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirewallsResource extends js.Object {
  /** Deletes the specified firewall. */
  def delete(request: Anon_AltFieldsFirewall): Request[Operation]
  /** Returns the specified firewall. */
  def get(request: Anon_AltFieldsFirewallKey): Request[Firewall]
  /** Creates a firewall rule in the specified project using the data included in the request. */
  def insert(request: Anon_AltFieldsKeyOauthtokenPrettyPrint): Request[Operation]
  /** Retrieves the list of firewall rules available to the specified project. */
  def list(request: Anon_Alt): Request[FirewallList]
  /**
    * Updates the specified firewall rule with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: Anon_AltFieldsFirewall): Request[Operation]
  /**
    * Updates the specified firewall rule with the data included in the request. Using PUT method, can only update following fields of firewall rule:
    * allowed, description, sourceRanges, sourceTags, targetTags.
    */
  def update(request: Anon_AltFieldsFirewall): Request[Operation]
}

object FirewallsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFieldsFirewall => Request[Operation],
    get: Anon_AltFieldsFirewallKey => Request[Firewall],
    insert: Anon_AltFieldsKeyOauthtokenPrettyPrint => Request[Operation],
    list: Anon_Alt => Request[FirewallList],
    patch: Anon_AltFieldsFirewall => Request[Operation],
    update: Anon_AltFieldsFirewall => Request[Operation]
  ): FirewallsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[FirewallsResource]
  }
}

