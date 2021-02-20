package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gRPC config to access the SDS server.
  */
@js.native
trait SchemaGrpcServiceConfig extends StObject {
  
  /**
    * The call credentials to access the SDS server.
    */
  var callCredentials: js.UndefOr[SchemaCallCredentials] = js.native
  
  /**
    * The channel credentials to access the SDS server.
    */
  var channelCredentials: js.UndefOr[SchemaChannelCredentials] = js.native
  
  /**
    * The target URI of the SDS server.
    */
  var targetUri: js.UndefOr[String] = js.native
}
object SchemaGrpcServiceConfig {
  
  @scala.inline
  def apply(): SchemaGrpcServiceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrpcServiceConfig]
  }
  
  @scala.inline
  implicit class SchemaGrpcServiceConfigMutableBuilder[Self <: SchemaGrpcServiceConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallCredentials(value: SchemaCallCredentials): Self = StObject.set(x, "callCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallCredentialsUndefined: Self = StObject.set(x, "callCredentials", js.undefined)
    
    @scala.inline
    def setChannelCredentials(value: SchemaChannelCredentials): Self = StObject.set(x, "channelCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCredentialsUndefined: Self = StObject.set(x, "channelCredentials", js.undefined)
    
    @scala.inline
    def setTargetUri(value: String): Self = StObject.set(x, "targetUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUriUndefined: Self = StObject.set(x, "targetUri", js.undefined)
  }
}
