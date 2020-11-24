package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.`return`
import typings.devtoolsProtocol.devtoolsProtocolStrings.call
import typings.devtoolsProtocol.devtoolsProtocolStrings.debuggerStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.debuggerStatement
  - typings.devtoolsProtocol.devtoolsProtocolStrings.call
  - typings.devtoolsProtocol.devtoolsProtocolStrings.`return`
*/
trait BreakLocationType extends js.Object
object BreakLocationType {
  
  @scala.inline
  def Call: call = "call".asInstanceOf[call]
  
  @scala.inline
  def DebuggerStatement: debuggerStatement = "debuggerStatement".asInstanceOf[debuggerStatement]
  
  @scala.inline
  def Return: `return` = "return".asInstanceOf[`return`]
}
