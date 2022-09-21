package typings.googleAppsScript.GoogleAppsScript.Addons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary DatePicker formInputs object
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#date-input
  */
trait DateInputObject extends StObject {
  
  var msSinceEpoch: String
}
object DateInputObject {
  
  inline def apply(msSinceEpoch: String): DateInputObject = {
    val __obj = js.Dynamic.literal(msSinceEpoch = msSinceEpoch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateInputObject]
  }
  
  extension [Self <: DateInputObject](x: Self) {
    
    inline def setMsSinceEpoch(value: String): Self = StObject.set(x, "msSinceEpoch", value.asInstanceOf[js.Any])
  }
}
