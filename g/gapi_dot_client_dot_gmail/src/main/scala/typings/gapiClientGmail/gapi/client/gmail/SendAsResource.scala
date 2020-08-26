package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Alt
import typings.gapiClientGmail.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendAsResource extends js.Object {
  var smimeInfo: SmimeInfoResource = js.native
  /**
    * Creates a custom "from" send-as alias. If an SMTP MSA is specified, Gmail will attempt to connect to the SMTP service to validate the configuration
    * before creating the alias. If ownership verification is required for the alias, a message will be sent to the email address and the resource's
    * verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted. If a signature is
    * provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def create(request: Alt): Request[SendAs] = js.native
  /**
    * Deletes the specified send-as alias. Revokes any verification that may have been required for using it.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(request: PrettyPrint): Request[Unit] = js.native
  /** Gets the specified send-as alias. Fails with an HTTP 404 error if the specified address is not a member of the collection. */
  def get(request: PrettyPrint): Request[SendAs] = js.native
  /**
    * Lists the send-as aliases for the specified account. The result includes the primary send-as address associated with the account as well as any custom
    * "from" aliases.
    */
  def list(request: Alt): Request[ListSendAsResponse] = js.native
  /**
    * Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
    * This method supports patch semantics.
    */
  def patch(request: PrettyPrint): Request[SendAs] = js.native
  /**
    * Updates a send-as alias. If a signature is provided, Gmail will sanitize the HTML before saving it with the alias.
    *
    * Addresses other than the primary address for the account can only be updated by service account clients that have been delegated domain-wide authority.
    */
  def update(request: PrettyPrint): Request[SendAs] = js.native
  /**
    * Sends a verification email to the specified send-as alias address. The verification status must be pending.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def verify(request: PrettyPrint): Request[Unit] = js.native
}

object SendAsResource {
  @scala.inline
  def apply(
    create: Alt => Request[SendAs],
    delete: PrettyPrint => Request[Unit],
    get: PrettyPrint => Request[SendAs],
    list: Alt => Request[ListSendAsResponse],
    patch: PrettyPrint => Request[SendAs],
    smimeInfo: SmimeInfoResource,
    update: PrettyPrint => Request[SendAs],
    verify: PrettyPrint => Request[Unit]
  ): SendAsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), smimeInfo = smimeInfo.asInstanceOf[js.Any], update = js.Any.fromFunction1(update), verify = js.Any.fromFunction1(verify))
    __obj.asInstanceOf[SendAsResource]
  }
  @scala.inline
  implicit class SendAsResourceOps[Self <: SendAsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreate(value: Alt => Request[SendAs]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: PrettyPrint => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: PrettyPrint => Request[SendAs]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ListSendAsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setPatch(value: PrettyPrint => Request[SendAs]): Self = this.set("patch", js.Any.fromFunction1(value))
    @scala.inline
    def setSmimeInfo(value: SmimeInfoResource): Self = this.set("smimeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdate(value: PrettyPrint => Request[SendAs]): Self = this.set("update", js.Any.fromFunction1(value))
    @scala.inline
    def setVerify(value: PrettyPrint => Request[Unit]): Self = this.set("verify", js.Any.fromFunction1(value))
  }
  
}

