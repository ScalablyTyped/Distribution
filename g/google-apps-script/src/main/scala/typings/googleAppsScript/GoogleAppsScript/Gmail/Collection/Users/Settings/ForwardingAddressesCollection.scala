package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings

import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ForwardingAddress
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListForwardingAddressesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardingAddressesCollection extends js.Object {
  // Creates a forwarding address. If ownership verification is required, a message will be sent to the recipient and the resource's verification status will be set to pending; otherwise, the resource will be created with verification status set to accepted.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def create(resource: ForwardingAddress, userId: String): ForwardingAddress = js.native
  // Gets the specified forwarding address.
  def get(userId: String, forwardingEmail: String): ForwardingAddress = js.native
  // Lists the forwarding addresses for the specified account.
  def list(userId: String): ListForwardingAddressesResponse = js.native
  // Deletes the specified forwarding address and revokes any verification that may have been required.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def remove(userId: String, forwardingEmail: String): Unit = js.native
}

object ForwardingAddressesCollection {
  @scala.inline
  def apply(
    create: (ForwardingAddress, String) => ForwardingAddress,
    get: (String, String) => ForwardingAddress,
    list: String => ListForwardingAddressesResponse,
    remove: (String, String) => Unit
  ): ForwardingAddressesCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
    __obj.asInstanceOf[ForwardingAddressesCollection]
  }
  @scala.inline
  implicit class ForwardingAddressesCollectionOps[Self <: ForwardingAddressesCollection] (val x: Self) extends AnyVal {
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
    def setCreate(value: (ForwardingAddress, String) => ForwardingAddress): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def setGet(value: (String, String) => ForwardingAddress): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: String => ListForwardingAddressesResponse): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: (String, String) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
  }
  
}

