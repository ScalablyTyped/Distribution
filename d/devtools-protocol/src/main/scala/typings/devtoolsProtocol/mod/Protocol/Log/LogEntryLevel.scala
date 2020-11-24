package typings.devtoolsProtocol.mod.Protocol.Log

import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.info
import typings.devtoolsProtocol.devtoolsProtocolStrings.verbose
import typings.devtoolsProtocol.devtoolsProtocolStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.verbose
  - typings.devtoolsProtocol.devtoolsProtocolStrings.info
  - typings.devtoolsProtocol.devtoolsProtocolStrings.warning
  - typings.devtoolsProtocol.devtoolsProtocolStrings.error
*/
trait LogEntryLevel extends js.Object
object LogEntryLevel {
  
  @scala.inline
  def Error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def Info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def Verbose: verbose = "verbose".asInstanceOf[verbose]
  
  @scala.inline
  def Warning: warning = "warning".asInstanceOf[warning]
}
