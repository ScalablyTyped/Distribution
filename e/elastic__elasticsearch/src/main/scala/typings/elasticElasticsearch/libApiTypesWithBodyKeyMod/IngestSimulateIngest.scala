package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSimulateIngest extends StObject {
  
  var pipeline: js.UndefOr[Name] = js.undefined
  
  var timestamp: DateTime
}
object IngestSimulateIngest {
  
  inline def apply(timestamp: DateTime): IngestSimulateIngest = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSimulateIngest]
  }
  
  extension [Self <: IngestSimulateIngest](x: Self) {
    
    inline def setPipeline(value: Name): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setTimestamp(value: DateTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
