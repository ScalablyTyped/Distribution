package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1ChromeAppSiteAccess extends StObject {
  
  /**
    * Output only. This can contain very specific hosts, or patterns like "*.com" for instance.
    */
  var hostMatch: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1ChromeAppSiteAccess {
  
  inline def apply(): SchemaGoogleChromeManagementV1ChromeAppSiteAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1ChromeAppSiteAccess]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1ChromeAppSiteAccess](x: Self) {
    
    inline def setHostMatch(value: String): Self = StObject.set(x, "hostMatch", value.asInstanceOf[js.Any])
    
    inline def setHostMatchNull: Self = StObject.set(x, "hostMatch", null)
    
    inline def setHostMatchUndefined: Self = StObject.set(x, "hostMatch", js.undefined)
  }
}
