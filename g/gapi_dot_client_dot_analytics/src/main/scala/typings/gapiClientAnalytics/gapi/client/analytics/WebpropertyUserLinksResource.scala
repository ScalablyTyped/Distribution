package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request
import typings.gapiClientAnalytics.anon.AltFields
import typings.gapiClientAnalytics.anon.PrettyPrint
import typings.gapiClientAnalytics.anon.QuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertyUserLinksResource extends js.Object {
  /** Removes a user from the given web property. */
  def delete(request: AltFields): Request[Unit]
  /** Adds a new user to the given web property. */
  def insert(request: QuotaUser): Request[EntityUserLink]
  /** Lists webProperty-user links for a given web property. */
  def list(request: PrettyPrint): Request[EntityUserLinks]
  /** Updates permissions for an existing user on the given web property. */
  def update(request: AltFields): Request[EntityUserLink]
}

object WebpropertyUserLinksResource {
  @scala.inline
  def apply(
    delete: AltFields => Request[Unit],
    insert: QuotaUser => Request[EntityUserLink],
    list: PrettyPrint => Request[EntityUserLinks],
    update: AltFields => Request[EntityUserLink]
  ): WebpropertyUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[WebpropertyUserLinksResource]
  }
}

