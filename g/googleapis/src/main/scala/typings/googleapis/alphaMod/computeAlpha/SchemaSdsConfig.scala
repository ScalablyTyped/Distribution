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
  def apply(): SchemaSdsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSdsConfig]
  }
  @scala.inline
  implicit class SchemaSdsConfigOps[Self <: SchemaSdsConfig] (val x: Self) extends AnyVal {
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
    def setGrpcServiceConfig(value: SchemaGrpcServiceConfig): Self = this.set("grpcServiceConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcServiceConfig: Self = this.set("grpcServiceConfig", js.undefined)
  }
  
}

