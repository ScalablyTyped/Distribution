package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1GraphicsStatusReport extends StObject {
  
  /**
    * Output only. Information about the displays for the device.
    */
  var displays: js.UndefOr[js.Array[SchemaGoogleChromeManagementV1DisplayInfo]] = js.undefined
  
  /**
    * Output only. Time at which the graphics data was reported.
    */
  var reportTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1GraphicsStatusReport {
  
  inline def apply(): SchemaGoogleChromeManagementV1GraphicsStatusReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1GraphicsStatusReport]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1GraphicsStatusReport](x: Self) {
    
    inline def setDisplays(value: js.Array[SchemaGoogleChromeManagementV1DisplayInfo]): Self = StObject.set(x, "displays", value.asInstanceOf[js.Any])
    
    inline def setDisplaysUndefined: Self = StObject.set(x, "displays", js.undefined)
    
    inline def setDisplaysVarargs(value: SchemaGoogleChromeManagementV1DisplayInfo*): Self = StObject.set(x, "displays", js.Array(value*))
    
    inline def setReportTime(value: String): Self = StObject.set(x, "reportTime", value.asInstanceOf[js.Any])
    
    inline def setReportTimeNull: Self = StObject.set(x, "reportTime", null)
    
    inline def setReportTimeUndefined: Self = StObject.set(x, "reportTime", js.undefined)
  }
}
