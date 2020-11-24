package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The producer representation of a version, which is a child resource under a
  * `Product` with asset data.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1Version extends js.Object {
  
  /**
    * Output only. The asset which has been validated and is ready to be
    * provisioned. See Version.original_asset for the schema.
    */
  var asset: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Output only. The time when the version was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The user-supplied description of the version. Maximum of 256 characters.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. The resource name of the version, in the format
    * `catalogs/{catalog_id}/products/{product_id}/versions/a-z*[a-z0-9]&#39;.
    * A unique identifier for the version under a product, which can&#39;t be
    * changed after the version is created. The final segment of the name must
    * between 1 and 63 characters in length.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The user-supplied asset payload. The maximum size of the payload is 2MB.
    * The JSON schema of the payload is defined as:  ``` type: object
    * properties:   mainTemplate:     type: string     description: The file
    * name of the main template and name prefix of     schema file. The content
    * of the main template should be set in the     imports list. The schema
    * file name is expected to be     &lt;mainTemplate&gt;.schema in the
    * imports list. required: true   imports:     type: array     description:
    * Import template and schema file contents. Required to have     both
    * &lt;mainTemplate&gt; and &lt;mainTemplate&gt;.schema files. required:
    * true     minItems: 2     items:       type: object       properties:
    * name:           type: string         content:           type: string ```
    */
  var originalAsset: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /**
    * Output only. The time when the version was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudPrivatecatalogproducerV1beta1Version {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1VersionOps[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1Version] (val x: Self) extends AnyVal {
    
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
    def setAsset(value: StringDictionary[js.Any]): Self = this.set("asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsset: Self = this.set("asset", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOriginalAsset(value: StringDictionary[js.Any]): Self = this.set("originalAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalAsset: Self = this.set("originalAsset", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
