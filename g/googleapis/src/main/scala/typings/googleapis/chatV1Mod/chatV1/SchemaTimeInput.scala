package typings.googleapis.chatV1Mod.chatV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeInput extends StObject {
  
  /**
    * The hour on a 24-hour clock.
    */
  var hours: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The number of minutes past the hour. Valid values are 0 to 59.
    */
  var minutes: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTimeInput {
  
  inline def apply(): SchemaTimeInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeInput]
  }
  
  extension [Self <: SchemaTimeInput](x: Self) {
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setHoursNull: Self = StObject.set(x, "hours", null)
    
    inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutesNull: Self = StObject.set(x, "minutes", null)
    
    inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
  }
}
