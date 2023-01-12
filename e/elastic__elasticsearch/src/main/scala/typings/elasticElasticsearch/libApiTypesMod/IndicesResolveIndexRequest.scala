package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesResolveIndexRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var name: Names
}
object IndicesResolveIndexRequest {
  
  inline def apply(name: Names): IndicesResolveIndexRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesResolveIndexRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesResolveIndexRequest] (val x: Self) extends AnyVal {
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setName(value: Names): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: Name*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
