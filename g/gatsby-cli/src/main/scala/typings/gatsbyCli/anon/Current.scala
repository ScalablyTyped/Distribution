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
  
  @scala.inline
  def apply(id: String, text: String, `type`: ActivityTypes): Current = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit class CurrentMutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ActivityStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    
    @scala.inline
    def setType(value: ActivityTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
