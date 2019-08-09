package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_End
import typings.gatsby.Anon_ParentSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  var error: logErrorType
  var format: js.Object
  var info: logMessageType
  var log: logMessageType
  var panic: logErrorType
  var panicOnBuild: logErrorType
  var stripIndent: js.Function
  var success: logMessageType
  var verbose: logMessageType
  var warn: logMessageType
  def activityTimer(name: String, activityArgs: Anon_ParentSpan): Anon_End
  def setNoColor(isNoColor: Boolean): Unit
  def setVerbose(isVerbose: Boolean): Unit
  def uptime(prefix: String): Unit
}

object Reporter {
  @scala.inline
  def apply(
    activityTimer: (String, Anon_ParentSpan) => Anon_End,
    error: logErrorType,
    format: js.Object,
    info: logMessageType,
    log: logMessageType,
    panic: logErrorType,
    panicOnBuild: logErrorType,
    setNoColor: Boolean => Unit,
    setVerbose: Boolean => Unit,
    stripIndent: js.Function,
    success: logMessageType,
    uptime: String => Unit,
    verbose: logMessageType,
    warn: logMessageType
  ): Reporter = {
    val __obj = js.Dynamic.literal(activityTimer = js.Any.fromFunction2(activityTimer), error = error, format = format, info = info, log = log, panic = panic, panicOnBuild = panicOnBuild, setNoColor = js.Any.fromFunction1(setNoColor), setVerbose = js.Any.fromFunction1(setVerbose), stripIndent = stripIndent, success = success, uptime = js.Any.fromFunction1(uptime), verbose = verbose, warn = warn)
  
    __obj.asInstanceOf[Reporter]
  }
}

