package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesCreateParams
  extends StObject
     with GenericParams {
  
  var includeTypeName: js.UndefOr[Boolean] = js.undefined
  
  var index: String
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  
  var updateAllTypes: js.UndefOr[Boolean] = js.undefined
  
  var waitForActiveShards: js.UndefOr[String] = js.undefined
}
object IndicesCreateParams {
  
  inline def apply(index: String): IndicesCreateParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesCreateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesCreateParams] (val x: Self) extends AnyVal {
    
    inline def setIncludeTypeName(value: Boolean): Self = StObject.set(x, "includeTypeName", value.asInstanceOf[js.Any])
    
    inline def setIncludeTypeNameUndefined: Self = StObject.set(x, "includeTypeName", js.undefined)
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    inline def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUpdateAllTypes(value: Boolean): Self = StObject.set(x, "updateAllTypes", value.asInstanceOf[js.Any])
    
    inline def setUpdateAllTypesUndefined: Self = StObject.set(x, "updateAllTypes", js.undefined)
    
    inline def setWaitForActiveShards(value: String): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    inline def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
  }
}
