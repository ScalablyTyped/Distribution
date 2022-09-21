package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSdsConfig extends StObject {
  
  /**
    * The configuration to access the SDS server over GRPC.
    */
  var grpcServiceConfig: js.UndefOr[SchemaGrpcServiceConfig] = js.undefined
}
object SchemaSdsConfig {
  
  inline def apply(): SchemaSdsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSdsConfig]
  }
  
  extension [Self <: SchemaSdsConfig](x: Self) {
    
    inline def setGrpcServiceConfig(value: SchemaGrpcServiceConfig): Self = StObject.set(x, "grpcServiceConfig", value.asInstanceOf[js.Any])
    
    inline def setGrpcServiceConfigUndefined: Self = StObject.set(x, "grpcServiceConfig", js.undefined)
  }
}
