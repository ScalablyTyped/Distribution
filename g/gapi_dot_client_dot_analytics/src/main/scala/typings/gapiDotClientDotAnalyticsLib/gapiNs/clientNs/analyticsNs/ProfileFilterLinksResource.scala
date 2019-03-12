package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfileFilterLinksResource extends js.Object {
  /** Delete a profile filter link. */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Returns a single profile filter link. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId): gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
  /** Create a new profile filter link. */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
  /** Lists all profile filter links for a profile. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLinks]
  /** Update an existing profile filter link. This method supports patch semantics. */
  def patch(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId): gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
  /** Update an existing profile filter link. */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId): gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
}

object ProfileFilterLinksResource {
  @scala.inline
  def apply(
    delete: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId => gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink],
    insert: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint => gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink],
    list: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken => gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLinks],
    patch: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId => gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink],
    update: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId => gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
  ): ProfileFilterLinksResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ProfileFilterLinksResource]
  }
}

