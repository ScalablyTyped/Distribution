package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTagmanager.Anon_Alt
import typings.gapiDotClientDotTagmanager.Anon_AltFields
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsFingerprint
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsResource extends js.Object {
  /** Creates a GTM Tag. */
  def create(request: Anon_Alt): Request[Tag]
  /** Deletes a GTM Tag. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets a GTM Tag. */
  def get(request: Anon_AltFields): Request[Tag]
  /** Lists all GTM Tags of a Container. */
  def list(request: Anon_AltFieldsKey): Request[ListTagsResponse]
  /** Reverts changes to a GTM Tag in a GTM Workspace. */
  def revert(request: Anon_AltFieldsFingerprint): Request[RevertTagResponse]
  /** Updates a GTM Tag. */
  def update(request: Anon_AltFieldsFingerprint): Request[Tag]
}

object TagsResource {
  @scala.inline
  def apply(
    create: Anon_Alt => Request[Tag],
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltFields => Request[Tag],
    list: Anon_AltFieldsKey => Request[ListTagsResponse],
    revert: Anon_AltFieldsFingerprint => Request[RevertTagResponse],
    update: Anon_AltFieldsFingerprint => Request[Tag]
  ): TagsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TagsResource]
  }
}

