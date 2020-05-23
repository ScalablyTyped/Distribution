package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentsResource extends js.Object {
  /** Creates a GTM Environment. */
  def create(request: Alt): Request[Environment]
  /** Deletes a GTM Environment. */
  def delete(request: Fields): Request[Unit]
  /** Gets a GTM Environment. */
  def get(request: Fields): Request[Environment]
  /** Lists all GTM Environments of a GTM Container. */
  def list(request: Key): Request[ListEnvironmentsResponse]
  /** Updates a GTM Environment. This method supports patch semantics. */
  def patch(request: Fingerprint): Request[Environment]
  /** Re-generates the authorization code for a GTM Environment. */
  def reauthorize(request: Fields): Request[Environment]
  /** Updates a GTM Environment. */
  def update(request: Fingerprint): Request[Environment]
}

object EnvironmentsResource {
  @scala.inline
  def apply(
    create: Alt => Request[Environment],
    delete: Fields => Request[Unit],
    get: Fields => Request[Environment],
    list: Key => Request[ListEnvironmentsResponse],
    patch: Fingerprint => Request[Environment],
    reauthorize: Fields => Request[Environment],
    update: Fingerprint => Request[Environment]
  ): EnvironmentsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), reauthorize = js.Any.fromFunction1(reauthorize), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EnvironmentsResource]
  }
}

