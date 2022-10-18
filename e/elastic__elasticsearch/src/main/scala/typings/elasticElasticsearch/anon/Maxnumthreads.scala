package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maxnumthreads extends StObject {
  
  var allow_lazy_start: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var max_num_threads: js.UndefOr[integer] = js.undefined
  
  var model_memory_limit: js.UndefOr[String] = js.undefined
}
object Maxnumthreads {
  
  inline def apply(): Maxnumthreads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Maxnumthreads]
  }
  
  extension [Self <: Maxnumthreads](x: Self) {
    
    inline def setAllow_lazy_start(value: Boolean): Self = StObject.set(x, "allow_lazy_start", value.asInstanceOf[js.Any])
    
    inline def setAllow_lazy_startUndefined: Self = StObject.set(x, "allow_lazy_start", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMax_num_threads(value: integer): Self = StObject.set(x, "max_num_threads", value.asInstanceOf[js.Any])
    
    inline def setMax_num_threadsUndefined: Self = StObject.set(x, "max_num_threads", js.undefined)
    
    inline def setModel_memory_limit(value: String): Self = StObject.set(x, "model_memory_limit", value.asInstanceOf[js.Any])
    
    inline def setModel_memory_limitUndefined: Self = StObject.set(x, "model_memory_limit", js.undefined)
  }
}
