package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCryptoSelfTestCompletedEvent extends StObject {
  
  /**
    * Whether the test succeeded.
    */
  var success: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCryptoSelfTestCompletedEvent {
  
  inline def apply(): SchemaCryptoSelfTestCompletedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCryptoSelfTestCompletedEvent]
  }
  
  extension [Self <: SchemaCryptoSelfTestCompletedEvent](x: Self) {
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessNull: Self = StObject.set(x, "success", null)
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
