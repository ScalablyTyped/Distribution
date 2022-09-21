package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCallCredentials extends StObject {
  
  /**
    * The type of call credentials to use for GRPC requests to the SDS server. This field can be set to one of the following: - GCE_VM: The local GCE VM service account credentials are used to access the SDS server. - FROM_PLUGIN: Custom authenticator credentials are used to access the SDS server.
    */
  var callCredentialType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom authenticator credentials. Valid if callCredentialType is FROM_PLUGIN.
    */
  var fromPlugin: js.UndefOr[SchemaMetadataCredentialsFromPlugin] = js.undefined
}
object SchemaCallCredentials {
  
  inline def apply(): SchemaCallCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCallCredentials]
  }
  
  extension [Self <: SchemaCallCredentials](x: Self) {
    
    inline def setCallCredentialType(value: String): Self = StObject.set(x, "callCredentialType", value.asInstanceOf[js.Any])
    
    inline def setCallCredentialTypeNull: Self = StObject.set(x, "callCredentialType", null)
    
    inline def setCallCredentialTypeUndefined: Self = StObject.set(x, "callCredentialType", js.undefined)
    
    inline def setFromPlugin(value: SchemaMetadataCredentialsFromPlugin): Self = StObject.set(x, "fromPlugin", value.asInstanceOf[js.Any])
    
    inline def setFromPluginUndefined: Self = StObject.set(x, "fromPlugin", js.undefined)
  }
}
