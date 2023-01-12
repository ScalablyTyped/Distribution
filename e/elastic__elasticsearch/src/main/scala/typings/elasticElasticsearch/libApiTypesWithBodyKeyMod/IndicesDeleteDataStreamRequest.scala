package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDeleteDataStreamRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var name: DataStreamNames
}
object IndicesDeleteDataStreamRequest {
  
  inline def apply(name: DataStreamNames): IndicesDeleteDataStreamRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDeleteDataStreamRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesDeleteDataStreamRequest] (val x: Self) extends AnyVal {
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setName(value: DataStreamNames): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: DataStreamName*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
