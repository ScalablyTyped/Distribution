package typings.gapiDotClientDotAnalytics.gapi.client.analytics

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyLinkId
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileUserLinksResource extends js.Object {
  /** Removes a user from the given view (profile). */
  def delete(request: Anon_AccountIdAltFieldsKeyLinkId): Request[Unit]
  /** Adds a new user to the given view (profile). */
  def insert(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): Request[EntityUserLink]
  /** Lists profile-user links for a given view (profile). */
  def list(request: Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken): Request[EntityUserLinks]
  /** Updates permissions for an existing user on the given view (profile). */
  def update(request: Anon_AccountIdAltFieldsKeyLinkId): Request[EntityUserLink]
}

object ProfileUserLinksResource {
  @scala.inline
  def apply(
    delete: Anon_AccountIdAltFieldsKeyLinkId => Request[Unit],
    insert: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint => Request[EntityUserLink],
    list: Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken => Request[EntityUserLinks],
    update: Anon_AccountIdAltFieldsKeyLinkId => Request[EntityUserLink]
  ): ProfileUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ProfileUserLinksResource]
  }
}

