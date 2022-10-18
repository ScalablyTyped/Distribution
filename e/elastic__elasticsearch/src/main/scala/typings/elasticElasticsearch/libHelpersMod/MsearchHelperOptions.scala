package typings.elasticElasticsearch.libHelpersMod

import typings.elasticElasticsearch.libApiTypesMod.MsearchRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsearchHelperOptions
  extends StObject
     with MsearchRequest {
  
  var concurrency: js.UndefOr[Double] = js.undefined
  
  var flushInterval: js.UndefOr[Double] = js.undefined
  
  var operations: js.UndefOr[Double] = js.undefined
  
  var retries: js.UndefOr[Double] = js.undefined
  
  @JSName("wait")
  var wait_FMsearchHelperOptions: js.UndefOr[Double] = js.undefined
}
object MsearchHelperOptions {
  
  inline def apply(): MsearchHelperOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsearchHelperOptions]
  }
  
  extension [Self <: MsearchHelperOptions](x: Self) {
    
    inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    
    inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    
    inline def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
    
    inline def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
    
    inline def setOperations(value: Double): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
    
    inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
    
    inline def setWait_(value: Double): Self = StObject.set(x, "wait", value.asInstanceOf[js.Any])
    
    inline def setWait_Undefined: Self = StObject.set(x, "wait", js.undefined)
  }
}
