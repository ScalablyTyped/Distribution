package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import typings.gapiDotClient.gapi.client.Request
import typings.gapiDotClientDotTagmanager.Anon_Alt
import typings.gapiDotClientDotTagmanager.Anon_AltContainerVersionId
import typings.gapiDotClientDotTagmanager.Anon_AltFields
import typings.gapiDotClientDotTagmanager.Anon_AltFieldsFingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionsResource extends js.Object {
  /** Deletes a Container Version. */
  def delete(request: Anon_AltFields): Request[Unit]
  /** Gets a Container Version. */
  def get(request: Anon_AltContainerVersionId): Request[ContainerVersion]
  /** Gets the live (i.e. published) container version */
  def live(request: Anon_Alt): Request[ContainerVersion]
  /** Publishes a Container Version. */
  def publish(request: Anon_AltFieldsFingerprint): Request[PublishContainerVersionResponse]
  /** Sets the latest version used for synchronization of workspaces when detecting conflicts and errors. */
  def set_latest(request: Anon_AltFields): Request[ContainerVersion]
  /** Undeletes a Container Version. */
  def undelete(request: Anon_AltFields): Request[ContainerVersion]
  /** Updates a Container Version. */
  def update(request: Anon_AltFieldsFingerprint): Request[ContainerVersion]
}

object VersionsResource {
  @scala.inline
  def apply(
    delete: Anon_AltFields => Request[Unit],
    get: Anon_AltContainerVersionId => Request[ContainerVersion],
    live: Anon_Alt => Request[ContainerVersion],
    publish: Anon_AltFieldsFingerprint => Request[PublishContainerVersionResponse],
    set_latest: Anon_AltFields => Request[ContainerVersion],
    undelete: Anon_AltFields => Request[ContainerVersion],
    update: Anon_AltFieldsFingerprint => Request[ContainerVersion]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), live = js.Any.fromFunction1(live), publish = js.Any.fromFunction1(publish), set_latest = js.Any.fromFunction1(set_latest), undelete = js.Any.fromFunction1(undelete), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[VersionsResource]
  }
}

