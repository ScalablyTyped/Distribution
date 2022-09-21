package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOncWifiContext extends StObject {
  
  /**
    * The GUID of non-compliant Wi-Fi configuration.
    */
  var wifiGuid: js.UndefOr[String | Null] = js.undefined
}
object SchemaOncWifiContext {
  
  inline def apply(): SchemaOncWifiContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOncWifiContext]
  }
  
  extension [Self <: SchemaOncWifiContext](x: Self) {
    
    inline def setWifiGuid(value: String): Self = StObject.set(x, "wifiGuid", value.asInstanceOf[js.Any])
    
    inline def setWifiGuidNull: Self = StObject.set(x, "wifiGuid", null)
    
    inline def setWifiGuidUndefined: Self = StObject.set(x, "wifiGuid", js.undefined)
  }
}
