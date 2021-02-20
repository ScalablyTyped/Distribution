package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about an app.
  */
@js.native
trait SchemaApplication extends StObject {
  
  /**
    * The set of managed properties available to be pre-configured for the app.
    */
  var managedProperties: js.UndefOr[js.Array[SchemaManagedProperty]] = js.native
  
  /**
    * The name of the app in the form
    * enterprises/{enterpriseId}/applications/{package_name}.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The permissions required by the app.
    */
  var permissions: js.UndefOr[js.Array[SchemaApplicationPermission]] = js.native
  
  /**
    * The title of the app. Localized.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaApplication {
  
  @scala.inline
  def apply(): SchemaApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplication]
  }
  
  @scala.inline
  implicit class SchemaApplicationMutableBuilder[Self <: SchemaApplication] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedProperties(value: js.Array[SchemaManagedProperty]): Self = StObject.set(x, "managedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedPropertiesUndefined: Self = StObject.set(x, "managedProperties", js.undefined)
    
    @scala.inline
    def setManagedPropertiesVarargs(value: SchemaManagedProperty*): Self = StObject.set(x, "managedProperties", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPermissions(value: js.Array[SchemaApplicationPermission]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: SchemaApplicationPermission*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
