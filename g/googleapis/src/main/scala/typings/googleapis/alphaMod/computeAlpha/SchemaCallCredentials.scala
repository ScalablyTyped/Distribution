package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gRPC call credentials to access the SDS server.
  */
@js.native
trait SchemaCallCredentials extends StObject {
  
  /**
    * The access token that is used as call credential for the SDS server. This
    * field is used only if callCredentialType is ACCESS_TOKEN.
    */
  var accessToken: js.UndefOr[String] = js.native
  
  /**
    * The type of call credentials to use for GRPC requests to the SDS server.
    * This field can be set to one of the following: ACCESS_TOKEN: An access
    * token is used as call credentials for the SDS server. GCE_VM: The local
    * GCE VM service account credentials are used to access the SDS server.
    * JWT_SERVICE_TOKEN: The user provisioned service account credentials are
    * used to access the SDS server. FROM_PLUGIN: Custom authenticator
    * credentials are used to access the SDS server.
    */
  var callCredentialType: js.UndefOr[String] = js.native
  
  /**
    * Custom authenticator credentials.
    */
  var fromPlugin: js.UndefOr[SchemaMetadataCredentialsFromPlugin] = js.native
  
  /**
    * This service account credentials are used as call credentials for the SDS
    * server. This field is used only if callCredentialType is
    * JWT_SERVICE_ACCOUNT.
    */
  var jwtServiceAccount: js.UndefOr[SchemaServiceAccountJwtAccessCredentials] = js.native
}
object SchemaCallCredentials {
  
  @scala.inline
  def apply(): SchemaCallCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCallCredentials]
  }
  
  @scala.inline
  implicit class SchemaCallCredentialsMutableBuilder[Self <: SchemaCallCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setCallCredentialType(value: String): Self = StObject.set(x, "callCredentialType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallCredentialTypeUndefined: Self = StObject.set(x, "callCredentialType", js.undefined)
    
    @scala.inline
    def setFromPlugin(value: SchemaMetadataCredentialsFromPlugin): Self = StObject.set(x, "fromPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromPluginUndefined: Self = StObject.set(x, "fromPlugin", js.undefined)
    
    @scala.inline
    def setJwtServiceAccount(value: SchemaServiceAccountJwtAccessCredentials): Self = StObject.set(x, "jwtServiceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJwtServiceAccountUndefined: Self = StObject.set(x, "jwtServiceAccount", js.undefined)
  }
}
