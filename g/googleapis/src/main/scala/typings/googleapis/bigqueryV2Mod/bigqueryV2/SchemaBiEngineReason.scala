package typings.googleapis.bigqueryV2Mod.bigqueryV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBiEngineReason extends StObject {
  
  /**
    * [Output-only] High-level BI Engine reason for partial or disabled acceleration.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output-only] Free form human-readable reason for partial or disabled acceleration.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaBiEngineReason {
  
  inline def apply(): SchemaBiEngineReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBiEngineReason]
  }
  
  extension [Self <: SchemaBiEngineReason](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
