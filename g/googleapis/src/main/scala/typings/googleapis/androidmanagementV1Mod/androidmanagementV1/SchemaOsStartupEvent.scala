package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOsStartupEvent extends StObject {
  
  /**
    * Verified Boot state.
    */
  var verifiedBootState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * dm-verity mode.
    */
  var verityMode: js.UndefOr[String | Null] = js.undefined
}
object SchemaOsStartupEvent {
  
  inline def apply(): SchemaOsStartupEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOsStartupEvent]
  }
  
  extension [Self <: SchemaOsStartupEvent](x: Self) {
    
    inline def setVerifiedBootState(value: String): Self = StObject.set(x, "verifiedBootState", value.asInstanceOf[js.Any])
    
    inline def setVerifiedBootStateNull: Self = StObject.set(x, "verifiedBootState", null)
    
    inline def setVerifiedBootStateUndefined: Self = StObject.set(x, "verifiedBootState", js.undefined)
    
    inline def setVerityMode(value: String): Self = StObject.set(x, "verityMode", value.asInstanceOf[js.Any])
    
    inline def setVerityModeNull: Self = StObject.set(x, "verityMode", null)
    
    inline def setVerityModeUndefined: Self = StObject.set(x, "verityMode", js.undefined)
  }
}
