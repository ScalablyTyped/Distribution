package typings.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterRequest extends js.Object {
  /**
    * A [cluster
    * resource](/container-engine/reference/rest/v1/projects.zones.clusters)
    */
  var cluster: js.UndefOr[Cluster] = js.native
}

object CreateClusterRequest {
  @scala.inline
  def apply(): CreateClusterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterRequest]
  }
  @scala.inline
  implicit class CreateClusterRequestOps[Self <: CreateClusterRequest] (val x: Self) extends AnyVal {
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
    def setCluster(value: Cluster): Self = this.set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCluster: Self = this.set("cluster", js.undefined)
  }
  
}

