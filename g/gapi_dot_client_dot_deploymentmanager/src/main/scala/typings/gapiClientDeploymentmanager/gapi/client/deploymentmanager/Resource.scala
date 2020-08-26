package typings.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import typings.gapiClientDeploymentmanager.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Resource extends js.Object {
  /** The Access Control Policy set on this resource. */
  var accessControl: js.UndefOr[ResourceAccessControl] = js.native
  /** Output only. The evaluated properties of the resource with references expanded. Returned as serialized YAML. */
  var finalProperties: js.UndefOr[String] = js.native
  /** Output only. Unique identifier for the resource; defined by the server. */
  var id: js.UndefOr[String] = js.native
  /** Output only. Timestamp when the resource was created or acquired, in RFC3339 text format . */
  var insertTime: js.UndefOr[String] = js.native
  /** Output only. URL of the manifest representing the current configuration of this resource. */
  var manifest: js.UndefOr[String] = js.native
  /** Output only. The name of the resource as it appears in the YAML config. */
  var name: js.UndefOr[String] = js.native
  /** Output only. The current properties of the resource before any references have been filled in. Returned as serialized YAML. */
  var properties: js.UndefOr[String] = js.native
  /** Output only. The type of the resource, for example compute.v1.instance, or cloudfunctions.v1beta1.function. */
  var `type`: js.UndefOr[String] = js.native
  /** Output only. If Deployment Manager is currently updating or previewing an update to this resource, the updated configuration appears here. */
  var update: js.UndefOr[ResourceUpdate] = js.native
  /** Output only. Timestamp when the resource was updated, in RFC3339 text format . */
  var updateTime: js.UndefOr[String] = js.native
  /** Output only. The URL of the actual resource. */
  var url: js.UndefOr[String] = js.native
  /** Output only. If warning messages are generated during processing of this resource, this field will be populated. */
  var warnings: js.UndefOr[js.Array[Data]] = js.native
}

object Resource {
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  @scala.inline
  implicit class ResourceOps[Self <: Resource] (val x: Self) extends AnyVal {
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
    def setAccessControl(value: ResourceAccessControl): Self = this.set("accessControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessControl: Self = this.set("accessControl", js.undefined)
    @scala.inline
    def setFinalProperties(value: String): Self = this.set("finalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalProperties: Self = this.set("finalProperties", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInsertTime(value: String): Self = this.set("insertTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInsertTime: Self = this.set("insertTime", js.undefined)
    @scala.inline
    def setManifest(value: String): Self = this.set("manifest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManifest: Self = this.set("manifest", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setProperties(value: String): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdate(value: ResourceUpdate): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWarningsVarargs(value: Data*): Self = this.set("warnings", js.Array(value :_*))
    @scala.inline
    def setWarnings(value: js.Array[Data]): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
  }
  
}

