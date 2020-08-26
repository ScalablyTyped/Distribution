package typings.devtoolsProtocol.mod.Protocol.Log

import typings.devtoolsProtocol.devtoolsProtocolStrings.blockedEvent
import typings.devtoolsProtocol.devtoolsProtocolStrings.blockedParser
import typings.devtoolsProtocol.devtoolsProtocolStrings.discouragedAPIUse
import typings.devtoolsProtocol.devtoolsProtocolStrings.handler
import typings.devtoolsProtocol.devtoolsProtocolStrings.longLayout
import typings.devtoolsProtocol.devtoolsProtocolStrings.longTask
import typings.devtoolsProtocol.devtoolsProtocolStrings.recurringHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.longTask
  - typings.devtoolsProtocol.devtoolsProtocolStrings.longLayout
  - typings.devtoolsProtocol.devtoolsProtocolStrings.blockedEvent
  - typings.devtoolsProtocol.devtoolsProtocolStrings.blockedParser
  - typings.devtoolsProtocol.devtoolsProtocolStrings.discouragedAPIUse
  - typings.devtoolsProtocol.devtoolsProtocolStrings.handler
  - typings.devtoolsProtocol.devtoolsProtocolStrings.recurringHandler
*/
trait ViolationSettingName extends js.Object

object ViolationSettingName {
  @scala.inline
  def BlockedEvent: blockedEvent = "blockedEvent".asInstanceOf[blockedEvent]
  @scala.inline
  def BlockedParser: blockedParser = "blockedParser".asInstanceOf[blockedParser]
  @scala.inline
  def DiscouragedAPIUse: discouragedAPIUse = "discouragedAPIUse".asInstanceOf[discouragedAPIUse]
  @scala.inline
  def Handler: handler = "handler".asInstanceOf[handler]
  @scala.inline
  def LongLayout: longLayout = "longLayout".asInstanceOf[longLayout]
  @scala.inline
  def LongTask: longTask = "longTask".asInstanceOf[longTask]
  @scala.inline
  def RecurringHandler: recurringHandler = "recurringHandler".asInstanceOf[recurringHandler]
}

