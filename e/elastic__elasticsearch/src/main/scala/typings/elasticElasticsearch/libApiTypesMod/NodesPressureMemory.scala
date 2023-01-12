package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesPressureMemory extends StObject {
  
  var all_in_bytes: js.UndefOr[long] = js.undefined
  
  var combined_coordinating_and_primary_in_bytes: js.UndefOr[long] = js.undefined
  
  var coordinating_in_bytes: js.UndefOr[long] = js.undefined
  
  var coordinating_rejections: js.UndefOr[long] = js.undefined
  
  var primary_in_bytes: js.UndefOr[long] = js.undefined
  
  var primary_rejections: js.UndefOr[long] = js.undefined
  
  var replica_in_bytes: js.UndefOr[long] = js.undefined
  
  var replica_rejections: js.UndefOr[long] = js.undefined
}
object NodesPressureMemory {
  
  inline def apply(): NodesPressureMemory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesPressureMemory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesPressureMemory] (val x: Self) extends AnyVal {
    
    inline def setAll_in_bytes(value: long): Self = StObject.set(x, "all_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setAll_in_bytesUndefined: Self = StObject.set(x, "all_in_bytes", js.undefined)
    
    inline def setCombined_coordinating_and_primary_in_bytes(value: long): Self = StObject.set(x, "combined_coordinating_and_primary_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setCombined_coordinating_and_primary_in_bytesUndefined: Self = StObject.set(x, "combined_coordinating_and_primary_in_bytes", js.undefined)
    
    inline def setCoordinating_in_bytes(value: long): Self = StObject.set(x, "coordinating_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setCoordinating_in_bytesUndefined: Self = StObject.set(x, "coordinating_in_bytes", js.undefined)
    
    inline def setCoordinating_rejections(value: long): Self = StObject.set(x, "coordinating_rejections", value.asInstanceOf[js.Any])
    
    inline def setCoordinating_rejectionsUndefined: Self = StObject.set(x, "coordinating_rejections", js.undefined)
    
    inline def setPrimary_in_bytes(value: long): Self = StObject.set(x, "primary_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setPrimary_in_bytesUndefined: Self = StObject.set(x, "primary_in_bytes", js.undefined)
    
    inline def setPrimary_rejections(value: long): Self = StObject.set(x, "primary_rejections", value.asInstanceOf[js.Any])
    
    inline def setPrimary_rejectionsUndefined: Self = StObject.set(x, "primary_rejections", js.undefined)
    
    inline def setReplica_in_bytes(value: long): Self = StObject.set(x, "replica_in_bytes", value.asInstanceOf[js.Any])
    
    inline def setReplica_in_bytesUndefined: Self = StObject.set(x, "replica_in_bytes", js.undefined)
    
    inline def setReplica_rejections(value: long): Self = StObject.set(x, "replica_rejections", value.asInstanceOf[js.Any])
    
    inline def setReplica_rejectionsUndefined: Self = StObject.set(x, "replica_rejections", js.undefined)
  }
}
