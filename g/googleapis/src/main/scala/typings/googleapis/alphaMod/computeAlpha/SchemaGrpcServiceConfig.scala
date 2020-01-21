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
  def apply(
    callCredentials: SchemaCallCredentials = null,
    channelCredentials: SchemaChannelCredentials = null,
    targetUri: String = null
  ): SchemaGrpcServiceConfig = {
    val __obj = js.Dynamic.literal()
    if (callCredentials != null) __obj.updateDynamic("callCredentials")(callCredentials.asInstanceOf[js.Any])
    if (channelCredentials != null) __obj.updateDynamic("channelCredentials")(channelCredentials.asInstanceOf[js.Any])
    if (targetUri != null) __obj.updateDynamic("targetUri")(targetUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGrpcServiceConfig]
  }
}

