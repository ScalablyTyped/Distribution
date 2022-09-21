package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceCalendarlistInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Whether to use the foregroundColor and backgroundColor fields to write the calendar colors (RGB). If this feature is used, the index-based colorId field will be set to the best matching option automatically. Optional. The default is False.
    */
  var colorRgbFormat: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCalendarListEntry] = js.undefined
}
object ParamsResourceCalendarlistInsert {
  
  inline def apply(): ParamsResourceCalendarlistInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCalendarlistInsert]
  }
  
  extension [Self <: ParamsResourceCalendarlistInsert](x: Self) {
    
    inline def setColorRgbFormat(value: Boolean): Self = StObject.set(x, "colorRgbFormat", value.asInstanceOf[js.Any])
    
    inline def setColorRgbFormatUndefined: Self = StObject.set(x, "colorRgbFormat", js.undefined)
    
    inline def setRequestBody(value: SchemaCalendarListEntry): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
