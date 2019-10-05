package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTagmanager.Anon_Alt
import typings.gapiDotClientDotTagmanager.Anon_AltFields
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsFingerprint
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentsResource extends js.Object {
  /** Creates a GTM Environment. */
  def create(request: Anon_Alt): Request[Environment]
  /** Deletes a GTM Environment. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets a GTM Environment. */
  def get(request: Anon_AltFields): Request[Environment]
  /** Lists all GTM Environments of a GTM Container. */
  def list(request: Anon_AltFieldsKey): Request[ListEnvironmentsResponse]
  /** Updates a GTM Environment. This method supports patch semantics. */
  def patch(request: Anon_AltFieldsFingerprint): Request[Environment]
  /** Re-generates the authorization code for a GTM Environment. */
  def reauthorize(request: Anon_AltFields): Request[Environment]
  /** Updates a GTM Environment. */
  def update(request: Anon_AltFieldsFingerprint): Request[Environment]
}

object EnvironmentsResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[Environment],
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[Environment],
    list: Anon_AltFieldsKey => Request[ListEnvironmentsResponse],
    patch: Anon_AltFieldsFingerprint => Request[Environment],
    reauthorize: Anon_AltFields => Request[Environment],
    update: Anon_AltFieldsFingerprint => Request[Environment]
  ): EnvironmentsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), reauthorize = js.Any.fromFunction1(reauthorize), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[EnvironmentsResource]
  }
}

