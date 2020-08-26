package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.ContainerVersionId
import typings.gapiClientTagmanager.anon.Fields
import typings.gapiClientTagmanager.anon.Fingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionsResource extends js.Object {
  /** Deletes a Container Version. */
  def delete(request: Fields): Request[Unit] = js.native
  /** Gets a Container Version. */
  def get(request: ContainerVersionId): Request[ContainerVersion] = js.native
  /** Gets the live (i.e. published) container version */
  def live(request: Alt): Request[ContainerVersion] = js.native
  /** Publishes a Container Version. */
  def publish(request: Fingerprint): Request[PublishContainerVersionResponse] = js.native
  /** Sets the latest version used for synchronization of workspaces when detecting conflicts and errors. */
  def set_latest(request: Fields): Request[ContainerVersion] = js.native
  /** Undeletes a Container Version. */
  def undelete(request: Fields): Request[ContainerVersion] = js.native
  /** Updates a Container Version. */
  def update(request: Fingerprint): Request[ContainerVersion] = js.native
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
  @scala.inline
  implicit class VersionsResourceOps[Self <: VersionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: Fields => Request[Unit]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: ContainerVersionId => Request[ContainerVersion]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setLive(value: Alt => Request[ContainerVersion]): Self = this.set("live", js.Any.fromFunction1(value))
    @scala.inline
    def setPublish(value: Fingerprint => Request[PublishContainerVersionResponse]): Self = this.set("publish", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_latest(value: Fields => Request[ContainerVersion]): Self = this.set("set_latest", js.Any.fromFunction1(value))
    @scala.inline
    def setUndelete(value: Fields => Request[ContainerVersion]): Self = this.set("undelete", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdate(value: Fingerprint => Request[ContainerVersion]): Self = this.set("update", js.Any.fromFunction1(value))
  }
  
}

