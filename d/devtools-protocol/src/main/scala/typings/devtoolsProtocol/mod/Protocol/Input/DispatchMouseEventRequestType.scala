package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseMoved
import typings.devtoolsProtocol.devtoolsProtocolStrings.mousePressed
import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseReleased
import typings.devtoolsProtocol.devtoolsProtocolStrings.mouseWheel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.mousePressed
  - typings.devtoolsProtocol.devtoolsProtocolStrings.mouseReleased
  - typings.devtoolsProtocol.devtoolsProtocolStrings.mouseMoved
  - typings.devtoolsProtocol.devtoolsProtocolStrings.mouseWheel
*/
trait DispatchMouseEventRequestType extends js.Object

object DispatchMouseEventRequestType {
  @scala.inline
  def MouseMoved: mouseMoved = "mouseMoved".asInstanceOf[mouseMoved]
  @scala.inline
  def MousePressed: mousePressed = "mousePressed".asInstanceOf[mousePressed]
  @scala.inline
  def MouseReleased: mouseReleased = "mouseReleased".asInstanceOf[mouseReleased]
  @scala.inline
  def MouseWheel: mouseWheel = "mouseWheel".asInstanceOf[mouseWheel]
}

