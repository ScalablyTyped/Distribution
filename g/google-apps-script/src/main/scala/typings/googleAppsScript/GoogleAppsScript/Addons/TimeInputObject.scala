package typings.googleAppsScript.GoogleAppsScript.Addons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary TimePicker formInputs object
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#time-input
  */
trait TimeInputObject extends StObject {
  
  var hours: Double
  
  var minutes: Double
}
object TimeInputObject {
  
  inline def apply(hours: Double, minutes: Double): TimeInputObject = {
    val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeInputObject]
  }
  
  extension [Self <: TimeInputObject](x: Self) {
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
  }
}
