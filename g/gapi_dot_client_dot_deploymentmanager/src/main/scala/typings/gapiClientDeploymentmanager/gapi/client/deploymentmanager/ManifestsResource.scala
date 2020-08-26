package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDeploymentmanager.anon.MaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManifestsResource extends js.Object {
  /** Gets information about a specific manifest. */
  def get(request: typings.gapiClientDeploymentmanager.anon.Deployment): Request[Manifest] = js.native
  /** Lists all manifests for a given deployment. */
  def list(request: MaxResults): Request[ManifestsListResponse] = js.native
}

object ManifestsResource {
  @scala.inline
  def apply(
    get: typings.gapiClientDeploymentmanager.anon.Deployment => Request[Manifest],
    list: MaxResults => Request[ManifestsListResponse]
  ): ManifestsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ManifestsResource]
  }
  @scala.inline
  implicit class ManifestsResourceOps[Self <: ManifestsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: typings.gapiClientDeploymentmanager.anon.Deployment => Request[Manifest]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: MaxResults => Request[ManifestsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

