package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetSslProxiesSetCertificateMapRequest extends StObject {
  
  /**
    * URL of the Certificate Map to associate with this TargetSslProxy.
    */
  var certificateMap: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetSslProxiesSetCertificateMapRequest {
  
  inline def apply(): SchemaTargetSslProxiesSetCertificateMapRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetSslProxiesSetCertificateMapRequest]
  }
  
  extension [Self <: SchemaTargetSslProxiesSetCertificateMapRequest](x: Self) {
    
    inline def setCertificateMap(value: String): Self = StObject.set(x, "certificateMap", value.asInstanceOf[js.Any])
    
    inline def setCertificateMapNull: Self = StObject.set(x, "certificateMap", null)
    
    inline def setCertificateMapUndefined: Self = StObject.set(x, "certificateMap", js.undefined)
  }
}
