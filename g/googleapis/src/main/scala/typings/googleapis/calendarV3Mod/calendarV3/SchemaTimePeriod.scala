package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimePeriod extends StObject {
  
  /**
    * The (exclusive) end of the time period.
    */
  var end: js.UndefOr[String] = js.undefined
  
  /**
    * The (inclusive) start of the time period.
    */
  var start: js.UndefOr[String] = js.undefined
}
object SchemaTimePeriod {
  
  inline def apply(): SchemaTimePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimePeriod]
  }
  
  extension [Self <: SchemaTimePeriod](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
