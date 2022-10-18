package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDataStream extends StObject {
  
  var _meta: js.UndefOr[Metadata] = js.undefined
  
  var allow_custom_routing: js.UndefOr[Boolean] = js.undefined
  
  var generation: integer
  
  var hidden: Boolean
  
  var ilm_policy: js.UndefOr[Name] = js.undefined
  
  var indices: js.Array[IndicesDataStreamIndex]
  
  var name: DataStreamName
  
  var replicated: js.UndefOr[Boolean] = js.undefined
  
  var status: HealthStatus
  
  var system: js.UndefOr[Boolean] = js.undefined
  
  var template: Name
  
  var timestamp_field: IndicesDataStreamTimestampField
}
object IndicesDataStream {
  
  inline def apply(
    generation: integer,
    hidden: Boolean,
    indices: js.Array[IndicesDataStreamIndex],
    name: DataStreamName,
    status: HealthStatus,
    template: Name,
    timestamp_field: IndicesDataStreamTimestampField
  ): IndicesDataStream = {
    val __obj = js.Dynamic.literal(generation = generation.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], timestamp_field = timestamp_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDataStream]
  }
  
  extension [Self <: IndicesDataStream](x: Self) {
    
    inline def setAllow_custom_routing(value: Boolean): Self = StObject.set(x, "allow_custom_routing", value.asInstanceOf[js.Any])
    
    inline def setAllow_custom_routingUndefined: Self = StObject.set(x, "allow_custom_routing", js.undefined)
    
    inline def setGeneration(value: integer): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setIlm_policy(value: Name): Self = StObject.set(x, "ilm_policy", value.asInstanceOf[js.Any])
    
    inline def setIlm_policyUndefined: Self = StObject.set(x, "ilm_policy", js.undefined)
    
    inline def setIndices(value: js.Array[IndicesDataStreamIndex]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: IndicesDataStreamIndex*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setName(value: DataStreamName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReplicated(value: Boolean): Self = StObject.set(x, "replicated", value.asInstanceOf[js.Any])
    
    inline def setReplicatedUndefined: Self = StObject.set(x, "replicated", js.undefined)
    
    inline def setStatus(value: HealthStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSystem(value: Boolean): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setTemplate(value: Name): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_field(value: IndicesDataStreamTimestampField): Self = StObject.set(x, "timestamp_field", value.asInstanceOf[js.Any])
    
    inline def set_meta(value: Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
