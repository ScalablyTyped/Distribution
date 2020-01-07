package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration to access the SDS server.
  */
@js.native
trait Schema$SdsConfig extends js.Object {
  /**
    * The configuration to access the SDS server over GRPC.
    */
  var grpcServiceConfig: js.UndefOr[Schema$GrpcServiceConfig] = js.native
}

object Schema$SdsConfig {
  @scala.inline
  def apply(grpcServiceConfig: Schema$GrpcServiceConfig = null): Schema$SdsConfig = {
    val __obj = js.Dynamic.literal()
    if (grpcServiceConfig != null) __obj.updateDynamic("grpcServiceConfig")(grpcServiceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SdsConfig]
  }
}

