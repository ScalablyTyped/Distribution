package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an app.
  */
trait SchemaApplication extends StObject {
  
  /**
    * The set of managed properties available to be pre-configured for the app.
    */
  var managedProperties: js.UndefOr[js.Array[SchemaManagedProperty]] = js.undefined
  
  /**
    * The name of the app in the form
    * enterprises/{enterpriseId}/applications/{package_name}.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The permissions required by the app.
    */
  var permissions: js.UndefOr[js.Array[SchemaApplicationPermission]] = js.undefined
  
  /**
    * The title of the app. Localized.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaApplication {
  
  inline def apply(): SchemaApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplication]
  }
  
  extension [Self <: SchemaApplication](x: Self) {
    
    inline def setManagedProperties(value: js.Array[SchemaManagedProperty]): Self = StObject.set(x, "managedProperties", value.asInstanceOf[js.Any])
    
    inline def setManagedPropertiesUndefined: Self = StObject.set(x, "managedProperties", js.undefined)
    
    inline def setManagedPropertiesVarargs(value: SchemaManagedProperty*): Self = StObject.set(x, "managedProperties", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissions(value: js.Array[SchemaApplicationPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: SchemaApplicationPermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
