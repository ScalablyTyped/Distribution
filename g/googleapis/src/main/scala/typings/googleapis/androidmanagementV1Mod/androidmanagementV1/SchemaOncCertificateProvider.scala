package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOncCertificateProvider extends StObject {
  
  /**
    * This feature is not generally available.
    */
  var certificateReferences: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * This feature is not generally available.
    */
  var contentProviderEndpoint: js.UndefOr[SchemaContentProviderEndpoint] = js.undefined
}
object SchemaOncCertificateProvider {
  
  inline def apply(): SchemaOncCertificateProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOncCertificateProvider]
  }
  
  extension [Self <: SchemaOncCertificateProvider](x: Self) {
    
    inline def setCertificateReferences(value: js.Array[String]): Self = StObject.set(x, "certificateReferences", value.asInstanceOf[js.Any])
    
    inline def setCertificateReferencesNull: Self = StObject.set(x, "certificateReferences", null)
    
    inline def setCertificateReferencesUndefined: Self = StObject.set(x, "certificateReferences", js.undefined)
    
    inline def setCertificateReferencesVarargs(value: String*): Self = StObject.set(x, "certificateReferences", js.Array(value*))
    
    inline def setContentProviderEndpoint(value: SchemaContentProviderEndpoint): Self = StObject.set(x, "contentProviderEndpoint", value.asInstanceOf[js.Any])
    
    inline def setContentProviderEndpointUndefined: Self = StObject.set(x, "contentProviderEndpoint", js.undefined)
  }
}
