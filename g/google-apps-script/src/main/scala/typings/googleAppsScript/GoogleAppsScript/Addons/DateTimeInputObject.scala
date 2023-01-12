package typings.googleAppsScript.GoogleAppsScript.Addons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary DateTimePicker formInputs object
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#date-time-input
  */
trait DateTimeInputObject extends StObject {
  
  var hasDate: Boolean
  
  var hasTime: Boolean
  
  var msSinceEpoch: String
}
object DateTimeInputObject {
  
  inline def apply(hasDate: Boolean, hasTime: Boolean, msSinceEpoch: String): DateTimeInputObject = {
    val __obj = js.Dynamic.literal(hasDate = hasDate.asInstanceOf[js.Any], hasTime = hasTime.asInstanceOf[js.Any], msSinceEpoch = msSinceEpoch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeInputObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DateTimeInputObject] (val x: Self) extends AnyVal {
    
    inline def setHasDate(value: Boolean): Self = StObject.set(x, "hasDate", value.asInstanceOf[js.Any])
    
    inline def setHasTime(value: Boolean): Self = StObject.set(x, "hasTime", value.asInstanceOf[js.Any])
    
    inline def setMsSinceEpoch(value: String): Self = StObject.set(x, "msSinceEpoch", value.asInstanceOf[js.Any])
  }
}
