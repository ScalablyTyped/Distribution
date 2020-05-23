package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.AltFields
import typings.gapiClientCompute.anon.FieldsFirewall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirewallsResource extends js.Object {
  /** Deletes the specified firewall. */
  def delete(request: typings.gapiClientCompute.anon.Firewall): Request[Operation]
  /** Returns the specified firewall. */
  def get(request: FieldsFirewall): Request[Firewall]
  /** Creates a firewall rule in the specified project using the data included in the request. */
  def insert(request: AltFields): Request[Operation]
  /** Retrieves the list of firewall rules available to the specified project. */
  def list(request: Alt): Request[FirewallList]
  /**
    * Updates the specified firewall rule with the data included in the request. This method supports PATCH semantics and uses the JSON merge patch format
    * and processing rules.
    */
  def patch(request: typings.gapiClientCompute.anon.Firewall): Request[Operation]
  /**
    * Updates the specified firewall rule with the data included in the request. Using PUT method, can only update following fields of firewall rule:
    * allowed, description, sourceRanges, sourceTags, targetTags.
    */
  def update(request: typings.gapiClientCompute.anon.Firewall): Request[Operation]
}

object FirewallsResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.Firewall => Request[Operation],
    get: FieldsFirewall => Request[Firewall],
    insert: AltFields => Request[Operation],
    list: Alt => Request[FirewallList],
    patch: typings.gapiClientCompute.anon.Firewall => Request[Operation],
    update: typings.gapiClientCompute.anon.Firewall => Request[Operation]
  ): FirewallsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[FirewallsResource]
  }
}

