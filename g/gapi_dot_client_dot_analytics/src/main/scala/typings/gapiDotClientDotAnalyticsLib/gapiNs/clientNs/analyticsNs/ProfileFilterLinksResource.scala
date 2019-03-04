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
    delete: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
    ],
    insert: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
    ],
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresultsOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLinks]
    ],
    patch: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
    ],
    update: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyLinkId, 
      gapiDotClientLib.gapiNs.clientNs.Request[ProfileFilterLink]
    ]
  ): ProfileFilterLinksResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[ProfileFilterLinksResource]
  }
}

