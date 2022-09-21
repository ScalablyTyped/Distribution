package typings.googleapis.chromemanagementV1Mod.chromemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleChromeManagementV1ThunderboltInfo extends StObject {
  
  /**
    * Security level of the Thunderbolt bus.
    */
  var securityLevel: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleChromeManagementV1ThunderboltInfo {
  
  inline def apply(): SchemaGoogleChromeManagementV1ThunderboltInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleChromeManagementV1ThunderboltInfo]
  }
  
  extension [Self <: SchemaGoogleChromeManagementV1ThunderboltInfo](x: Self) {
    
    inline def setSecurityLevel(value: String): Self = StObject.set(x, "securityLevel", value.asInstanceOf[js.Any])
    
    inline def setSecurityLevelNull: Self = StObject.set(x, "securityLevel", null)
    
    inline def setSecurityLevelUndefined: Self = StObject.set(x, "securityLevel", js.undefined)
  }
}
