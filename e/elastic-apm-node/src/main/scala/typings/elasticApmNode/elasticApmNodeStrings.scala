package typings.elasticApmNode

import typings.elasticApmNode.mod.CaptureBody
import typings.elasticApmNode.mod.CaptureErrorLogStackTraces
import typings.elasticApmNode.mod.LogLevel
import typings.elasticApmNode.mod.Outcome
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticApmNodeStrings {
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def errors: errors = "errors".asInstanceOf[errors]
  
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @scala.inline
  def messages: messages = "messages".asInstanceOf[messages]
  
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @scala.inline
  def transactions: transactions = "transactions".asInstanceOf[transactions]
  
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait all extends CaptureBody
  
  @js.native
  sealed trait always extends CaptureErrorLogStackTraces
  
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait errors extends CaptureBody
  
  @js.native
  sealed trait failure extends Outcome
  
  @js.native
  sealed trait fatal extends LogLevel
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait messages extends CaptureErrorLogStackTraces
  
  @js.native
  sealed trait never extends CaptureErrorLogStackTraces
  
  @js.native
  sealed trait off extends CaptureBody
  
  @js.native
  sealed trait success extends Outcome
  
  @js.native
  sealed trait trace extends LogLevel
  
  @js.native
  sealed trait transactions extends CaptureBody
  
  @js.native
  sealed trait unknown extends Outcome
  
  @js.native
  sealed trait warn extends LogLevel
}
