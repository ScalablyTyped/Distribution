package typings.gapiDotClientDotGmail.gapiNs.clientNs.gmailNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotGmail.Anon_Alt
import typings.gapiDotClientDotGmail.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAsResource extends js.Object {
  var smimeInfo: SmimeInfoResource
  /**
    * Creates a custom "from" send-as alias. If an SMTP MSA is specified, Gmail will attempt to connect to the SMTP service to validate the configuration
    * before creating the alias. If ownership verification is required for the alias, a message will be sent to the email address and the resource's
    * verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted. If a signature is
    * provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def create(request: Anon_Alt): Request[SendAs]
  /**
    * Deletes the specified send-as alias. Revokes any verification that may have been required for using it.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(request: Anon_AltFieldsKey): Request[Unit]
  /** Gets the specified send-as alias. Fails with an HTTP 404 error if the specified address is not a member of the collection. */
  def get(request: Anon_AltFieldsKey): Request[SendAs]
  /**
    * Lists the send-as aliases for the specified account. The result includes the primary send-as address associated with the account as well as any custom
    * "from" aliases.
    */
  def list(request: Anon_Alt): Request[ListSendAsResponse]
  /**
    * Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
    * This method supports patch semantics.
    */
  def patch(request: Anon_AltFieldsKey): Request[SendAs]
  /**
    * Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
    */
  def update(request: Anon_AltFieldsKey): Request[SendAs]
  /**
    * Sends a verification email to the specified send-as alias address. The verification status must be pending.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def verify(request: Anon_AltFieldsKey): Request[Unit]
}

object SendAsResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[SendAs],
    delete: Anon_AltFieldsKey => Request[Unit],
    get: Anon_AltFieldsKey => Request[SendAs],
    list: Anon_Alt => Request[ListSendAsResponse],
    patch: Anon_AltFieldsKey => Request[SendAs],
    smimeInfo: SmimeInfoResource,
    update: Anon_AltFieldsKey => Request[SendAs],
    verify: Anon_AltFieldsKey => Request[Unit]
  ): SendAsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), smimeInfo = smimeInfo, update = js.Any.fromFunction1(update), verify = js.Any.fromFunction1(verify))
  
    __obj.asInstanceOf[SendAsResource]
  }
}

