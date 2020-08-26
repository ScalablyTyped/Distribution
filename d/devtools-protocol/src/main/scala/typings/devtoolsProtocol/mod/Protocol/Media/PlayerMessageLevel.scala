package typings.devtoolsProtocol.mod.Protocol.Media

import typings.devtoolsProtocol.devtoolsProtocolStrings.debug
import typings.devtoolsProtocol.devtoolsProtocolStrings.error
import typings.devtoolsProtocol.devtoolsProtocolStrings.info
import typings.devtoolsProtocol.devtoolsProtocolStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.error
  - typings.devtoolsProtocol.devtoolsProtocolStrings.warning
  - typings.devtoolsProtocol.devtoolsProtocolStrings.info
  - typings.devtoolsProtocol.devtoolsProtocolStrings.debug
*/
trait PlayerMessageLevel extends js.Object

object PlayerMessageLevel {
  @scala.inline
  def Debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def Error: error = "error".asInstanceOf[error]
  @scala.inline
  def Info: info = "info".asInstanceOf[info]
  @scala.inline
  def Warning: warning = "warning".asInstanceOf[warning]
}

