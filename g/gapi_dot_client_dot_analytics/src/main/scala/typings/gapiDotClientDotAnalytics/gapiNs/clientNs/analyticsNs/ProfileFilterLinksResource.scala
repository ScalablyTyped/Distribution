package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyLinkId
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileFilterLinksResource extends js.Object {
  /** Delete a profile filter link. */
  def delete(request: Anon_AccountIdAltFieldsKeyLinkId): Request[Unit]
  /** Returns a single profile filter link. */
  def get(request: Anon_AccountIdAltFieldsKeyLinkId): Request[ProfileFilterLink]
  /** Create a new profile filter link. */
  def insert(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): Request[ProfileFilterLink]
  /** Lists all profile filter links for a profile. */
  def list(request: Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken): Request[ProfileFilterLinks]
  /** Update an existing profile filter link. This method supports patch semantics. */
  def patch(request: Anon_AccountIdAltFieldsKeyLinkId): Request[ProfileFilterLink]
  /** Update an existing profile filter link. */
  def update(request: Anon_AccountIdAltFieldsKeyLinkId): Request[ProfileFilterLink]
}

object ProfileFilterLinksResource {
  @scala.inline
  def apply(
    delete: Anon_AccountIdAltFieldsKeyLinkId => Request[Unit],
    get: Anon_AccountIdAltFieldsKeyLinkId => Request[ProfileFilterLink],
    insert: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint => Request[ProfileFilterLink],
    list: Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken => Request[ProfileFilterLinks],
    patch: Anon_AccountIdAltFieldsKeyLinkId => Request[ProfileFilterLink],
    update: Anon_AccountIdAltFieldsKeyLinkId => Request[ProfileFilterLink]
  ): ProfileFilterLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ProfileFilterLinksResource]
  }
}

