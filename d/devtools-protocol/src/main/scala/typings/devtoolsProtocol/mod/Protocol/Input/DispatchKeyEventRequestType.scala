package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.devtoolsProtocolStrings.char
import typings.devtoolsProtocol.devtoolsProtocolStrings.keyDown
import typings.devtoolsProtocol.devtoolsProtocolStrings.keyUp
import typings.devtoolsProtocol.devtoolsProtocolStrings.rawKeyDown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.keyDown
  - typings.devtoolsProtocol.devtoolsProtocolStrings.keyUp
  - typings.devtoolsProtocol.devtoolsProtocolStrings.rawKeyDown
  - typings.devtoolsProtocol.devtoolsProtocolStrings.char
*/
trait DispatchKeyEventRequestType extends js.Object

object DispatchKeyEventRequestType {
  @scala.inline
  def Char: char = "char".asInstanceOf[char]
  @scala.inline
  def KeyDown: keyDown = "keyDown".asInstanceOf[keyDown]
  @scala.inline
  def KeyUp: keyUp = "keyUp".asInstanceOf[keyUp]
  @scala.inline
  def RawKeyDown: rawKeyDown = "rawKeyDown".asInstanceOf[rawKeyDown]
}

