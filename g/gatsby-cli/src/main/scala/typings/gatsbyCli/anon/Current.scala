package typings.gatsbyCli.anon

import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.constantsMod.ActivityTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Current extends StObject {
  
  var current: js.UndefOr[Double] = js.undefined
  
  var id: String
  
  var status: js.UndefOr[ActivityStatuses] = js.undefined
  
  var text: String
  
  var total: js.UndefOr[Double] = js.undefined
  
  var `type`: ActivityTypes
}
object Current {
  
  inline def apply(id: String, text: String, `type`: ActivityTypes): Current = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  extension [Self <: Current](x: Self) {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ActivityStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    inline def setType(value: ActivityTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
