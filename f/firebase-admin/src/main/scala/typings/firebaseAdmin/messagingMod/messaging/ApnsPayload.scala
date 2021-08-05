package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApnsPayload
  extends StObject
     with /* customData */ StringDictionary[js.Object] {
  
  /**
    * The `aps` dictionary to be included in the message.
    */
  var aps: Aps
}
object ApnsPayload {
  
  inline def apply(aps: Aps): ApnsPayload = {
    val __obj = js.Dynamic.literal(aps = aps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApnsPayload]
  }
  
  extension [Self <: ApnsPayload](x: Self) {
    
    inline def setAps(value: Aps): Self = StObject.set(x, "aps", value.asInstanceOf[js.Any])
  }
}
