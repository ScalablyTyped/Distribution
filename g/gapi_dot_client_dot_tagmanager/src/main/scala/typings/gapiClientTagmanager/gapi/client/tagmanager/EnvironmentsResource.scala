package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonAltFields
import typings.gapiClientTagmanager.AnonAltFieldsFingerprint
import typings.gapiClientTagmanager.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentsResource extends js.Object {
  /** Creates a GTM Environment. */
  def create(request: AnonAlt): Request_[Environment]
  /** Deletes a GTM Environment. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets a GTM Environment. */
  def get(request: AnonAltFields): Request_[Environment]
  /** Lists all GTM Environments of a GTM Container. */
  def list(request: AnonAltFieldsKey): Request_[ListEnvironmentsResponse]
  /** Updates a GTM Environment. This method supports patch semantics. */
  def patch(request: AnonAltFieldsFingerprint): Request_[Environment]
  /** Re-generates the authorization code for a GTM Environment. */
  def reauthorize(request: AnonAltFields): Request_[Environment]
  /** Updates a GTM Environment. */
  def update(request: AnonAltFieldsFingerprint): Request_[Environment]
}

object EnvironmentsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Environment],
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[Environment],
    list: AnonAltFieldsKey => Request_[ListEnvironmentsResponse],
    patch: AnonAltFieldsFingerprint => Request_[Environment],
    reauthorize: AnonAltFields => Request_[Environment],
    update: AnonAltFieldsFingerprint => Request_[Environment]
  ): EnvironmentsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), reauthorize = js.Any.fromFunction1(reauthorize), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[EnvironmentsResource]
  }
}

