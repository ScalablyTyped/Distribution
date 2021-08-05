package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The consumer representation of a version which is a child resource under a
  * `Product` with asset data.
  */
trait SchemaGoogleCloudPrivatecatalogV1beta1Version extends StObject {
  
  /**
    * Output only. The asset which has been validated and is ready to be
    * provisioned. See google.cloud.privatecatalogproducer.v1beta.Version.asset
    * for details.
    */
  var asset: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Output only. The time when the version was created.
    */
  var createTime: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The user-supplied description of the version. Maximum of 256
    * characters.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The resource name of the version, in the format
    * `catalogs/{catalog_id}/products/{product_id}/versions/a-z*[a-z0-9]&#39;.
    * A unique identifier for the version under a product.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The time when the version was last updated.
    */
  var updateTime: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudPrivatecatalogV1beta1Version {
  
  inline def apply(): SchemaGoogleCloudPrivatecatalogV1beta1Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1Version]
  }
  
  extension [Self <: SchemaGoogleCloudPrivatecatalogV1beta1Version](x: Self) {
    
    inline def setAsset(value: StringDictionary[js.Any]): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
