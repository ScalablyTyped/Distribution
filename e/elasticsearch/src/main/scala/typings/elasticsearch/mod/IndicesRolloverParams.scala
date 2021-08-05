package typings.elasticsearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesRolloverParams
  extends StObject
     with GenericParams {
  
  var alias: js.UndefOr[String] = js.undefined
  
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  
  var newIndex: js.UndefOr[String] = js.undefined
  
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  
  var waitForActiveShards: js.UndefOr[Double | String] = js.undefined
}
object IndicesRolloverParams {
  
  inline def apply(): IndicesRolloverParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesRolloverParams]
  }
  
  extension [Self <: IndicesRolloverParams](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setMasterTimeout(value: TimeSpan): Self = StObject.set(x, "masterTimeout", value.asInstanceOf[js.Any])
    
    inline def setMasterTimeoutUndefined: Self = StObject.set(x, "masterTimeout", js.undefined)
    
    inline def setNewIndex(value: String): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setNewIndexUndefined: Self = StObject.set(x, "newIndex", js.undefined)
    
    inline def setTimeout(value: TimeSpan): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWaitForActiveShards(value: Double | String): Self = StObject.set(x, "waitForActiveShards", value.asInstanceOf[js.Any])
    
    inline def setWaitForActiveShardsUndefined: Self = StObject.set(x, "waitForActiveShards", js.undefined)
  }
}
