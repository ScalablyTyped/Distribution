package typings.googleapis.cloudprivatecatalogV1beta1Mod.cloudprivatecatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The readonly representation of a catalog computed with a given resource
  * context.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogV1beta1Catalog extends StObject {
  
  /**
    * Output only. The time when the catalog was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * Output only. The description of the catalog.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Output only. The descriptive name of the catalog as it appears in UIs.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Output only. The resource name of the target catalog, in the format of
    * `catalogs/{catalog_id}&#39;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Output only. The time when the catalog was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudPrivatecatalogV1beta1Catalog {
  
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogV1beta1Catalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogV1beta1Catalog]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogV1beta1CatalogMutableBuilder[Self <: SchemaGoogleCloudPrivatecatalogV1beta1Catalog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
