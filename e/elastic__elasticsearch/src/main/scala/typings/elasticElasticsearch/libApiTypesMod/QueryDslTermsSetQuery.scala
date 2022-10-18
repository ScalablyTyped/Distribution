package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslTermsSetQuery
  extends StObject
     with QueryDslQueryBase {
  
  var minimum_should_match_field: js.UndefOr[Field] = js.undefined
  
  var minimum_should_match_script: js.UndefOr[Script] = js.undefined
  
  var terms: js.Array[String]
}
object QueryDslTermsSetQuery {
  
  inline def apply(terms: js.Array[String]): QueryDslTermsSetQuery = {
    val __obj = js.Dynamic.literal(terms = terms.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslTermsSetQuery]
  }
  
  extension [Self <: QueryDslTermsSetQuery](x: Self) {
    
    inline def setMinimum_should_match_field(value: Field): Self = StObject.set(x, "minimum_should_match_field", value.asInstanceOf[js.Any])
    
    inline def setMinimum_should_match_fieldUndefined: Self = StObject.set(x, "minimum_should_match_field", js.undefined)
    
    inline def setMinimum_should_match_script(value: Script): Self = StObject.set(x, "minimum_should_match_script", value.asInstanceOf[js.Any])
    
    inline def setMinimum_should_match_scriptUndefined: Self = StObject.set(x, "minimum_should_match_script", js.undefined)
    
    inline def setTerms(value: js.Array[String]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsVarargs(value: String*): Self = StObject.set(x, "terms", js.Array(value*))
  }
}
