package typings
package easyDashXDashHeadersLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Process extends EventEmitter {
  var arch: java.lang.String = js.native
  var argv: js.Array[java.lang.String] = js.native
  var config: easyDashXDashHeadersLib.Anon_Targetdefaults = js.native
  var env: js.Any = js.native
  var execPath: java.lang.String = js.native
  var pid: scala.Double = js.native
  var platform: java.lang.String = js.native
  // Worker
  var send: js.UndefOr[
    js.Function2[/* message */ js.Any, /* sendHandle */ js.UndefOr[js.Any], scala.Unit]
  ] = js.native
  var stderr: WritableStream = js.native
  var stdin: ReadableStream = js.native
  var stdout: WritableStream = js.native
  var title: java.lang.String = js.native
  var version: java.lang.String = js.native
  var versions: easyDashXDashHeadersLib.Anon_Uv = js.native
  def abort(): scala.Unit = js.native
  def chdir(directory: java.lang.String): scala.Unit = js.native
  def cwd(): java.lang.String = js.native
  def exit(): scala.Unit = js.native
  def exit(code: scala.Double): scala.Unit = js.native
  def getgid(): scala.Double = js.native
  def getuid(): scala.Double = js.native
  def hrtime(): js.Array[scala.Double] = js.native
  def hrtime(time: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  def kill(pid: scala.Double): scala.Unit = js.native
  def kill(pid: scala.Double, signal: java.lang.String): scala.Unit = js.native
  def memoryUsage(): easyDashXDashHeadersLib.Anon_HeapTotal = js.native
  def nextTick(callback: js.Function): scala.Unit = js.native
  def setgid(id: java.lang.String): scala.Unit = js.native
  def setgid(id: scala.Double): scala.Unit = js.native
  def setuid(id: java.lang.String): scala.Unit = js.native
  def setuid(id: scala.Double): scala.Unit = js.native
  def umask(): scala.Double = js.native
  def umask(mask: scala.Double): scala.Double = js.native
  def uptime(): scala.Double = js.native
}

