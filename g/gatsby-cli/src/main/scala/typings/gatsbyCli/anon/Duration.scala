package typings.gatsbyCli.anon

import typings.gatsbyCli.constantsMod.ActivityStatuses.Cancelled
import typings.gatsbyCli.constantsMod.ActivityTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Duration extends StObject {
  
  var duration: Double
  
  var id: String
  
  var status: Cancelled
  
  var `type`: ActivityTypes
}
object Duration {
  
  inline def apply(duration: Double, id: String, status: Cancelled, `type`: ActivityTypes): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
  
  extension [Self <: Duration](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Cancelled): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: ActivityTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
