package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyLinkIdOauthtoken
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyMaxresults
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertyUserLinksResource extends js.Object {
  /** Removes a user from the given web property. */
  def delete(request: AnonAccountIdAltFieldsKeyLinkIdOauthtoken): Request_[Unit]
  /** Adds a new user to the given web property. */
  def insert(request: AnonAccountIdAltFieldsKeyOauthtoken): Request_[EntityUserLink]
  /** Lists webProperty-user links for a given web property. */
  def list(request: AnonAccountIdAltFieldsKeyMaxresults): Request_[EntityUserLinks]
  /** Updates permissions for an existing user on the given web property. */
  def update(request: AnonAccountIdAltFieldsKeyLinkIdOauthtoken): Request_[EntityUserLink]
}

object WebpropertyUserLinksResource {
  @scala.inline
  def apply(
    delete: AnonAccountIdAltFieldsKeyLinkIdOauthtoken => Request_[Unit],
    insert: AnonAccountIdAltFieldsKeyOauthtoken => Request_[EntityUserLink],
    list: AnonAccountIdAltFieldsKeyMaxresults => Request_[EntityUserLinks],
    update: AnonAccountIdAltFieldsKeyLinkIdOauthtoken => Request_[EntityUserLink]
  ): WebpropertyUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[WebpropertyUserLinksResource]
  }
}

