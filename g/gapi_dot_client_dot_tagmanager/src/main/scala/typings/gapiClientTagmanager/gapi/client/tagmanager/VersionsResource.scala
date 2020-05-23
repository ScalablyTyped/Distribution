package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.ContainerVersionId
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionsResource extends js.Object {
  /** Deletes a Container Version. */
  def delete(request: Fields): Request[Unit]
  /** Gets a Container Version. */
  def get(request: ContainerVersionId): Request[ContainerVersion]
  /** Gets the live (i.e. published) container version */
  def live(request: Alt): Request[ContainerVersion]
  /** Publishes a Container Version. */
  def publish(request: Fingerprint): Request[PublishContainerVersionResponse]
  /** Sets the latest version used for synchronization of workspaces when detecting conflicts and errors. */
  def set_latest(request: Fields): Request[ContainerVersion]
  /** Undeletes a Container Version. */
  def undelete(request: Fields): Request[ContainerVersion]
  /** Updates a Container Version. */
  def update(request: Fingerprint): Request[ContainerVersion]
}

object VersionsResource {
  @scala.inline
  def apply(
    delete: Fields => Request[Unit],
    get: ContainerVersionId => Request[ContainerVersion],
    live: Alt => Request[ContainerVersion],
    publish: Fingerprint => Request[PublishContainerVersionResponse],
    set_latest: Fields => Request[ContainerVersion],
    undelete: Fields => Request[ContainerVersion],
    update: Fingerprint => Request[ContainerVersion]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), live = js.Any.fromFunction1(live), publish = js.Any.fromFunction1(publish), set_latest = js.Any.fromFunction1(set_latest), undelete = js.Any.fromFunction1(undelete), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[VersionsResource]
  }
}

