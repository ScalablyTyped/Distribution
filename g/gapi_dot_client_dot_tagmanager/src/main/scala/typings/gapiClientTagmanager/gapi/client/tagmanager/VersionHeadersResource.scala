package typings.gapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientTagmanager.anon.Alt
import typings.gapiClientTagmanager.anon.IncludeDeleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionHeadersResource extends js.Object {
  /** Gets the latest container version header */
  def latest(request: Alt): Request[ContainerVersionHeader] = js.native
  /** Lists all Container Versions of a GTM Container. */
  def list(request: IncludeDeleted): Request[ListContainerVersionsResponse] = js.native
}

object VersionHeadersResource {
  @scala.inline
  def apply(
    latest: Alt => Request[ContainerVersionHeader],
    list: IncludeDeleted => Request[ListContainerVersionsResponse]
  ): VersionHeadersResource = {
    val __obj = js.Dynamic.literal(latest = js.Any.fromFunction1(latest), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VersionHeadersResource]
  }
  @scala.inline
  implicit class VersionHeadersResourceOps[Self <: VersionHeadersResource] (val x: Self) extends AnyVal {
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
    def setLatest(value: Alt => Request[ContainerVersionHeader]): Self = this.set("latest", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: IncludeDeleted => Request[ListContainerVersionsResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

