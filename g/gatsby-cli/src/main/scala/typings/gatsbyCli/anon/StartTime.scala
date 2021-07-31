package typings.gatsbyCli.anon

import typings.gatsbyCli.constantsMod.ActivityStatuses
import typings.gatsbyCli.constantsMod.ActivityTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTime extends StObject {
  
  var id: String
  
  var startTime: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var status: ActivityStatuses
  
  var `type`: ActivityTypes
}
object StartTime {
  
  @scala.inline
  def apply(id: String, status: ActivityStatuses, `type`: ActivityTypes): StartTime = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTime]
  }
  
  @scala.inline
  implicit class StartTimeMutableBuilder[Self <: StartTime] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatus(value: ActivityStatuses): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ActivityTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
