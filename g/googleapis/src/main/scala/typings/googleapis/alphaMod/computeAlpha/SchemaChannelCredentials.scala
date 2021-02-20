package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gRPC channel credentials to access the SDS server.
  */
@js.native
trait SchemaChannelCredentials extends StObject {
  
  /**
    * The call credentials to access the SDS server.
    */
  var certificates: js.UndefOr[SchemaTlsCertificatePaths] = js.native
  
  /**
    * The channel credentials to access the SDS server. This field can be set
    * to one of the following: CERTIFICATES: Use TLS certificates to access the
    * SDS server. GCE_VM: Use local GCE VM credentials to access the SDS
    * server.
    */
  var channelCredentialType: js.UndefOr[String] = js.native
}
object SchemaChannelCredentials {
  
  @scala.inline
  def apply(): SchemaChannelCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelCredentials]
  }
  
  @scala.inline
  implicit class SchemaChannelCredentialsMutableBuilder[Self <: SchemaChannelCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(value: SchemaTlsCertificatePaths): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "certificates", js.undefined)
    
    @scala.inline
    def setChannelCredentialType(value: String): Self = StObject.set(x, "channelCredentialType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelCredentialTypeUndefined: Self = StObject.set(x, "channelCredentialType", js.undefined)
  }
}
