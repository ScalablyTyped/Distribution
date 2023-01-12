package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.devtoolsProtocolStrings.SignedExchange
import typings.devtoolsProtocol.devtoolsProtocolStrings.other_
import typings.devtoolsProtocol.devtoolsProtocolStrings.parser
import typings.devtoolsProtocol.devtoolsProtocolStrings.preflight_
import typings.devtoolsProtocol.devtoolsProtocolStrings.preload
import typings.devtoolsProtocol.devtoolsProtocolStrings.script_
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Initiator extends StObject {
  
  /**
    * Initiator column number, set for Parser type or for Script type (when script is importing
    * module) (0-based).
    */
  var columnNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * Initiator line number, set for Parser type or for Script type (when script is importing
    * module) (0-based).
    */
  var lineNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * Set if another request triggered this request (e.g. preflight).
    */
  var requestId: js.UndefOr[RequestId] = js.undefined
  
  /**
    * Initiator JavaScript stack trace, set for Script only.
    */
  var stack: js.UndefOr[StackTrace] = js.undefined
  
  /**
    * Type of this initiator. (InitiatorType enum)
    */
  var `type`: parser | script_ | preload | SignedExchange | preflight_ | other_
  
  /**
    * Initiator URL, set for Parser type or for Script type (when script is importing module) or for SignedExchange type.
    */
  var url: js.UndefOr[String] = js.undefined
}
object Initiator {
  
  inline def apply(`type`: parser | script_ | preload | SignedExchange | preflight_ | other_): Initiator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initiator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Initiator] (val x: Self) extends AnyVal {
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    inline def setRequestId(value: RequestId): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setStack(value: StackTrace): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setType(value: parser | script_ | preload | SignedExchange | preflight_ | other_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
