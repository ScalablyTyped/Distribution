package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.ambiguous
import typings.devtoolsProtocol.devtoolsProtocolStrings.assert
import typings.devtoolsProtocol.devtoolsProtocolStrings.debugCommand
import typings.devtoolsProtocol.devtoolsProtocolStrings.exception
import typings.devtoolsProtocol.devtoolsProtocolStrings.instrumentation
import typings.devtoolsProtocol.devtoolsProtocolStrings.other_
import typings.devtoolsProtocol.devtoolsProtocolStrings.promiseRejection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.ambiguous
  - typings.devtoolsProtocol.devtoolsProtocolStrings.assert
  - typings.devtoolsProtocol.devtoolsProtocolStrings.debugCommand
  - typings.devtoolsProtocol.devtoolsProtocolStrings.DOM
  - typings.devtoolsProtocol.devtoolsProtocolStrings.EventListener
  - typings.devtoolsProtocol.devtoolsProtocolStrings.exception
  - typings.devtoolsProtocol.devtoolsProtocolStrings.instrumentation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.OOM
  - typings.devtoolsProtocol.devtoolsProtocolStrings.other_
  - typings.devtoolsProtocol.devtoolsProtocolStrings.promiseRejection
  - typings.devtoolsProtocol.devtoolsProtocolStrings.XHR
*/
trait PausedEventReason extends StObject
object PausedEventReason {
  
  @scala.inline
  def Ambiguous: ambiguous = "ambiguous".asInstanceOf[ambiguous]
  
  @scala.inline
  def Assert: assert = "assert".asInstanceOf[assert]
  
  @scala.inline
  def DOM: typings.devtoolsProtocol.devtoolsProtocolStrings.DOM = "DOM".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.DOM]
  
  @scala.inline
  def DebugCommand: debugCommand = "debugCommand".asInstanceOf[debugCommand]
  
  @scala.inline
  def EventListener: typings.devtoolsProtocol.devtoolsProtocolStrings.EventListener = "EventListener".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.EventListener]
  
  @scala.inline
  def Exception: exception = "exception".asInstanceOf[exception]
  
  @scala.inline
  def Instrumentation: instrumentation = "instrumentation".asInstanceOf[instrumentation]
  
  @scala.inline
  def OOM: typings.devtoolsProtocol.devtoolsProtocolStrings.OOM = "OOM".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.OOM]
  
  @scala.inline
  def Other: other_ = "other".asInstanceOf[other_]
  
  @scala.inline
  def PromiseRejection: promiseRejection = "promiseRejection".asInstanceOf[promiseRejection]
  
  @scala.inline
  def XHR: typings.devtoolsProtocol.devtoolsProtocolStrings.XHR = "XHR".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.XHR]
}
