package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.devtoolsProtocolStrings.SignedExchange
import typings.devtoolsProtocol.devtoolsProtocolStrings.other_
import typings.devtoolsProtocol.devtoolsProtocolStrings.parser
import typings.devtoolsProtocol.devtoolsProtocolStrings.preload
import typings.devtoolsProtocol.devtoolsProtocolStrings.script_
import typings.devtoolsProtocol.mod.Protocol.Runtime.StackTrace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Initiator extends js.Object {
  
  /**
    * Initiator column number, set for Parser type or for Script type (when script is importing
    * module) (0-based).
    */
  var columnNumber: js.UndefOr[Double] = js.native
  
  /**
    * Initiator line number, set for Parser type or for Script type (when script is importing
    * module) (0-based).
    */
  var lineNumber: js.UndefOr[Double] = js.native
  
  /**
    * Initiator JavaScript stack trace, set for Script only.
    */
  var stack: js.UndefOr[StackTrace] = js.native
  
  /**
    * Type of this initiator. (InitiatorType enum)
    */
  var `type`: parser | script_ | preload | SignedExchange | other_ = js.native
  
  /**
    * Initiator URL, set for Parser type or for Script type (when script is importing module) or for SignedExchange type.
    */
  var url: js.UndefOr[String] = js.native
}
object Initiator {
  
  @scala.inline
  def apply(`type`: parser | script_ | preload | SignedExchange | other_): Initiator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Initiator]
  }
  
  @scala.inline
  implicit class InitiatorOps[Self <: Initiator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: parser | script_ | preload | SignedExchange | other_): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnNumber(value: Double): Self = this.set("columnNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnNumber: Self = this.set("columnNumber", js.undefined)
    
    @scala.inline
    def setLineNumber(value: Double): Self = this.set("lineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumber: Self = this.set("lineNumber", js.undefined)
    
    @scala.inline
    def setStack(value: StackTrace): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
