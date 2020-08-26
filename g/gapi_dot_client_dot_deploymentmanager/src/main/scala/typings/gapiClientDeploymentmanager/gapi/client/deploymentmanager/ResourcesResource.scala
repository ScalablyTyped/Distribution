package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDeploymentmanager.anon.MaxResults
import typings.gapiClientDeploymentmanager.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcesResource extends js.Object {
  /** Gets information about a single resource. */
  def get(request: PrettyPrint): Request[Resource] = js.native
  /** Lists all resources in a given deployment. */
  def list(request: MaxResults): Request[ResourcesListResponse] = js.native
}

object ResourcesResource {
  @scala.inline
  def apply(get: PrettyPrint => Request[Resource], list: MaxResults => Request[ResourcesListResponse]): ResourcesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ResourcesResource]
  }
  @scala.inline
  implicit class ResourcesResourceOps[Self <: ResourcesResource] (val x: Self) extends AnyVal {
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
    def setGet(value: PrettyPrint => Request[Resource]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[ResourcesListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

