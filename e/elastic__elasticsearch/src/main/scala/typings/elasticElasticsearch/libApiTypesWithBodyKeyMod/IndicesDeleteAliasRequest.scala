package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDeleteAliasRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var index: Indices
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var name: Names
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object IndicesDeleteAliasRequest {
  
  inline def apply(index: Indices, name: Names): IndicesDeleteAliasRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDeleteAliasRequest]
  }
  
  extension [Self <: IndicesDeleteAliasRequest](x: Self) {
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setName(value: Names): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: Name*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
