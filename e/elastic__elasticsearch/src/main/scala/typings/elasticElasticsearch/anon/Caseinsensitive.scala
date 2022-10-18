package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Field
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Caseinsensitive extends StObject {
  
  var case_insensitive: js.UndefOr[Boolean] = js.undefined
  
  var field: Field
  
  var index_filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var search_after: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var string: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
}
object Caseinsensitive {
  
  inline def apply(field: Field): Caseinsensitive = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caseinsensitive]
  }
  
  extension [Self <: Caseinsensitive](x: Self) {
    
    inline def setCase_insensitive(value: Boolean): Self = StObject.set(x, "case_insensitive", value.asInstanceOf[js.Any])
    
    inline def setCase_insensitiveUndefined: Self = StObject.set(x, "case_insensitive", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setIndex_filter(value: QueryDslQueryContainer): Self = StObject.set(x, "index_filter", value.asInstanceOf[js.Any])
    
    inline def setIndex_filterUndefined: Self = StObject.set(x, "index_filter", js.undefined)
    
    inline def setSearch_after(value: String): Self = StObject.set(x, "search_after", value.asInstanceOf[js.Any])
    
    inline def setSearch_afterUndefined: Self = StObject.set(x, "search_after", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setTimeout(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
