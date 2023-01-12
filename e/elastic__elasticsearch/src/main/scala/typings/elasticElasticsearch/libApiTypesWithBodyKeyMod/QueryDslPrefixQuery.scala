package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslPrefixQuery
  extends StObject
     with QueryDslQueryBase {
  
  var case_insensitive: js.UndefOr[Boolean] = js.undefined
  
  var rewrite: js.UndefOr[MultiTermQueryRewrite] = js.undefined
  
  var value: String
}
object QueryDslPrefixQuery {
  
  inline def apply(value: String): QueryDslPrefixQuery = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslPrefixQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslPrefixQuery] (val x: Self) extends AnyVal {
    
    inline def setCase_insensitive(value: Boolean): Self = StObject.set(x, "case_insensitive", value.asInstanceOf[js.Any])
    
    inline def setCase_insensitiveUndefined: Self = StObject.set(x, "case_insensitive", js.undefined)
    
    inline def setRewrite(value: MultiTermQueryRewrite): Self = StObject.set(x, "rewrite", value.asInstanceOf[js.Any])
    
    inline def setRewriteUndefined: Self = StObject.set(x, "rewrite", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
