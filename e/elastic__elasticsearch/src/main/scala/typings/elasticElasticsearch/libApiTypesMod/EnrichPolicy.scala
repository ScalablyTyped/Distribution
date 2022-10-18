package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnrichPolicy extends StObject {
  
  var enrich_fields: Fields
  
  var indices: Indices
  
  var match_field: Field
  
  var name: js.UndefOr[Name] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
}
object EnrichPolicy {
  
  inline def apply(enrich_fields: Fields, indices: Indices, match_field: Field): EnrichPolicy = {
    val __obj = js.Dynamic.literal(enrich_fields = enrich_fields.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], match_field = match_field.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnrichPolicy]
  }
  
  extension [Self <: EnrichPolicy](x: Self) {
    
    inline def setEnrich_fields(value: Fields): Self = StObject.set(x, "enrich_fields", value.asInstanceOf[js.Any])
    
    inline def setEnrich_fieldsVarargs(value: Field*): Self = StObject.set(x, "enrich_fields", js.Array(value*))
    
    inline def setIndices(value: Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMatch_field(value: Field): Self = StObject.set(x, "match_field", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
