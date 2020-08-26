package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gRPC config to access the SDS server.
  */
@js.native
trait SchemaGrpcServiceConfig extends js.Object {
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
  implicit class SchemaGrpcServiceConfigOps[Self <: SchemaGrpcServiceConfig] (val x: Self) extends AnyVal {
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
    def setCallCredentials(value: SchemaCallCredentials): Self = this.set("callCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallCredentials: Self = this.set("callCredentials", js.undefined)
    @scala.inline
    def setChannelCredentials(value: SchemaChannelCredentials): Self = this.set("channelCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelCredentials: Self = this.set("channelCredentials", js.undefined)
    @scala.inline
    def setTargetUri(value: String): Self = this.set("targetUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetUri: Self = this.set("targetUri", js.undefined)
  }
  
}

