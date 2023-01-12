package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslWildcardQuery
  extends StObject
     with QueryDslQueryBase {
  
  var case_insensitive: js.UndefOr[Boolean] = js.undefined
  
  var rewrite: js.UndefOr[MultiTermQueryRewrite] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
  
  var wildcard: js.UndefOr[String] = js.undefined
}
object QueryDslWildcardQuery {
  
  inline def apply(): QueryDslWildcardQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryDslWildcardQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslWildcardQuery] (val x: Self) extends AnyVal {
    
    inline def setCase_insensitive(value: Boolean): Self = StObject.set(x, "case_insensitive", value.asInstanceOf[js.Any])
    
    inline def setCase_insensitiveUndefined: Self = StObject.set(x, "case_insensitive", js.undefined)
    
    inline def setRewrite(value: MultiTermQueryRewrite): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
    
    inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWildcard(value: String): Self = StObject.set(x, "wildcard", value.asInstanceOf[js.Any])
    
    inline def setWildcardUndefined: Self = StObject.set(x, "wildcard", js.undefined)
  }
}
