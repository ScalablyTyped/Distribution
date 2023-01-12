package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestGrokProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var ignore_missing: js.UndefOr[Boolean] = js.undefined
  
  var pattern_definitions: js.UndefOr[Record[String, String]] = js.undefined
  
  var patterns: js.Array[String]
  
  var trace_match: js.UndefOr[Boolean] = js.undefined
}
object IngestGrokProcessor {
  
  inline def apply(field: Field, patterns: js.Array[String]): IngestGrokProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestGrokProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestGrokProcessor] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missing(value: Boolean): Self = StObject.set(x, "ignore_missing", value.asInstanceOf[js.Any])
    
    inline def setIgnore_missingUndefined: Self = StObject.set(x, "ignore_missing", js.undefined)
    
    inline def setPattern_definitions(value: Record[String, String]): Self = StObject.set(x, "pattern_definitions", value.asInstanceOf[js.Any])
    
    inline def setPattern_definitionsUndefined: Self = StObject.set(x, "pattern_definitions", js.undefined)
    
    inline def setPatterns(value: js.Array[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setPatternsVarargs(value: String*): Self = StObject.set(x, "patterns", js.Array(value*))
    
    inline def setTrace_match(value: Boolean): Self = StObject.set(x, "trace_match", value.asInstanceOf[js.Any])
    
    inline def setTrace_matchUndefined: Self = StObject.set(x, "trace_match", js.undefined)
  }
}
