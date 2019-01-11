package typings
package fibjsLib.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("os", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val EOL: java.lang.String = js.native
  val execPath: java.lang.String = js.native
  val timezone: scala.Double = js.native
  def arch(): java.lang.String = js.native
  def cpuNumbers(): scala.Double = js.native
  def cpus(): js.Array[_] = js.native
  def dateAdd(d: stdLib.Date, num: scala.Double, part: java.lang.String): stdLib.Date = js.native
  def endianness(): java.lang.String = js.native
  def freemem(): scala.Double = js.native
  def homedir(): java.lang.String = js.native
  def hostname(): java.lang.String = js.native
  def loadavg(): js.Array[_] = js.native
  def memoryUsage(): js.Object = js.native
  def networkInterfaces(): js.Object = js.native
  def openPrinter(name: java.lang.String): fibjsLib.Class_BufferedStream = js.native
  def platform(): java.lang.String = js.native
  def printerInfo(): js.Array[_] = js.native
  def release(): java.lang.String = js.native
  def time(): stdLib.Date = js.native
  def time(tmString: java.lang.String): stdLib.Date = js.native
  def tmpdir(): java.lang.String = js.native
  def totalmem(): scala.Double = js.native
  def `type`(): java.lang.String = js.native
  def uptime(): scala.Double = js.native
  def userInfo(): js.Object = js.native
  def userInfo(options: js.Object): js.Object = js.native
}

