package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAltFields
import typings.gapiClientAnalytics.AnonPrettyPrint
import typings.gapiClientAnalytics.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertyUserLinksResource extends js.Object {
  /** Removes a user from the given web property. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Adds a new user to the given web property. */
  def insert(request: AnonQuotaUser): Request_[EntityUserLink]
  /** Lists webProperty-user links for a given web property. */
  def list(request: AnonPrettyPrint): Request_[EntityUserLinks]
  /** Updates permissions for an existing user on the given web property. */
  def update(request: AnonAltFields): Request_[EntityUserLink]
}

object WebpropertyUserLinksResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => Request_[Unit],
    insert: AnonQuotaUser => Request_[EntityUserLink],
    list: AnonPrettyPrint => Request_[EntityUserLinks],
    update: AnonAltFields => Request_[EntityUserLink]
  ): WebpropertyUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebpropertyUserLinksResource]
  }
}

