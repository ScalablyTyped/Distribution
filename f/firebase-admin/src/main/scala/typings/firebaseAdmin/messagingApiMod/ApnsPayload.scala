package typings.firebaseAdmin.messagingApiMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApnsPayload
  extends StObject
     with /**
  * Custom attributes/extensions. Must be strings. Added to the event as is.
  *
  * @see https://github.com/cloudevents/spec/blob/v1.0/spec.md#extension-context-attributes
  */
/* key */ StringDictionary[Any] {
  
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
