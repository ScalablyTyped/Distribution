package typings.gapiClientGmail.gapi.client.gmail

import typings.gapiClient.gapi.client.Request
import typings.gapiClientGmail.anon.Alt
import typings.gapiClientGmail.anon.ForwardingEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardingAddressesResource extends js.Object {
  /**
    * Creates a forwarding address. If ownership verification is required, a message will be sent to the recipient and the resource's verification status
    * will be set to pending; otherwise, the resource will be created with verification status set to accepted.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def create(request: Alt): Request[ForwardingAddress] = js.native
  /**
    * Deletes the specified forwarding address and revokes any verification that may have been required.
    *
    * This method is only available to service account clients that have been delegated domain-wide authority.
    */
  def delete(request: ForwardingEmail): Request[Unit] = js.native
  /** Gets the specified forwarding address. */
  def get(request: ForwardingEmail): Request[ForwardingAddress] = js.native
  /** Lists the forwarding addresses for the specified account. */
  def list(request: Alt): Request[ListForwardingAddressesResponse] = js.native
}

object ForwardingAddressesResource {
  @scala.inline
  def apply(
    create: Alt => Request[ForwardingAddress],
    delete: ForwardingEmail => Request[Unit],
    get: ForwardingEmail => Request[ForwardingAddress],
    list: Alt => Request[ListForwardingAddressesResponse]
  ): ForwardingAddressesResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ForwardingAddressesResource]
  }
  @scala.inline
  implicit class ForwardingAddressesResourceOps[Self <: ForwardingAddressesResource] (val x: Self) extends AnyVal {
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
    def setCreate(value: Alt => Request[ForwardingAddress]): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def setDelete(value: ForwardingEmail => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: ForwardingEmail => Request[ForwardingAddress]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ListForwardingAddressesResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

