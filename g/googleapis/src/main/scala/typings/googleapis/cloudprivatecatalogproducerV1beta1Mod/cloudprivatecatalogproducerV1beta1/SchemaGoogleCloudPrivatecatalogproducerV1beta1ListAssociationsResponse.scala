package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse extends js.Object {
  
  /**
    * The returned `Association` resources from the list call.
    */
  var associations: js.UndefOr[js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]] = js.native
  
  /**
    * A pagination token returned from a previous call to `ListAssociations`
    * that indicates where the listing should continue from. This field is
    * optional.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponseOps[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1ListAssociationsResponse] (val x: Self) extends AnyVal {
    
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
    def setAssociationsVarargs(value: SchemaGoogleCloudPrivatecatalogproducerV1beta1Association*): Self = this.set("associations", js.Array(value :_*))
    
    @scala.inline
    def setAssociations(value: js.Array[SchemaGoogleCloudPrivatecatalogproducerV1beta1Association]): Self = this.set("associations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociations: Self = this.set("associations", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
