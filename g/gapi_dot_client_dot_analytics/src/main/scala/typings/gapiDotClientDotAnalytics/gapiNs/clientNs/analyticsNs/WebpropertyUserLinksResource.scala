package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyLinkIdOauthtoken
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyMaxresults
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebpropertyUserLinksResource extends js.Object {
  /** Removes a user from the given web property. */
  def delete(request: Anon_AccountIdAltFieldsKeyLinkIdOauthtoken): Request[Unit]
  /** Adds a new user to the given web property. */
  def insert(request: Anon_AccountIdAltFieldsKeyOauthtoken): Request[EntityUserLink]
  /** Lists webProperty-user links for a given web property. */
  def list(request: Anon_AccountIdAltFieldsKeyMaxresults): Request[EntityUserLinks]
  /** Updates permissions for an existing user on the given web property. */
  def update(request: Anon_AccountIdAltFieldsKeyLinkIdOauthtoken): Request[EntityUserLink]
}

object WebpropertyUserLinksResource {
  @scala.inline
  def apply(
    delete: Anon_AccountIdAltFieldsKeyLinkIdOauthtoken => Request[Unit],
    insert: Anon_AccountIdAltFieldsKeyOauthtoken => Request[EntityUserLink],
    list: Anon_AccountIdAltFieldsKeyMaxresults => Request[EntityUserLinks],
    update: Anon_AccountIdAltFieldsKeyLinkIdOauthtoken => Request[EntityUserLink]
  ): WebpropertyUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[WebpropertyUserLinksResource]
  }
}

