package typings.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.Settings

import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.Delegate
import typings.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListDelegatesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelegatesCollection extends js.Object {
  // Adds a delegate with its verification status set directly to accepted, without sending any verification email. The delegate user must be a member of the same G Suite organization as the delegator user.
  // Gmail imposes limtations on the number of delegates and delegators each user in a G Suite organization can have. These limits depend on your organization, but in general each user can have up to 25 delegates and up to 10 delegators.
  // Note that a delegate user must be referred to by their primary email address, and not an email alias.
  // Also note that when a new delegate is created, there may be up to a one minute delay before the new delegate is available for use.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def create(resource: Delegate, userId: String): Delegate
  // Gets the specified delegate.
  // Note that a delegate user must be referred to by their primary email address, and not an email alias.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def get(userId: String, delegateEmail: String): Delegate
  // Lists the delegates for the specified account.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def list(userId: String): ListDelegatesResponse
  // Removes the specified delegate (which can be of any verification status), and revokes any verification that may have been required for using it.
  // Note that a delegate user must be referred to by their primary email address, and not an email alias.
  // This method is only available to service account clients that have been delegated domain-wide authority.
  def remove(userId: String, delegateEmail: String): Unit
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
}

