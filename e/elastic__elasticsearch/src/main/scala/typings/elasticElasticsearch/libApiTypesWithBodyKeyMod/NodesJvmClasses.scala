package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesJvmClasses extends StObject {
  
  var current_loaded_count: js.UndefOr[long] = js.undefined
  
  var total_loaded_count: js.UndefOr[long] = js.undefined
  
  var total_unloaded_count: js.UndefOr[long] = js.undefined
}
object NodesJvmClasses {
  
  inline def apply(): NodesJvmClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesJvmClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesJvmClasses] (val x: Self) extends AnyVal {
    
    inline def setCurrent_loaded_count(value: long): Self = StObject.set(x, "current_loaded_count", value.asInstanceOf[js.Any])
    
    inline def setCurrent_loaded_countUndefined: Self = StObject.set(x, "current_loaded_count", js.undefined)
    
    inline def setTotal_loaded_count(value: long): Self = StObject.set(x, "total_loaded_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_loaded_countUndefined: Self = StObject.set(x, "total_loaded_count", js.undefined)
    
    inline def setTotal_unloaded_count(value: long): Self = StObject.set(x, "total_unloaded_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_unloaded_countUndefined: Self = StObject.set(x, "total_unloaded_count", js.undefined)
  }
}
