package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonFields
import typings.gapiClientTagmanager.AnonFingerprint
import typings.gapiClientTagmanager.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsResource extends js.Object {
  /** Creates a GTM Tag. */
  def create(request: AnonAlt): Request_[Tag]
  /** Deletes a GTM Tag. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a GTM Tag. */
  def get(request: AnonFields): Request_[Tag]
  /** Lists all GTM Tags of a Container. */
  def list(request: AnonKey): Request_[ListTagsResponse]
  /** Reverts changes to a GTM Tag in a GTM Workspace. */
  def revert(request: AnonFingerprint): Request_[RevertTagResponse]
  /** Updates a GTM Tag. */
  def update(request: AnonFingerprint): Request_[Tag]
}

object TagsResource {
  @scala.inline
  def apply(
    create: AnonAlt => Request_[Tag],
    delete: AnonFields => Request_[Unit],
    get: AnonFields => Request_[Tag],
    list: AnonKey => Request_[ListTagsResponse],
    revert: AnonFingerprint => Request_[RevertTagResponse],
    update: AnonFingerprint => Request_[Tag]
  ): TagsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TagsResource]
  }
}

