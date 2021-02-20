package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The configuration to access the SDS server.
  */
@js.native
trait SchemaSdsConfig extends StObject {
  
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
  implicit class SchemaSdsConfigMutableBuilder[Self <: SchemaSdsConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrpcServiceConfig(value: SchemaGrpcServiceConfig): Self = StObject.set(x, "grpcServiceConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrpcServiceConfigUndefined: Self = StObject.set(x, "grpcServiceConfig", js.undefined)
  }
}
