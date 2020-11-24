package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for PrivateCatalog.SearchVersions.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse extends js.Object {
  
  /**
    * A pagination token returned from a previous call to SearchVersions that
    * indicates from where the listing should continue. This field is optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The `Version` resources computed from the resource context.
    */
  var versions: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Version]] = js.native
}
object SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponseOps[Self <: SchemaGoogleCloudPrivatecatalogV1beta1SearchVersionsResponse] (val x: Self) extends AnyVal {
    
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
    def setVersionsVarargs(value: SchemaGoogleCloudPrivatecatalogV1beta1Version*): Self = this.set("versions", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: js.Array[SchemaGoogleCloudPrivatecatalogV1beta1Version]): Self = this.set("versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersions: Self = this.set("versions", js.undefined)
  }
}
