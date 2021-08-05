package typings.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The producer representation of a version, which is a child resource under a
  * `Product` with asset data.
  */
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1Version extends StObject {
  
  /**
    * Output only. The asset which has been validated and is ready to be
    * provisioned. See Version.original_asset for the schema.
    */
  var asset: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Output only. The time when the version was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * The user-supplied description of the version. Maximum of 256 characters.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the version, in the format
    * `catalogs/{catalog_id}/products/{product_id}/versions/a-z*[a-z0-9]&#39;.
    * A unique identifier for the version under a product, which can&#39;t be
    * changed after the version is created. The final segment of the name must
    * between 1 and 63 characters in length.
    */
  var name: js.UndefOr[String] = js.undefined
  
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
  var originalAsset: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Output only. The time when the version was last updated.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudPrivatecatalogproducerV1beta1Version {
  
  inline def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]
  }
  
  extension [Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1Version](x: Self) {
    
    inline def setAsset(value: StringDictionary[js.Any]): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalAsset(value: StringDictionary[js.Any]): Self = StObject.set(x, "originalAsset", value.asInstanceOf[js.Any])
    
    inline def setOriginalAssetUndefined: Self = StObject.set(x, "originalAsset", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
