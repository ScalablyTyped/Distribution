package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesShrinkParams
  extends StObject
     with GenericParams {
  
  var index: String
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var target: String
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  
  var waitForActiveShards: js.UndefOr[String | Double] = js.undefined
}
object IndicesShrinkParams {
  
  inline def apply(index: String, target: String): IndicesShrinkParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesShrinkParams]
  }
  
  extension [Self <: IndicesShrinkParams](x: Self) {
    
    inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitForActiveShards(value: String | Double): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    inline def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
  }
}
