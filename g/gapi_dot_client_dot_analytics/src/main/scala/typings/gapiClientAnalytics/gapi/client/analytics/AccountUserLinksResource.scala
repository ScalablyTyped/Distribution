package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAlt
import typings.gapiClientAnalytics.AnonAccountIdAltFields
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountUserLinksResource extends js.Object {
  /** Removes a user from the given account. */
  def delete(request: AnonAccountIdAlt): Request_[Unit]
  /** Adds a new user to the given account. */
  def insert(request: AnonAccountIdAltFields): Request_[EntityUserLink]
  /** Lists account-user links for a given account. */
  def list(request: AnonAccountIdAltFieldsKey): Request_[EntityUserLinks]
  /** Updates permissions for an existing user on the given account. */
  def update(request: AnonAccountIdAlt): Request_[EntityUserLink]
}

object AccountUserLinksResource {
  @scala.inline
  def apply(
    delete: AnonAccountIdAlt => Request_[Unit],
    insert: AnonAccountIdAltFields => Request_[EntityUserLink],
    list: AnonAccountIdAltFieldsKey => Request_[EntityUserLinks],
    update: AnonAccountIdAlt => Request_[EntityUserLink]
  ): AccountUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AccountUserLinksResource]
  }
}

