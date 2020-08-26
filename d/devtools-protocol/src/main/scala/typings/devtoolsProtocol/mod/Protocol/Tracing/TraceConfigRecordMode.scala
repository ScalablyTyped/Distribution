package typings.devtoolsProtocol.mod.Protocol.Tracing

import typings.devtoolsProtocol.devtoolsProtocolStrings.echoToConsole
import typings.devtoolsProtocol.devtoolsProtocolStrings.recordAsMuchAsPossible
import typings.devtoolsProtocol.devtoolsProtocolStrings.recordContinuously
import typings.devtoolsProtocol.devtoolsProtocolStrings.recordUntilFull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.recordUntilFull
  - typings.devtoolsProtocol.devtoolsProtocolStrings.recordContinuously
  - typings.devtoolsProtocol.devtoolsProtocolStrings.recordAsMuchAsPossible
  - typings.devtoolsProtocol.devtoolsProtocolStrings.echoToConsole
*/
trait TraceConfigRecordMode extends js.Object

object TraceConfigRecordMode {
  @scala.inline
  def EchoToConsole: echoToConsole = "echoToConsole".asInstanceOf[echoToConsole]
  @scala.inline
  def RecordAsMuchAsPossible: recordAsMuchAsPossible = "recordAsMuchAsPossible".asInstanceOf[recordAsMuchAsPossible]
  @scala.inline
  def RecordContinuously: recordContinuously = "recordContinuously".asInstanceOf[recordContinuously]
  @scala.inline
  def RecordUntilFull: recordUntilFull = "recordUntilFull".asInstanceOf[recordUntilFull]
}

