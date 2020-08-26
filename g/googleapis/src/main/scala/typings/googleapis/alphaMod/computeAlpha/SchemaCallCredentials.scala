package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gRPC call credentials to access the SDS server.
  */
@js.native
trait SchemaCallCredentials extends js.Object {
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
  implicit class SchemaCallCredentialsOps[Self <: SchemaCallCredentials] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setCallCredentialType(value: String): Self = this.set("callCredentialType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallCredentialType: Self = this.set("callCredentialType", js.undefined)
    @scala.inline
    def setFromPlugin(value: SchemaMetadataCredentialsFromPlugin): Self = this.set("fromPlugin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFromPlugin: Self = this.set("fromPlugin", js.undefined)
    @scala.inline
    def setJwtServiceAccount(value: SchemaServiceAccountJwtAccessCredentials): Self = this.set("jwtServiceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJwtServiceAccount: Self = this.set("jwtServiceAccount", js.undefined)
  }
  
}

