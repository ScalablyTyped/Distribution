package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import typings.gapiClientTagmanager.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsResource extends js.Object {
  /** Creates a GTM Tag. */
  def create(request: Alt): Request[Tag]
  /** Deletes a GTM Tag. */
  def delete(request: Fields): Request[Unit]
  /** Gets a GTM Tag. */
  def get(request: Fields): Request[Tag]
  /** Lists all GTM Tags of a Container. */
  def list(request: Key): Request[ListTagsResponse]
  /** Reverts changes to a GTM Tag in a GTM Workspace. */
  def revert(request: Fingerprint): Request[RevertTagResponse]
  /** Updates a GTM Tag. */
  def update(request: Fingerprint): Request[Tag]
}

object TagsResource {
  @scala.inline
  def apply(
    create: Alt => Request[Tag],
    delete: Fields => Request[Unit],
    get: Fields => Request[Tag],
    list: Key => Request[ListTagsResponse],
    revert: Fingerprint => Request[RevertTagResponse],
    update: Fingerprint => Request[Tag]
  ): TagsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[TagsResource]
  }
}

