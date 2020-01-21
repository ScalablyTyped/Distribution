package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration to access the SDS server.
  */
@js.native
trait SchemaSdsConfig extends js.Object {
  /**
    * The configuration to access the SDS server over GRPC.
    */
  var grpcServiceConfig: js.UndefOr[SchemaGrpcServiceConfig] = js.native
}

object SchemaSdsConfig {
  @scala.inline
  def apply(grpcServiceConfig: SchemaGrpcServiceConfig = null): SchemaSdsConfig = {
    val __obj = js.Dynamic.literal()
    if (grpcServiceConfig != null) __obj.updateDynamic("grpcServiceConfig")(grpcServiceConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSdsConfig]
  }
}

