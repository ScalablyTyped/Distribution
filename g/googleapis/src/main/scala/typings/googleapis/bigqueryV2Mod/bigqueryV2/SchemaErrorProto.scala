package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaErrorProto extends StObject {
  
  /**
    * Debugging information. This property is internal to Google and should not
    * be used.
    */
  var debugInfo: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies where the error occurred, if present.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable description of the error.
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * A short error code that summarizes the error.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object SchemaErrorProto {
  
  inline def apply(): SchemaErrorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorProto]
  }
  
  extension [Self <: SchemaErrorProto](x: Self) {
    
    inline def setDebugInfo(value: String): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
    
    inline def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
