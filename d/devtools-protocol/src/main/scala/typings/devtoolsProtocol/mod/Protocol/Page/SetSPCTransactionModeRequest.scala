package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.autoaccept
import typings.devtoolsProtocol.devtoolsProtocolStrings.autoreject
import typings.devtoolsProtocol.devtoolsProtocolStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSPCTransactionModeRequest extends StObject {
  
  /**
    *  (SetSPCTransactionModeRequestMode enum)
    */
  var mode: none_ | autoaccept | autoreject
}
object SetSPCTransactionModeRequest {
  
  inline def apply(mode: none_ | autoaccept | autoreject): SetSPCTransactionModeRequest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSPCTransactionModeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetSPCTransactionModeRequest] (val x: Self) extends AnyVal {
    
    inline def setMode(value: none_ | autoaccept | autoreject): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
