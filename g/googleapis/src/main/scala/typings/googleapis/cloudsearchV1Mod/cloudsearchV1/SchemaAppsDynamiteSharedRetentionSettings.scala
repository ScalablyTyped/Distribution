package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedRetentionSettings extends StObject {
  
  /**
    * The timestamp after which the message/topic should be removed, in microseconds since the epoch, when state == EPHEMERAL_ONE_DAY. The value should not be set in other cases.
    */
  var expiryTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The retention state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedRetentionSettings {
  
  inline def apply(): SchemaAppsDynamiteSharedRetentionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedRetentionSettings]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedRetentionSettings](x: Self) {
    
    inline def setExpiryTimestamp(value: String): Self = StObject.set(x, "expiryTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimestampNull: Self = StObject.set(x, "expiryTimestamp", null)
    
    inline def setExpiryTimestampUndefined: Self = StObject.set(x, "expiryTimestamp", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
