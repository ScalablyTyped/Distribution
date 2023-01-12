package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatAliasesRequest
  extends StObject
     with CatCatRequestBase {
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var name: js.UndefOr[Names] = js.undefined
}
object CatAliasesRequest {
  
  inline def apply(): CatAliasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatAliasesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatAliasesRequest] (val x: Self) extends AnyVal {
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setName(value: Names): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: Name*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
