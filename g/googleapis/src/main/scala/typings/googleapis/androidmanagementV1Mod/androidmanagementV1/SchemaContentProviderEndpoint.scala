package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentProviderEndpoint extends StObject {
  
  /**
    * This feature is not generally available.
    */
  var packageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. This feature is not generally available.
    */
  var signingCertsSha256: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * This feature is not generally available.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentProviderEndpoint {
  
  inline def apply(): SchemaContentProviderEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentProviderEndpoint]
  }
  
  extension [Self <: SchemaContentProviderEndpoint](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameNull: Self = StObject.set(x, "packageName", null)
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setSigningCertsSha256(value: js.Array[String]): Self = StObject.set(x, "signingCertsSha256", value.asInstanceOf[js.Any])
    
    inline def setSigningCertsSha256Null: Self = StObject.set(x, "signingCertsSha256", null)
    
    inline def setSigningCertsSha256Undefined: Self = StObject.set(x, "signingCertsSha256", js.undefined)
    
    inline def setSigningCertsSha256Varargs(value: String*): Self = StObject.set(x, "signingCertsSha256", js.Array(value*))
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
