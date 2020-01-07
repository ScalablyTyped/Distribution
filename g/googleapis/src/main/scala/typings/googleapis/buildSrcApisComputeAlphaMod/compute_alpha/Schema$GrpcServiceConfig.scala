package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gRPC config to access the SDS server.
  */
@js.native
trait Schema$GrpcServiceConfig extends js.Object {
  /**
    * The call credentials to access the SDS server.
    */
  var callCredentials: js.UndefOr[Schema$CallCredentials] = js.native
  /**
    * The channel credentials to access the SDS server.
    */
  var channelCredentials: js.UndefOr[Schema$ChannelCredentials] = js.native
  /**
    * The target URI of the SDS server.
    */
  var targetUri: js.UndefOr[String] = js.native
}

object Schema$GrpcServiceConfig {
  @scala.inline
  def apply(
    callCredentials: Schema$CallCredentials = null,
    channelCredentials: Schema$ChannelCredentials = null,
    targetUri: String = null
  ): Schema$GrpcServiceConfig = {
    val __obj = js.Dynamic.literal()
    if (callCredentials != null) __obj.updateDynamic("callCredentials")(callCredentials.asInstanceOf[js.Any])
    if (channelCredentials != null) __obj.updateDynamic("channelCredentials")(channelCredentials.asInstanceOf[js.Any])
    if (targetUri != null) __obj.updateDynamic("targetUri")(targetUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GrpcServiceConfig]
  }
}

