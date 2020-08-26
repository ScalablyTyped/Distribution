package typings.gapiClientResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceView extends js.Object {
  /** The creation time of the resource view. */
  var creationTimestamp: js.UndefOr[String] = js.native
  /** The detailed description of the resource view. */
  var description: js.UndefOr[String] = js.native
  /** Services endpoint information. */
  var endpoints: js.UndefOr[js.Array[ServiceEndpoint]] = js.native
  /** The fingerprint of the service endpoint information. */
  var fingerprint: js.UndefOr[String] = js.native
  /** [Output Only] The ID of the resource view. */
  var id: js.UndefOr[String] = js.native
  /** Type of the resource. */
  var kind: js.UndefOr[String] = js.native
  /** The labels for events. */
  var labels: js.UndefOr[js.Array[Label]] = js.native
  /** The name of the resource view. */
  var name: js.UndefOr[String] = js.native
  /** The URL of a Compute Engine network to which the resources in the view belong. */
  var network: js.UndefOr[String] = js.native
  /** A list of all resources in the resource view. */
  var resources: js.UndefOr[js.Array[String]] = js.native
  /** [Output Only] A self-link to the resource view. */
  var selfLink: js.UndefOr[String] = js.native
  /** The total number of resources in the resource view. */
  var size: js.UndefOr[Double] = js.native
}

object ResourceView {
  @scala.inline
  def apply(): ResourceView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceView]
  }
  @scala.inline
  implicit class ResourceViewOps[Self <: ResourceView] (val x: Self) extends AnyVal {
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEndpointsVarargs(value: ServiceEndpoint*): Self = this.set("endpoints", js.Array(value :_*))
    @scala.inline
    def setEndpoints(value: js.Array[ServiceEndpoint]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoints: Self = this.set("endpoints", js.undefined)
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLabelsVarargs(value: Label*): Self = this.set("labels", js.Array(value :_*))
    @scala.inline
    def setLabels(value: js.Array[Label]): Self = this.set("labels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setResourcesVarargs(value: String*): Self = this.set("resources", js.Array(value :_*))
    @scala.inline
    def setResources(value: js.Array[String]): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

