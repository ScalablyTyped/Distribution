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
  def create(request: gapiDotClientDotGmailLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ForwardingAddress]
  /**
    * Deletes the specified forwarding address and revokes any verification that may have been required.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(request: gapiDotClientDotGmailLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets the specified forwarding address. */
  def get(request: gapiDotClientDotGmailLib.Anon_PrettyPrintQuotaUserKeyUserIpOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ForwardingAddress]
  /** Lists the forwarding addresses for the specified account. */
  def list(request: gapiDotClientDotGmailLib.Anon_PrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ListForwardingAddressesResponse]
}

