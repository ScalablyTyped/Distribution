package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesDeleteParams
  extends StObject
     with GenericParams {
  
  var ignoreUnavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: NameList
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}
object IndicesDeleteParams {
  
  inline def apply(index: NameList): IndicesDeleteParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesDeleteParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesDeleteParams] (val x: Self) extends AnyVal {
    
    inline def setIgnoreUnavailable(value: Boolean): Self = StObject.set(x, "ignoreUnavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUnavailableUndefined: Self = StObject.set(x, "ignoreUnavailable", js.undefined)
    
    inline def setIndex(value: NameList): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: String*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    inline def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
