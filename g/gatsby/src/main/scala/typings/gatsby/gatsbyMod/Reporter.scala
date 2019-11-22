package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter extends js.Object {
  var error: LogErrorType = js.native
  var format: js.Object = js.native
  var info: LogMessageType = js.native
  var log: LogMessageType = js.native
  var panic: LogErrorType = js.native
  var panicOnBuild: LogErrorType = js.native
  var success: LogMessageType = js.native
  var verbose: LogMessageType = js.native
  var warn: LogMessageType = js.native
  def activityTimer(name: String): ActivityTracker = js.native
  def activityTimer(name: String, activityArgs: ActivityArgs): ActivityTracker = js.native
  def createProgress(text: String): ProgressActivityTracker = js.native
  def createProgress(text: String, total: Double): ProgressActivityTracker = js.native
  def createProgress(text: String, total: Double, start: Double): ProgressActivityTracker = js.native
  def createProgress(text: String, total: Double, start: Double, activityArgs: ActivityArgs): ProgressActivityTracker = js.native
  def setNoColor(): Unit = js.native
  def setNoColor(isNoColor: Boolean): Unit = js.native
  def setVerbose(): Unit = js.native
  def setVerbose(isVerbose: Boolean): Unit = js.native
  def stripIndent(input: String): String = js.native
  def uptime(prefix: String): Unit = js.native
}

