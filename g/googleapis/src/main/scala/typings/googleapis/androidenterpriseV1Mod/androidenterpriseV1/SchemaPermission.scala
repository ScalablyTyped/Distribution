package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Permissions resource represents some extra capability, to be granted to
  * an Android app, which requires explicit consent. An enterprise admin must
  * consent to these permissions on behalf of their users before an entitlement
  * for the app can be created.  The permissions collection is read-only. The
  * information provided for each permission (localized name and description)
  * is intended to be used in the MDM user interface when obtaining consent
  * from the enterprise.
  */
trait SchemaPermission extends StObject {
  
  /**
    * A longer description of the Permissions resource, giving more details of
    * what it affects.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#permission&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the permission.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * An opaque string uniquely identifying the permission.
    */
  var permissionId: js.UndefOr[String] = js.undefined
}
object SchemaPermission {
  
  inline def apply(): SchemaPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPermission]
  }
  
  extension [Self <: SchemaPermission](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissionId(value: String): Self = StObject.set(x, "permissionId", value.asInstanceOf[js.Any])
    
    inline def setPermissionIdUndefined: Self = StObject.set(x, "permissionId", js.undefined)
  }
}
