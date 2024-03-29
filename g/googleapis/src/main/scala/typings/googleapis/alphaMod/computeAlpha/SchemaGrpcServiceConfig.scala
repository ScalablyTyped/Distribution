package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrpcServiceConfig extends StObject {
  
  /**
    * The call credentials to access the SDS server.
    */
  var callCredentials: js.UndefOr[SchemaCallCredentials] = js.undefined
  
  /**
    * The channel credentials to access the SDS server.
    */
  var channelCredentials: js.UndefOr[SchemaChannelCredentials] = js.undefined
  
  /**
    * The target URI of the SDS server.
    */
  var targetUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrpcServiceConfig {
  
  inline def apply(): SchemaGrpcServiceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrpcServiceConfig]
  }
  
  extension [Self <: SchemaGrpcServiceConfig](x: Self) {
    
    inline def setCallCredentials(value: SchemaCallCredentials): Self = StObject.set(x, "callCredentials", value.asInstanceOf[js.Any])
    
    inline def setCallCredentialsUndefined: Self = StObject.set(x, "callCredentials", js.undefined)
    
    inline def setChannelCredentials(value: SchemaChannelCredentials): Self = StObject.set(x, "channelCredentials", value.asInstanceOf[js.Any])
    
    inline def setChannelCredentialsUndefined: Self = StObject.set(x, "channelCredentials", js.undefined)
    
    inline def setTargetUri(value: String): Self = StObject.set(x, "targetUri", value.asInstanceOf[js.Any])
    
    inline def setTargetUriNull: Self = StObject.set(x, "targetUri", null)
    
    inline def setTargetUriUndefined: Self = StObject.set(x, "targetUri", js.undefined)
  }
}
