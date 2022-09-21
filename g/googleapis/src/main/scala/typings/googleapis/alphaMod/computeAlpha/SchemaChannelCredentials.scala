package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChannelCredentials extends StObject {
  
  /**
    * The call credentials to access the SDS server.
    */
  var certificates: js.UndefOr[SchemaTlsCertificatePaths] = js.undefined
  
  /**
    * The channel credentials to access the SDS server. This field can be set to one of the following: CERTIFICATES: Use TLS certificates to access the SDS server. GCE_VM: Use local GCE VM credentials to access the SDS server.
    */
  var channelCredentialType: js.UndefOr[String | Null] = js.undefined
}
object SchemaChannelCredentials {
  
  inline def apply(): SchemaChannelCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelCredentials]
  }
  
  extension [Self <: SchemaChannelCredentials](x: Self) {
    
    inline def setCertificates(value: SchemaTlsCertificatePaths): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    inline def setChannelCredentialType(value: String): Self = StObject.set(x, "channelCredentialType", value.asInstanceOf[js.Any])
    
    inline def setChannelCredentialTypeNull: Self = StObject.set(x, "channelCredentialType", null)
    
    inline def setChannelCredentialTypeUndefined: Self = StObject.set(x, "channelCredentialType", js.undefined)
  }
}
