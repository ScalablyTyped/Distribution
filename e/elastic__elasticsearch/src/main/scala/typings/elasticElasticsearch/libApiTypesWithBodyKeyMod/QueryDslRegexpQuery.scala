package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslRegexpQuery
  extends StObject
     with QueryDslQueryBase {
  
  var case_insensitive: js.UndefOr[Boolean] = js.undefined
  
  var flags: js.UndefOr[String] = js.undefined
  
  var max_determinized_states: js.UndefOr[integer] = js.undefined
  
  var rewrite: js.UndefOr[MultiTermQueryRewrite] = js.undefined
  
  var value: String
}
object QueryDslRegexpQuery {
  
  inline def apply(value: String): QueryDslRegexpQuery = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslRegexpQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslRegexpQuery] (val x: Self) extends AnyVal {
    
    inline def setCase_insensitive(value: Boolean): Self = StObject.set(x, "case_insensitive", value.asInstanceOf[js.Any])
    
    inline def setCase_insensitiveUndefined: Self = StObject.set(x, "case_insensitive", js.undefined)
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setMax_determinized_states(value: integer): Self = StObject.set(x, "max_determinized_states", value.asInstanceOf[js.Any])
    
    inline def setMax_determinized_statesUndefined: Self = StObject.set(x, "max_determinized_states", js.undefined)
    
    inline def setRewrite(value: MultiTermQueryRewrite): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
    
    inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
