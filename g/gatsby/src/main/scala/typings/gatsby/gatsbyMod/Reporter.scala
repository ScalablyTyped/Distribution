package typings.gatsby.gatsbyMod

import typings.gatsby.Anon_End
import typings.gatsby.Anon_ParentSpan
import typings.std.Error
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
    error: (/* message */ String, /* error */ js.UndefOr[Error]) => Unit,
    format: js.Object,
    info: (/* format */ String, /* repeated */ js.Any) => Unit,
    log: (/* format */ String, /* repeated */ js.Any) => Unit,
    panic: (/* message */ String, /* error */ js.UndefOr[Error]) => Unit,
    panicOnBuild: (/* message */ String, /* error */ js.UndefOr[Error]) => Unit,
    setNoColor: Boolean => Unit,
    setVerbose: Boolean => Unit,
    stripIndent: js.Function,
    success: (/* format */ String, /* repeated */ js.Any) => Unit,
    uptime: String => Unit,
    verbose: (/* format */ String, /* repeated */ js.Any) => Unit,
    warn: (/* format */ String, /* repeated */ js.Any) => Unit
  ): Reporter = {
    val __obj = js.Dynamic.literal(activityTimer = js.Any.fromFunction2(activityTimer), error = js.Any.fromFunction2(error), format = format, info = js.Any.fromFunction2(info), log = js.Any.fromFunction2(log), panic = js.Any.fromFunction2(panic), panicOnBuild = js.Any.fromFunction2(panicOnBuild), setNoColor = js.Any.fromFunction1(setNoColor), setVerbose = js.Any.fromFunction1(setVerbose), stripIndent = stripIndent, success = js.Any.fromFunction2(success), uptime = js.Any.fromFunction1(uptime), verbose = js.Any.fromFunction2(verbose), warn = js.Any.fromFunction2(warn))
  
    __obj.asInstanceOf[Reporter]
  }
}

