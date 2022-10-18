package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestProcessorGrokResponse extends StObject {
  
  var patterns: Record[String, String]
}
object IngestProcessorGrokResponse {
  
  inline def apply(patterns: Record[String, String]): IngestProcessorGrokResponse = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestProcessorGrokResponse]
  }
  
  extension [Self <: IngestProcessorGrokResponse](x: Self) {
    
    inline def setPatterns(value: Record[String, String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
  }
}
