package typings.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cloud asset. This includes all Google Cloud Platform resources, Cloud IAM
  * policies, and other non-GCP assets.
  */
@js.native
trait SchemaAsset extends js.Object {
  
  /**
    * Type of the asset. Example: &quot;google.compute.Disk&quot;.
    */
  var assetType: js.UndefOr[String] = js.native
  
  /**
    * Representation of the actual Cloud IAM policy set on a cloud resource.
    * For each resource, there must be at most one Cloud IAM policy set on it.
    */
  var iamPolicy: js.UndefOr[SchemaPolicy] = js.native
  
  /**
    * The full name of the asset. For example:
    * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
    * See [Resource
    * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
    * for more information.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Representation of the resource.
    */
  var resource: js.UndefOr[SchemaResource] = js.native
}
object SchemaAsset {
  
  @scala.inline
  def apply(): SchemaAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAsset]
  }
  
  @scala.inline
  implicit class SchemaAssetOps[Self <: SchemaAsset] (val x: Self) extends AnyVal {
    
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
    def setAssetType(value: String): Self = this.set("assetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetType: Self = this.set("assetType", js.undefined)
    
    @scala.inline
    def setIamPolicy(value: SchemaPolicy): Self = this.set("iamPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamPolicy: Self = this.set("iamPolicy", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResource(value: SchemaResource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
  }
}
