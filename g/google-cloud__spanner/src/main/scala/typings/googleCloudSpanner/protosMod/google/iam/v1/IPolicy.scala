package typings.googleCloudSpanner.protosMod.google.iam.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Policy. */
trait IPolicy extends StObject {
  
  /** Policy auditConfigs */
  var auditConfigs: js.UndefOr[js.Array[IAuditConfig] | Null] = js.undefined
  
  /** Policy bindings */
  var bindings: js.UndefOr[js.Array[IBinding] | Null] = js.undefined
  
  /** Policy etag */
  var etag: js.UndefOr[js.typedarray.Uint8Array | String | Null] = js.undefined
  
  /** Policy version */
  var version: js.UndefOr[Double | Null] = js.undefined
}
object IPolicy {
  
  inline def apply(): IPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolicy]
  }
  
  extension [Self <: IPolicy](x: Self) {
    
    inline def setAuditConfigs(value: js.Array[IAuditConfig]): Self = StObject.set(x, "auditConfigs", value.asInstanceOf[js.Any])
    
    inline def setAuditConfigsNull: Self = StObject.set(x, "auditConfigs", null)
    
    inline def setAuditConfigsUndefined: Self = StObject.set(x, "auditConfigs", js.undefined)
    
    inline def setAuditConfigsVarargs(value: IAuditConfig*): Self = StObject.set(x, "auditConfigs", js.Array(value*))
    
    inline def setBindings(value: js.Array[IBinding]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsNull: Self = StObject.set(x, "bindings", null)
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: IBinding*): Self = StObject.set(x, "bindings", js.Array(value*))
    
    inline def setEtag(value: js.typedarray.Uint8Array | String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
