package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The available logging options for this subnetwork.
  */
trait SchemaSubnetworkLogConfig extends StObject {
  
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled.
    * Toggles the aggregation interval for collecting flow logs. Increasing the
    * interval time will reduce the amount of generated flow logs for long
    * lasting connections. Default is an interval of 5 seconds per connection.
    */
  var aggregationInterval: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to enable flow logging for this subnetwork. If this field is not
    * explicitly set, it will not appear in get listings. If not set the
    * default behavior is to disable flow logging.
    */
  var enable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled.
    * The value of the field must be in [0, 1]. Set the sampling rate of VPC
    * flow logs within the subnetwork where 1.0 means all collected logs are
    * reported and 0.0 means no logs are reported. Default is 0.5 which means
    * half of all collected logs are reported.
    */
  var flowSampling: js.UndefOr[Double] = js.undefined
  
  /**
    * Can only be specified if VPC flow logging for this subnetwork is enabled.
    * Configures whether metadata fields should be added to the reported VPC
    * flow logs. Default is INCLUDE_ALL_METADATA.
    */
  var metadata: js.UndefOr[String] = js.undefined
}
object SchemaSubnetworkLogConfig {
  
  inline def apply(): SchemaSubnetworkLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetworkLogConfig]
  }
  
  extension [Self <: SchemaSubnetworkLogConfig](x: Self) {
    
    inline def setAggregationInterval(value: String): Self = StObject.set(x, "aggregationInterval", value.asInstanceOf[js.Any])
    
    inline def setAggregationIntervalUndefined: Self = StObject.set(x, "aggregationInterval", js.undefined)
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setFlowSampling(value: Double): Self = StObject.set(x, "flowSampling", value.asInstanceOf[js.Any])
    
    inline def setFlowSamplingUndefined: Self = StObject.set(x, "flowSampling", js.undefined)
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
