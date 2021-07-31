package typings.elasticApmNode

import typings.elasticApmNode.mod.CaptureBody
import typings.elasticApmNode.mod.CaptureErrorLogStackTraces
import typings.elasticApmNode.mod.LogLevel
import typings.elasticApmNode.mod.Outcome
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticApmNodeStrings {
  
  @js.native
  sealed trait all
    extends StObject
       with CaptureBody
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait always
    extends StObject
       with CaptureErrorLogStackTraces
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait debug
    extends StObject
       with LogLevel
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait error
    extends StObject
       with LogLevel
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait errors
    extends StObject
       with CaptureBody
  @scala.inline
  def errors: errors = "errors".asInstanceOf[errors]
  
  @js.native
  sealed trait failure
    extends StObject
       with Outcome
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait fatal
    extends StObject
       with LogLevel
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @js.native
  sealed trait info
    extends StObject
       with LogLevel
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait messages
    extends StObject
       with CaptureErrorLogStackTraces
  @scala.inline
  def messages: messages = "messages".asInstanceOf[messages]
  
  @js.native
  sealed trait never
    extends StObject
       with CaptureErrorLogStackTraces
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait off
    extends StObject
       with CaptureBody
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait success
    extends StObject
       with Outcome
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait trace
    extends StObject
       with LogLevel
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @js.native
  sealed trait transactions
    extends StObject
       with CaptureBody
  @scala.inline
  def transactions: transactions = "transactions".asInstanceOf[transactions]
  
  @js.native
  sealed trait unknown
    extends StObject
       with Outcome
  @scala.inline
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait warn
    extends StObject
       with LogLevel
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
