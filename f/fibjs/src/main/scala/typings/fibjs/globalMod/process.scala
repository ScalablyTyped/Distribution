package typings.fibjs.globalMod

import typings.fibjs.Class_File
import typings.fibjs.Class_SubProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("global", "process")
@js.native
object process extends js.Object {
  val arch: String = js.native
  val argv: js.Array[_] = js.native
  val env: js.Object = js.native
  val execArgv: js.Array[_] = js.native
  val execPath: String = js.native
  val exitCode: Double = js.native
  val platform: String = js.native
  val stderr: Class_File = js.native
  val stdin: Class_File = js.native
  val stdout: Class_File = js.native
  val version: String = js.native
  val versions: js.Object = js.native
  def chdir(directory: String): Unit = js.native
  def cwd(): String = js.native
  def exit(): Unit = js.native
  def exit(code: Double): Unit = js.native
  def hrtime(): js.Array[_] = js.native
  def hrtime(diff: js.Array[_]): js.Array[_] = js.native
  def memoryUsage(): js.Object = js.native
  def nextTick(func: js.Function, args: js.Any*): Unit = js.native
  def open(command: String): Class_SubProcess = js.native
  def open(command: String, args: js.Array[_]): Class_SubProcess = js.native
  def open(command: String, args: js.Array[_], opts: js.Object): Class_SubProcess = js.native
  def open(command: String, opts: js.Object): Class_SubProcess = js.native
  def run(command: String): Double = js.native
  def run(command: String, args: js.Array[_]): Double = js.native
  def run(command: String, args: js.Array[_], opts: js.Object): Double = js.native
  def run(command: String, opts: js.Object): Double = js.native
  def start(command: String): Class_SubProcess = js.native
  def start(command: String, args: js.Array[_]): Class_SubProcess = js.native
  def start(command: String, args: js.Array[_], opts: js.Object): Class_SubProcess = js.native
  def start(command: String, opts: js.Object): Class_SubProcess = js.native
  def umask(): Double = js.native
  def umask(mask: String): Double = js.native
  def umask(mask: Double): Double = js.native
  def uptime(): Double = js.native
}

