package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityAccesscontextmanagerV1OsConstraint extends StObject {
  
  /**
    * The minimum allowed OS version. If not set, any version of this OS satisfies the constraint. Format: `"major.minor.patch"`. Examples: `"10.5.301"`, `"9.2.1"`.
    */
  var minimumVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The allowed OS type.
    */
  var osType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Only allows requests from devices with a verified Chrome OS. Verifications includes requirements that the device is enterprise-managed, conformant to domain policies, and the caller has permission to call the API targeted by the request.
    */
  var requireVerifiedChromeOs: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleIdentityAccesscontextmanagerV1OsConstraint {
  
  inline def apply(): SchemaGoogleIdentityAccesscontextmanagerV1OsConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityAccesscontextmanagerV1OsConstraint]
  }
  
  extension [Self <: SchemaGoogleIdentityAccesscontextmanagerV1OsConstraint](x: Self) {
    
    inline def setMinimumVersion(value: String): Self = StObject.set(x, "minimumVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumVersionNull: Self = StObject.set(x, "minimumVersion", null)
    
    inline def setMinimumVersionUndefined: Self = StObject.set(x, "minimumVersion", js.undefined)
    
    inline def setOsType(value: String): Self = StObject.set(x, "osType", value.asInstanceOf[js.Any])
    
    inline def setOsTypeNull: Self = StObject.set(x, "osType", null)
    
    inline def setOsTypeUndefined: Self = StObject.set(x, "osType", js.undefined)
    
    inline def setRequireVerifiedChromeOs(value: Boolean): Self = StObject.set(x, "requireVerifiedChromeOs", value.asInstanceOf[js.Any])
    
    inline def setRequireVerifiedChromeOsNull: Self = StObject.set(x, "requireVerifiedChromeOs", null)
    
    inline def setRequireVerifiedChromeOsUndefined: Self = StObject.set(x, "requireVerifiedChromeOs", js.undefined)
  }
}
