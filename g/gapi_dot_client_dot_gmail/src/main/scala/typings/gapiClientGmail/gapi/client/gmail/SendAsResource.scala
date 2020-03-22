package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientGmail.AnonAlt
import typings.gapiClientGmail.AnonPrettyPrint
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
  def create(request: AnonAlt): Request_[SendAs]
  /**
    * Deletes the specified send-as alias. Revokes any verification that may have been required for using it.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(request: AnonPrettyPrint): Request_[Unit]
  /** Gets the specified send-as alias. Fails with an HTTP 404 error if the specified address is not a member of the collection. */
  def get(request: AnonPrettyPrint): Request_[SendAs]
  /**
    * Lists the send-as aliases for the specified account. The result includes the primary send-as address associated with the account as well as any custom
    * "from" aliases.
    */
  def list(request: AnonAlt): Request_[ListSendAsResponse]
  /**
    * Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
    * This method supports patch semantics.
    */
  def patch(request: AnonPrettyPrint): Request_[SendAs]
  /**
    * Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
    */
  def update(request: AnonPrettyPrint): Request_[SendAs]
  /**
    * Sends a verification email to the specified send-as alias address. The verification status must be pending.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def verify(request: AnonPrettyPrint): Request_[Unit]
}

object SendAsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[SendAs],
    delete: AnonPrettyPrint => Request_[Unit],
    get: AnonPrettyPrint => Request_[SendAs],
    list: AnonAlt => Request_[ListSendAsResponse],
    patch: AnonPrettyPrint => Request_[SendAs],
    smimeInfo: SmimeInfoResource,
    update: AnonPrettyPrint => Request_[SendAs],
    verify: AnonPrettyPrint => Request_[Unit]
  ): SendAsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), smimeInfo = smimeInfo.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), verify = js.Any.fromFunction1(verify))
  
    __obj.asInstanceOf[SendAsResource]
  }
}

