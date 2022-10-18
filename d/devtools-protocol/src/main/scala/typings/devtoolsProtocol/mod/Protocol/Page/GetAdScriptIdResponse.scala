package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAdScriptIdResponse extends StObject {
  
  /**
    * Identifies the bottom-most script which caused the frame to be labelled
    * as an ad. Only sent if frame is labelled as an ad and id is available.
    */
  var adScriptId: js.UndefOr[AdScriptId] = js.undefined
}
object GetAdScriptIdResponse {
  
  inline def apply(): GetAdScriptIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAdScriptIdResponse]
  }
  
  extension [Self <: GetAdScriptIdResponse](x: Self) {
    
    inline def setAdScriptId(value: AdScriptId): Self = StObject.set(x, "adScriptId", value.asInstanceOf[js.Any])
    
    inline def setAdScriptIdUndefined: Self = StObject.set(x, "adScriptId", js.undefined)
  }
}
