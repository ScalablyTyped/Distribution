package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetHttpsProxiesSetCertificateMapRequest extends StObject {
  
  /**
    * URL of the Certificate Map to associate with this TargetHttpsProxy.
    */
  var certificateMap: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetHttpsProxiesSetCertificateMapRequest {
  
  inline def apply(): SchemaTargetHttpsProxiesSetCertificateMapRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetHttpsProxiesSetCertificateMapRequest]
  }
  
  extension [Self <: SchemaTargetHttpsProxiesSetCertificateMapRequest](x: Self) {
    
    inline def setCertificateMap(value: String): Self = StObject.set(x, "certificateMap", value.asInstanceOf[js.Any])
    
    inline def setCertificateMapNull: Self = StObject.set(x, "certificateMap", null)
    
    inline def setCertificateMapUndefined: Self = StObject.set(x, "certificateMap", js.undefined)
  }
}
