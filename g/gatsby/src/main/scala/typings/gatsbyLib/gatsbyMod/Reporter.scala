package typings
package gatsbyLib.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter extends js.Object {
  var format: js.Object = js.native
  @JSName("info")
  var info_Original: logMessageType = js.native
  @JSName("log")
  var log_Original: logMessageType = js.native
  var stripIndent: js.Function = js.native
  @JSName("success")
  var success_Original: logMessageType = js.native
  @JSName("verbose")
  var verbose_Original: logMessageType = js.native
  @JSName("warn")
  var warn_Original: logMessageType = js.native
  def activityTimer(name: java.lang.String, activityArgs: gatsbyLib.Anon_ParentSpan): gatsbyLib.Anon_End = js.native
  def error(message: java.lang.String, error: stdLib.Error): scala.Unit = js.native
  def info(format: java.lang.String, args: js.Any*): scala.Unit = js.native
  def log(format: java.lang.String, args: js.Any*): scala.Unit = js.native
  def panic(args: js.Any*): scala.Unit = js.native
  def panicOnBuild(args: js.Any*): scala.Unit = js.native
  def setNoColor(isNoColor: scala.Boolean): scala.Unit = js.native
  def setVerbose(isVerbose: scala.Boolean): scala.Unit = js.native
  def success(format: java.lang.String, args: js.Any*): scala.Unit = js.native
  def uptime(prefix: java.lang.String): scala.Unit = js.native
  def verbose(format: java.lang.String, args: js.Any*): scala.Unit = js.native
  def warn(format: java.lang.String, args: js.Any*): scala.Unit = js.native
}

