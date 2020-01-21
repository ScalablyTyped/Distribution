package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonAltFields
import typings.gapiClientTagmanager.AnonAltFieldsFingerprint
import typings.gapiClientTagmanager.AnonAltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsResource extends js.Object {
  /** Creates a GTM Tag. */
  def create(request: AnonAlt): Request_[Tag]
  /** Deletes a GTM Tag. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Gets a GTM Tag. */
  def get(request: AnonAltFields): Request_[Tag]
  /** Lists all GTM Tags of a Container. */
  def list(request: AnonAltFieldsKey): Request_[ListTagsResponse]
  /** Reverts changes to a GTM Tag in a GTM Workspace. */
  def revert(request: AnonAltFieldsFingerprint): Request_[RevertTagResponse]
  /** Updates a GTM Tag. */
  def update(request: AnonAltFieldsFingerprint): Request_[Tag]
}

object TagsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Tag],
    delete: AnonAltFields => Request_[Unit],
    get: AnonAltFields => Request_[Tag],
    list: AnonAltFieldsKey => Request_[ListTagsResponse],
    revert: AnonAltFieldsFingerprint => Request_[RevertTagResponse],
    update: AnonAltFieldsFingerprint => Request_[Tag]
  ): TagsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TagsResource]
  }
}

