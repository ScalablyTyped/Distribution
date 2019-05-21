package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reporter extends js.Object {
  var format: js.Object
  var info: logMessageType
  var log: logMessageType
  var stripIndent: js.Function
  var success: logMessageType
  var verbose: logMessageType
  var warn: logMessageType
  def activityTimer(name: java.lang.String, activityArgs: gatsbyLib.Anon_ParentSpan): gatsbyLib.Anon_End
  def error(message: java.lang.String, error: stdLib.Error): scala.Unit
  def panic(args: js.Any*): scala.Unit
  def panicOnBuild(args: js.Any*): scala.Unit
  def setNoColor(isNoColor: scala.Boolean): scala.Unit
  def setVerbose(isVerbose: scala.Boolean): scala.Unit
  def uptime(prefix: java.lang.String): scala.Unit
}

object Reporter {
  @scala.inline
  def apply(
    activityTimer: (java.lang.String, gatsbyLib.Anon_ParentSpan) => gatsbyLib.Anon_End,
    error: (java.lang.String, stdLib.Error) => scala.Unit,
    format: js.Object,
    info: logMessageType,
    log: logMessageType,
    panic: /* repeated */ js.Any => scala.Unit,
    panicOnBuild: /* repeated */ js.Any => scala.Unit,
    setNoColor: scala.Boolean => scala.Unit,
    setVerbose: scala.Boolean => scala.Unit,
    stripIndent: js.Function,
    success: logMessageType,
    uptime: java.lang.String => scala.Unit,
    verbose: logMessageType,
    warn: logMessageType
  ): Reporter = {
    val __obj = js.Dynamic.literal(activityTimer = js.Any.fromFunction2(activityTimer), error = js.Any.fromFunction2(error), format = format, info = info, log = log, panic = js.Any.fromFunction1(panic), panicOnBuild = js.Any.fromFunction1(panicOnBuild), setNoColor = js.Any.fromFunction1(setNoColor), setVerbose = js.Any.fromFunction1(setVerbose), stripIndent = stripIndent, success = success, uptime = js.Any.fromFunction1(uptime), verbose = verbose, warn = warn)
  
    __obj.asInstanceOf[Reporter]
  }
}

