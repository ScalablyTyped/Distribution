package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Definition extends StObject {
  
  var definition: String
  
  var total_definition_length: long
  
  var total_parts: integer
}
object Definition {
  
  inline def apply(definition: String, total_definition_length: long, total_parts: integer): Definition = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], total_definition_length = total_definition_length.asInstanceOf[js.Any], total_parts = total_parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Definition] (val x: Self) extends AnyVal {
    
    inline def setDefinition(value: String): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    inline def setTotal_definition_length(value: long): Self = StObject.set(x, "total_definition_length", value.asInstanceOf[js.Any])
    
    inline def setTotal_parts(value: integer): Self = StObject.set(x, "total_parts", value.asInstanceOf[js.Any])
  }
}
