package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.devtoolsProtocolStrings.SignedExchange
import typings.devtoolsProtocol.devtoolsProtocolStrings.other_
import typings.devtoolsProtocol.devtoolsProtocolStrings.parser
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
    * Initiator JavaScript stack trace, set for Script only.
    */
  var stack: js.UndefOr[StackTrace] = js.undefined
  
  /**
    * Type of this initiator. (InitiatorType enum)
    */
  var `type`: parser | script_ | preload | SignedExchange | other_
  
  /**
    * Initiator URL, set for Parser type or for Script type (when script is importing module) or for SignedExchange type.
    */
  var url: js.UndefOr[String] = js.undefined
}
object Initiator {
  
  @scala.inline
  def apply(`type`: parser | script_ | preload | SignedExchange | other_): Initiator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initiator]
  }
  
  @scala.inline
  implicit class InitiatorMutableBuilder[Self <: Initiator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    @scala.inline
    def setStack(value: StackTrace): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    @scala.inline
    def setType(value: parser | script_ | preload | SignedExchange | other_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
