package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyLinkId
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyMaxresultsOauthtoken
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileFilterLinksResource extends js.Object {
  /** Delete a profile filter link. */
  def delete(request: AnonAccountIdAltFieldsKeyLinkId): Request_[Unit]
  /** Returns a single profile filter link. */
  def get(request: AnonAccountIdAltFieldsKeyLinkId): Request_[ProfileFilterLink]
  /** Create a new profile filter link. */
  def insert(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint): Request_[ProfileFilterLink]
  /** Lists all profile filter links for a profile. */
  def list(request: AnonAccountIdAltFieldsKeyMaxresultsOauthtoken): Request_[ProfileFilterLinks]
  /** Update an existing profile filter link. This method supports patch semantics. */
  def patch(request: AnonAccountIdAltFieldsKeyLinkId): Request_[ProfileFilterLink]
  /** Update an existing profile filter link. */
  def update(request: AnonAccountIdAltFieldsKeyLinkId): Request_[ProfileFilterLink]
}

object ProfileFilterLinksResource {
  @scala.inline
  def apply(
    delete: AnonAccountIdAltFieldsKeyLinkId => Request_[Unit],
    get: AnonAccountIdAltFieldsKeyLinkId => Request_[ProfileFilterLink],
    insert: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint => Request_[ProfileFilterLink],
    list: AnonAccountIdAltFieldsKeyMaxresultsOauthtoken => Request_[ProfileFilterLinks],
    patch: AnonAccountIdAltFieldsKeyLinkId => Request_[ProfileFilterLink],
    update: AnonAccountIdAltFieldsKeyLinkId => Request_[ProfileFilterLink]
  ): ProfileFilterLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ProfileFilterLinksResource]
  }
}

