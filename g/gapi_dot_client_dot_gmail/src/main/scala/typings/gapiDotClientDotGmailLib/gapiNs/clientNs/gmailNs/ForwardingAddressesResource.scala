package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

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
  def create(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ForwardingAddress]
  /**
    * Deletes the specified forwarding address and revokes any verification that may have been required.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(request: gapiDotClientDotGmailLib.Anon_AltFieldsForwardingEmail): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets the specified forwarding address. */
  def get(request: gapiDotClientDotGmailLib.Anon_AltFieldsForwardingEmail): gapiDotClientLib.gapiNs.clientNs.Request[ForwardingAddress]
  /** Lists the forwarding addresses for the specified account. */
  def list(request: gapiDotClientDotGmailLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ListForwardingAddressesResponse]
}

object ForwardingAddressesResource {
  @scala.inline
  def apply(
    create: js.Function1[
      gapiDotClientDotGmailLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ForwardingAddress]
    ],
    delete: js.Function1[
      gapiDotClientDotGmailLib.Anon_AltFieldsForwardingEmail, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotGmailLib.Anon_AltFieldsForwardingEmail, 
      gapiDotClientLib.gapiNs.clientNs.Request[ForwardingAddress]
    ],
    list: js.Function1[
      gapiDotClientDotGmailLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ListForwardingAddressesResponse]
    ]
  ): ForwardingAddressesResource = {
    val __obj = js.Dynamic.literal(create = create, delete = delete, get = get, list = list)
  
    __obj.asInstanceOf[ForwardingAddressesResource]
  }
}

