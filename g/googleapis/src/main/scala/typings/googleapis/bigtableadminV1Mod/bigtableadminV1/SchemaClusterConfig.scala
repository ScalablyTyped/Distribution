package typings.googleapis.bigtableadminV1Mod.bigtableadminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for a cluster.
  */
trait SchemaClusterConfig extends StObject {
  
  /**
    * Autoscaling configuration for this cluster.
    */
  var clusterAutoscalingConfig: js.UndefOr[SchemaClusterAutoscalingConfig] = js.undefined
}
object SchemaClusterConfig {
  
  inline def apply(): SchemaClusterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterConfig]
  }
  
  extension [Self <: SchemaClusterConfig](x: Self) {
    
    inline def setClusterAutoscalingConfig(value: SchemaClusterAutoscalingConfig): Self = StObject.set(x, "clusterAutoscalingConfig", value.asInstanceOf[js.Any])
    
    inline def setClusterAutoscalingConfigUndefined: Self = StObject.set(x, "clusterAutoscalingConfig", js.undefined)
  }
}
