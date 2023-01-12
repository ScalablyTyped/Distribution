package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatThreadPoolRequest
  extends StObject
     with CatCatRequestBase {
  
  var thread_pool_patterns: js.UndefOr[Names] = js.undefined
  
  var time: js.UndefOr[TimeUnit] = js.undefined
}
object CatThreadPoolRequest {
  
  inline def apply(): CatThreadPoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatThreadPoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatThreadPoolRequest] (val x: Self) extends AnyVal {
    
    inline def setThread_pool_patterns(value: Names): Self = StObject.set(x, "thread_pool_patterns", value.asInstanceOf[js.Any])
    
    inline def setThread_pool_patternsUndefined: Self = StObject.set(x, "thread_pool_patterns", js.undefined)
    
    inline def setThread_pool_patternsVarargs(value: Name*): Self = StObject.set(x, "thread_pool_patterns", js.Array(value*))
    
    inline def setTime(value: TimeUnit): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
