package typings.easyXHeaders.NodeJS

import typings.easyXHeaders.AnonAres
import typings.easyXHeaders.AnonHeapTotal
import typings.easyXHeaders.AnonTargetdefaults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Process extends EventEmitter {
  var arch: String = js.native
  var argv: js.Array[String] = js.native
  var config: AnonTargetdefaults = js.native
  var env: js.Any = js.native
  var execPath: String = js.native
  var pid: Double = js.native
  var platform: String = js.native
  // Worker
  var send: js.UndefOr[js.Function2[/* message */ js.Any, /* sendHandle */ js.UndefOr[js.Any], Unit]] = js.native
  var stderr: WritableStream = js.native
  var stdin: ReadableStream = js.native
  var stdout: WritableStream = js.native
  var title: String = js.native
  var version: String = js.native
  var versions: AnonAres = js.native
  def abort(): Unit = js.native
  def chdir(directory: String): Unit = js.native
  def cwd(): String = js.native
  def exit(): Unit = js.native
  def exit(code: Double): Unit = js.native
  def getgid(): Double = js.native
  def getuid(): Double = js.native
  def hrtime(): js.Array[Double] = js.native
  def hrtime(time: js.Array[Double]): js.Array[Double] = js.native
  def kill(pid: Double): Unit = js.native
  def kill(pid: Double, signal: String): Unit = js.native
  def memoryUsage(): AnonHeapTotal = js.native
  def nextTick(callback: js.Function): Unit = js.native
  def setgid(id: String): Unit = js.native
  def setgid(id: Double): Unit = js.native
  def setuid(id: String): Unit = js.native
  def setuid(id: Double): Unit = js.native
  def umask(): Double = js.native
  def umask(mask: Double): Double = js.native
  def uptime(): Double = js.native
}

