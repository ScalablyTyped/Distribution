package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyMaxresults
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtoken
import typings.gapiClientAnalytics.AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProfilesResource extends js.Object {
  /** Deletes a view (profile). */
  def delete(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint): Request_[Unit]
  /** Gets a view (profile) to which the user has access. */
  def get(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint): Request_[Profile]
  /** Create a new view (profile). */
  def insert(request: AnonAccountIdAltFieldsKeyOauthtoken): Request_[Profile]
  /** Lists views (profiles) to which the user has access. */
  def list(request: AnonAccountIdAltFieldsKeyMaxresults): Request_[Profiles]
  /** Updates an existing view (profile). This method supports patch semantics. */
  def patch(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint): Request_[Profile]
  /** Updates an existing view (profile). */
  def update(request: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint): Request_[Profile]
}

object ProfilesResource {
  @scala.inline
  def apply(
    delete: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint => Request_[Unit],
    get: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint => Request_[Profile],
    insert: AnonAccountIdAltFieldsKeyOauthtoken => Request_[Profile],
    list: AnonAccountIdAltFieldsKeyMaxresults => Request_[Profiles],
    patch: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint => Request_[Profile],
    update: AnonAccountIdAltFieldsKeyOauthtokenPrettyPrint => Request_[Profile]
  ): ProfilesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[ProfilesResource]
  }
}

