package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDataStreamsStatsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var name: js.UndefOr[IndexName] = js.undefined
}
object IndicesDataStreamsStatsRequest {
  
  inline def apply(): IndicesDataStreamsStatsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesDataStreamsStatsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesDataStreamsStatsRequest] (val x: Self) extends AnyVal {
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setName(value: IndexName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
