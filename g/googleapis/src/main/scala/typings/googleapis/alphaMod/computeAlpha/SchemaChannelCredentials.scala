package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * gRPC channel credentials to access the SDS server.
  */
@js.native
trait SchemaChannelCredentials extends js.Object {
  
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
  implicit class SchemaChannelCredentialsOps[Self <: SchemaChannelCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificates(value: SchemaTlsCertificatePaths): Self = this.set("certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificates: Self = this.set("certificates", js.undefined)
    
    @scala.inline
    def setChannelCredentialType(value: String): Self = this.set("channelCredentialType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelCredentialType: Self = this.set("channelCredentialType", js.undefined)
  }
}
