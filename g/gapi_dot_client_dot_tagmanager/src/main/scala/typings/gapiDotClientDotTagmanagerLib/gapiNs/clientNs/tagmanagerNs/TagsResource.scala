package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagsResource extends js.Object {
  /** Creates a GTM Tag. */
  def create(request: gapiDotClientDotTagmanagerLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[Tag]
  /** Deletes a GTM Tag. */
  def delete(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit]
  /** Gets a GTM Tag. */
  def get(request: gapiDotClientDotTagmanagerLib.Anon_AltFields): gapiDotClientLib.gapiNs.clientNs.Request[Tag]
  /** Lists all GTM Tags of a Container. */
  def list(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[ListTagsResponse]
  /** Reverts changes to a GTM Tag in a GTM Workspace. */
  def revert(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[RevertTagResponse]
  /** Updates a GTM Tag. */
  def update(request: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint): gapiDotClientLib.gapiNs.clientNs.Request[Tag]
}

object TagsResource {
  @scala.inline
  def apply(
    create: gapiDotClientDotTagmanagerLib.Anon_Alt => gapiDotClientLib.gapiNs.clientNs.Request[Tag],
    delete: gapiDotClientDotTagmanagerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[scala.Unit],
    get: gapiDotClientDotTagmanagerLib.Anon_AltFields => gapiDotClientLib.gapiNs.clientNs.Request[Tag],
    list: gapiDotClientDotTagmanagerLib.Anon_AltFieldsKey => gapiDotClientLib.gapiNs.clientNs.Request[ListTagsResponse],
    revert: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint => gapiDotClientLib.gapiNs.clientNs.Request[RevertTagResponse],
    update: gapiDotClientDotTagmanagerLib.Anon_AltFieldsFingerprint => gapiDotClientLib.gapiNs.clientNs.Request[Tag]
  ): TagsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list), revert = js.Any.fromFunction1(revert), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[TagsResource]
  }
}

