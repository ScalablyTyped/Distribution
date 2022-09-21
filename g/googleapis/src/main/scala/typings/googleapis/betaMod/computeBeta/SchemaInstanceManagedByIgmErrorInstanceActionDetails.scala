package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceManagedByIgmErrorInstanceActionDetails extends StObject {
  
  /**
    * [Output Only] Action that managed instance group was executing on the instance when the error occurred. Possible values:
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The URL of the instance. The URL can be set even if the instance has not yet been created.
    */
  var instance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] Version this instance was created from, or was being created from, but the creation failed. Corresponds to one of the versions that were set on the Instance Group Manager resource at the time this instance was being created.
    */
  var version: js.UndefOr[SchemaManagedInstanceVersion] = js.undefined
}
object SchemaInstanceManagedByIgmErrorInstanceActionDetails {
  
  inline def apply(): SchemaInstanceManagedByIgmErrorInstanceActionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceManagedByIgmErrorInstanceActionDetails]
  }
  
  extension [Self <: SchemaInstanceManagedByIgmErrorInstanceActionDetails](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setVersion(value: SchemaManagedInstanceVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
