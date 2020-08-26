package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcesListResponse extends js.Object {
  /** A token used to continue a truncated list request. */
  var nextPageToken: js.UndefOr[String] = js.native
  /** Resources contained in this list response. */
  var resources: js.UndefOr[js.Array[Resource]] = js.native
}

object ResourcesListResponse {
  @scala.inline
  def apply(): ResourcesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesListResponse]
  }
  @scala.inline
  implicit class ResourcesListResponseOps[Self <: ResourcesListResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[Resource]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
  
}

