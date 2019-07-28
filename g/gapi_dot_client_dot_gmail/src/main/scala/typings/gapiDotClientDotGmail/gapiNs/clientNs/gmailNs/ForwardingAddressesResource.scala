package typings.gapiDotClientDotGmail.gapiNs.clientNs.gmailNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGmail.Anon_Alt
import typings.gapiDotClientDotGmail.Anon_AltFieldsForwardingEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForwardingAddressesResource extends js.Object {
  /**
    * Creates a forwarding address. If ownership verification is required, a message will be sent to the recipient and the resource's verification status
    * will be set to pending; otherwise, the resource will be created with verification status set to accepted.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def create(request: Anon_Alt): Request[ForwardingAddress]
  /**
    * Deletes the specified forwarding address and revokes any verification that may have been required.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(request: Anon_AltFieldsForwardingEmail): Request[Unit]
  /** Gets the specified forwarding address. */
  def get(request: Anon_AltFieldsForwardingEmail): Request[ForwardingAddress]
  /** Lists the forwarding addresses for the specified account. */
  def list(request: Anon_Alt): Request[ListForwardingAddressesResponse]
}

object ForwardingAddressesResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[ForwardingAddress],
    delete: Anon_AltFieldsForwardingEmail => Request[Unit],
    get: Anon_AltFieldsForwardingEmail => Request[ForwardingAddress],
    list: Anon_Alt => Request[ListForwardingAddressesResponse]
  ): ForwardingAddressesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ForwardingAddressesResource]
  }
}

