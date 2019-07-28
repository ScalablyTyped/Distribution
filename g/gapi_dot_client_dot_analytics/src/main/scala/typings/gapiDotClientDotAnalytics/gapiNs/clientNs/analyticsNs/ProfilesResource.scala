package typings.gapiDotClientDotAnalytics.gapiNs.clientNs.analyticsNs

import typings.gapiDotClient.gapiNs.clientNs.Request
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyMaxresults
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtoken
import typings.gapiDotClientDotAnalytics.Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilesResource extends js.Object {
  /** Deletes a view (profile). */
  def delete(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): Request[Unit]
  /** Gets a view (profile) to which the user has access. */
  def get(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): Request[Profile]
  /** Create a new view (profile). */
  def insert(request: Anon_AccountIdAltFieldsKeyOauthtoken): Request[Profile]
  /** Lists views (profiles) to which the user has access. */
  def list(request: Anon_AccountIdAltFieldsKeyMaxresults): Request[Profiles]
  /** Updates an existing view (profile). This method supports patch semantics. */
  def patch(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): Request[Profile]
  /** Updates an existing view (profile). */
  def update(request: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint): Request[Profile]
}

object ProfilesResource {
  @scala.inline
  def apply(
    delete: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint => Request[Unit],
    get: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint => Request[Profile],
    insert: Anon_AccountIdAltFieldsKeyOauthtoken => Request[Profile],
    list: Anon_AccountIdAltFieldsKeyMaxresults => Request[Profiles],
    patch: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint => Request[Profile],
    update: Anon_AccountIdAltFieldsKeyOauthtokenPrettyPrint => Request[Profile]
  ): ProfilesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ProfilesResource]
  }
}

