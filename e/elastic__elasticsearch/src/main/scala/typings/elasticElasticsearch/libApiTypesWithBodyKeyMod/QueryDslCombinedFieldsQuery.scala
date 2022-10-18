package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslCombinedFieldsQuery
  extends StObject
     with QueryDslQueryBase {
  
  var auto_generate_synonyms_phrase_query: js.UndefOr[Boolean] = js.undefined
  
  var fields: js.Array[Field]
  
  var minimum_should_match: js.UndefOr[MinimumShouldMatch] = js.undefined
  
  var operator: js.UndefOr[QueryDslCombinedFieldsOperator] = js.undefined
  
  var query: String
  
  var zero_terms_query: js.UndefOr[QueryDslCombinedFieldsZeroTerms] = js.undefined
}
object QueryDslCombinedFieldsQuery {
  
  inline def apply(fields: js.Array[Field], query: String): QueryDslCombinedFieldsQuery = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslCombinedFieldsQuery]
  }
  
  extension [Self <: QueryDslCombinedFieldsQuery](x: Self) {
    
    inline def setAuto_generate_synonyms_phrase_query(value: Boolean): Self = StObject.set(x, "auto_generate_synonyms_phrase_query", value.asInstanceOf[js.Any])
    
    inline def setAuto_generate_synonyms_phrase_queryUndefined: Self = StObject.set(x, "auto_generate_synonyms_phrase_query", js.undefined)
    
    inline def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setMinimum_should_match(value: MinimumShouldMatch): Self = StObject.set(x, "minimum_should_match", value.asInstanceOf[js.Any])
    
    inline def setMinimum_should_matchUndefined: Self = StObject.set(x, "minimum_should_match", js.undefined)
    
    inline def setOperator(value: QueryDslCombinedFieldsOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setZero_terms_query(value: QueryDslCombinedFieldsZeroTerms): Self = StObject.set(x, "zero_terms_query", value.asInstanceOf[js.Any])
    
    inline def setZero_terms_queryUndefined: Self = StObject.set(x, "zero_terms_query", js.undefined)
  }
}
