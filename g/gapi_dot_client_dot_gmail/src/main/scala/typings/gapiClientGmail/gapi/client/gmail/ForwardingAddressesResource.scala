package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGmail.AnonAlt
import typings.gapiClientGmail.AnonAltFieldsForwardingEmail
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
  def create(request: AnonAlt): Request_[ForwardingAddress]
  /**
    * Deletes the specified forwarding address and revokes any verification that may have been required.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(request: AnonAltFieldsForwardingEmail): Request_[Unit]
  /** Gets the specified forwarding address. */
  def get(request: AnonAltFieldsForwardingEmail): Request_[ForwardingAddress]
  /** Lists the forwarding addresses for the specified account. */
  def list(request: AnonAlt): Request_[ListForwardingAddressesResponse]
}

object ForwardingAddressesResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[ForwardingAddress],
    delete: AnonAltFieldsForwardingEmail => Request_[Unit],
    get: AnonAltFieldsForwardingEmail => Request_[ForwardingAddress],
    list: AnonAlt => Request_[ListForwardingAddressesResponse]
  ): ForwardingAddressesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[ForwardingAddressesResource]
  }
}

