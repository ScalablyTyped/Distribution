package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1GraphicsInfo extends StObject {
  
  /**
    * Output only. Information about the graphics adapter (GPU).
    */
  var adapterInfo: js.UndefOr[SchemaGoogleChromeManagementV1GraphicsAdapterInfo] = js.undefined
}
object SchemaGoogleChromeManagementV1GraphicsInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1GraphicsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1GraphicsInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1GraphicsInfo](x: Self) {
    
    inline def setAdapterInfo(value: SchemaGoogleChromeManagementV1GraphicsAdapterInfo): Self = StObject.set(x, "adapterInfo", value.asInstanceOf[js.Any])
    
    inline def setAdapterInfoUndefined: Self = StObject.set(x, "adapterInfo", js.undefined)
  }
}
