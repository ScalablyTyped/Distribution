package typings.devtoolsProtocol.mod.Protocol.Console

import typings.devtoolsProtocol.devtoolsProtocolStrings.debug
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.info
import typings.devtoolsProtocol.devtoolsProtocolStrings.log
import typings.devtoolsProtocol.devtoolsProtocolStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.log
  - typings.devtoolsProtocol.devtoolsProtocolStrings.warning
  - typings.devtoolsProtocol.devtoolsProtocolStrings.error
  - typings.devtoolsProtocol.devtoolsProtocolStrings.debug
  - typings.devtoolsProtocol.devtoolsProtocolStrings.info
*/
trait ConsoleMessageLevel extends js.Object
object ConsoleMessageLevel {
  
  @scala.inline
  def Debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def Error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def Info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def Log: log = "log".asInstanceOf[log]
  
  @scala.inline
  def Warning: warning = "warning".asInstanceOf[warning]
}
