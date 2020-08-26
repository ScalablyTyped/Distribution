package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings

import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Delegate
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListDelegatesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegatesCollection extends js.Object {
  // Adds a delegate with its verification status set directly to accepted, without sending any verification email. The delegate user must be a member of the same G Suite organization as the delegator user.
  // Gmail imposes limtations on the number of delegates and delegators each user in a G Suite organization can have. These limits depend on your organization, but in general each user can have up to 25 delegates and up to 10 delegators.
  // Note that a delegate user must be referred to by their primary email address, and not an email alias.
  // Also note that when a new delegate is created, there may be up to a one minute delay before the new delegate is available for use.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def create(resource: Delegate, userId: String): Delegate = js.native
  // Gets the specified delegate.
  // Note that a delegate user must be referred to by their primary email address, and not an email alias.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def get(userId: String, delegateEmail: String): Delegate = js.native
  // Lists the delegates for the specified account.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def list(userId: String): ListDelegatesResponse = js.native
  // Removes the specified delegate (which can be of any verification status), and revokes any verification that may have been required for using it.
  // Note that a delegate user must be referred to by their primary email address, and not an email alias.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def remove(userId: String, delegateEmail: String): Unit = js.native
}

object DelegatesCollection {
  @scala.inline
  def apply(
    create: (Delegate, String) => Delegate,
    get: (String, String) => Delegate,
    list: String => ListDelegatesResponse,
    remove: (String, String) => Unit
  ): DelegatesCollection = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create), get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
    __obj.asInstanceOf[DelegatesCollection]
  }
  @scala.inline
  implicit class DelegatesCollectionOps[Self <: DelegatesCollection] (val x: Self) extends AnyVal {
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
    def setCreate(value: (Delegate, String) => Delegate): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def setGet(value: (String, String) => Delegate): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def setList(value: String => ListDelegatesResponse): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: (String, String) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
  }
  
}

