package typings
package fibjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Arch extends js.Object {
  val arch: java.lang.String = js.native
  val argv: js.Array[_] = js.native
  val env: js.Object = js.native
  val execArgv: js.Array[_] = js.native
  val execPath: java.lang.String = js.native
  val exitCode: scala.Double = js.native
  val platform: java.lang.String = js.native
  val processNs: js.Any = js.native
  val stderr: Class_File = js.native
  val stdin: Class_File = js.native
  val stdout: Class_File = js.native
  val version: java.lang.String = js.native
  val versions: js.Object = js.native
  def chdir(directory: java.lang.String): scala.Unit = js.native
  def cwd(): java.lang.String = js.native
  def exit(): scala.Unit = js.native
  def exit(code: scala.Double): scala.Unit = js.native
  def hrtime(): js.Array[_] = js.native
  def hrtime(diff: js.Array[_]): js.Array[_] = js.native
  def memoryUsage(): js.Object = js.native
  def nextTick(func: js.Function, args: js.Any*): scala.Unit = js.native
  def open(command: java.lang.String): Class_SubProcess = js.native
  def open(command: java.lang.String, args: js.Array[_]): Class_SubProcess = js.native
  def open(command: java.lang.String, args: js.Array[_], opts: js.Object): Class_SubProcess = js.native
  def open(command: java.lang.String, opts: js.Object): Class_SubProcess = js.native
  def run(command: java.lang.String): scala.Double = js.native
  def run(command: java.lang.String, args: js.Array[_]): scala.Double = js.native
  def run(command: java.lang.String, args: js.Array[_], opts: js.Object): scala.Double = js.native
  def run(command: java.lang.String, opts: js.Object): scala.Double = js.native
  def start(command: java.lang.String): Class_SubProcess = js.native
  def start(command: java.lang.String, args: js.Array[_]): Class_SubProcess = js.native
  def start(command: java.lang.String, args: js.Array[_], opts: js.Object): Class_SubProcess = js.native
  def start(command: java.lang.String, opts: js.Object): Class_SubProcess = js.native
  def umask(): scala.Double = js.native
  def umask(mask: java.lang.String): scala.Double = js.native
  def umask(mask: scala.Double): scala.Double = js.native
  def uptime(): scala.Double = js.native
}

