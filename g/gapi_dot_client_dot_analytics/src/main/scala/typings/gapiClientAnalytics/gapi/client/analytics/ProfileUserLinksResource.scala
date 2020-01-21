package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyLinkId
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyMaxresultsOauthtoken
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileUserLinksResource extends js.Object {
  /** Removes a user from the given view (profile). */
  def delete(request: AnonAccountIdAltFieldsKeyLinkId): Request_[Unit]
  /** Adds a new user to the given view (profile). */
  def insert(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint): Request_[EntityUserLink]
  /** Lists profile-user links for a given view (profile). */
  def list(request: AnonAccountIdAltFieldsKeyMaxresultsOauthtoken): Request_[EntityUserLinks]
  /** Updates permissions for an existing user on the given view (profile). */
  def update(request: AnonAccountIdAltFieldsKeyLinkId): Request_[EntityUserLink]
}

object ProfileUserLinksResource {
  @scala.inline
  def apply(
    delete: AnonAccountIdAltFieldsKeyLinkId => Request_[Unit],
    insert: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint => Request_[EntityUserLink],
    list: AnonAccountIdAltFieldsKeyMaxresultsOauthtoken => Request_[EntityUserLinks],
    update: AnonAccountIdAltFieldsKeyLinkId => Request_[EntityUserLink]
  ): ProfileUserLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ProfileUserLinksResource]
  }
}

