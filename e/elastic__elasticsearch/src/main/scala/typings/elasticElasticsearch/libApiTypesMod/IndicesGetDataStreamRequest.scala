package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesGetDataStreamRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var name: js.UndefOr[DataStreamNames] = js.undefined
}
object IndicesGetDataStreamRequest {
  
  inline def apply(): IndicesGetDataStreamRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesGetDataStreamRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesGetDataStreamRequest] (val x: Self) extends AnyVal {
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setName(value: DataStreamNames): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNameVarargs(value: DataStreamName*): Self = StObject.set(x, "name", js.Array(value*))
  }
}
