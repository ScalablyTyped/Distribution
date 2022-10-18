package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestSetSecurityUserProcessor
  extends StObject
     with IngestProcessorBase {
  
  var field: Field
  
  var properties: js.UndefOr[js.Array[String]] = js.undefined
}
object IngestSetSecurityUserProcessor {
  
  inline def apply(field: Field): IngestSetSecurityUserProcessor = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestSetSecurityUserProcessor]
  }
  
  extension [Self <: IngestSetSecurityUserProcessor](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: js.Array[String]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPropertiesVarargs(value: String*): Self = StObject.set(x, "properties", js.Array(value*))
  }
}
