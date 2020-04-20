package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientTagmanager.AnonAlt
import typings.gapiClientTagmanager.AnonContainerVersionId
import typings.gapiClientTagmanager.AnonFields
import typings.gapiClientTagmanager.AnonFingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionsResource extends js.Object {
  /** Deletes a Container Version. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a Container Version. */
  def get(request: AnonContainerVersionId): Request_[ContainerVersion]
  /** Gets the live (i.e. published) container version */
  def live(request: AnonAlt): Request_[ContainerVersion]
  /** Publishes a Container Version. */
  def publish(request: AnonFingerprint): Request_[PublishContainerVersionResponse]
  /** Sets the latest version used for synchronization of workspaces when detecting conflicts and errors. */
  def set_latest(request: AnonFields): Request_[ContainerVersion]
  /** Undeletes a Container Version. */
  def undelete(request: AnonFields): Request_[ContainerVersion]
  /** Updates a Container Version. */
  def update(request: AnonFingerprint): Request_[ContainerVersion]
}

object VersionsResource {
  @scala.inline
  def apply(
    delete: AnonFields => Request_[Unit],
    get: AnonContainerVersionId => Request_[ContainerVersion],
    live: AnonAlt => Request_[ContainerVersion],
    publish: AnonFingerprint => Request_[PublishContainerVersionResponse],
    set_latest: AnonFields => Request_[ContainerVersion],
    undelete: AnonFields => Request_[ContainerVersion],
    update: AnonFingerprint => Request_[ContainerVersion]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), live = js.Any.fromFunction1(live), publish = js.Any.fromFunction1(publish), set_latest = js.Any.fromFunction1(set_latest), undelete = js.Any.fromFunction1(undelete), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[VersionsResource]
  }
}

