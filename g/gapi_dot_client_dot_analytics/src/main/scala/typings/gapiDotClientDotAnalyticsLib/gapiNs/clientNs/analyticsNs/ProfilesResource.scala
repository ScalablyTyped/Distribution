package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilesResource extends js.Object {
  /** Deletes a view (profile). */
  def delete(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a view (profile) to which the user has access. */
  def get(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Profile]
  /** Create a new view (profile). */
  def insert(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken): gapiDotClientLib.gapiNs.clientNs.Request[Profile]
  /** Lists views (profiles) to which the user has access. */
  def list(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults): gapiDotClientLib.gapiNs.clientNs.Request[Profiles]
  /** Updates an existing view (profile). This method supports patch semantics. */
  def patch(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Profile]
  /** Updates an existing view (profile). */
  def update(request: gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Profile]
}

object ProfilesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
    ],
    get: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Profile]
    ],
    insert: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtoken, 
      gapiDotClientLib.gapiNs.clientNs.Request[Profile]
    ],
    list: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyMaxresults, 
      gapiDotClientLib.gapiNs.clientNs.Request[Profiles]
    ],
    patch: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Profile]
    ],
    update: js.Function1[
      gapiDotClientDotAnalyticsLib.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint, 
      gapiDotClientLib.gapiNs.clientNs.Request[Profile]
    ]
  ): ProfilesResource = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, insert = insert, list = list, patch = patch, update = update)
  
    __obj.asInstanceOf[ProfilesResource]
  }
}

