package typings
package fibjsLib.globalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("global", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Master: fibjsLib.Class_Worker = js.native
  val __dirname: java.lang.String = js.native
  val __filename: java.lang.String = js.native
  val argv: js.Array[js.Any] = js.native
  val global: js.Object = js.native
  def GC(): scala.Unit = js.native
  def clearHrInterval(t: js.Any): scala.Unit = js.native
  def clearImmediate(t: js.Any): scala.Unit = js.native
  def clearInterval(t: js.Any): scala.Unit = js.native
  def clearTimeout(t: js.Any): scala.Unit = js.native
  def repl(): scala.Unit = js.native
  def repl(cmds: js.Array[_]): scala.Unit = js.native
  def repl(out: fibjsLib.Class_Stream): scala.Unit = js.native
  def repl(out: fibjsLib.Class_Stream, cmds: js.Array[_]): scala.Unit = js.native
  def require(id: java.lang.String): js.Any = js.native
  def run(fname: java.lang.String): scala.Unit = js.native
  def run(fname: java.lang.String, argv: js.Array[_]): scala.Unit = js.native
  def setHrInterval(callback: js.Function, timeout: scala.Double, args: js.Any*): fibjsLib.Class_Timer = js.native
  def setImmediate(callback: js.Function, args: js.Any*): fibjsLib.Class_Timer = js.native
  def setInterval(callback: js.Function, timeout: scala.Double, args: js.Any*): fibjsLib.Class_Timer = js.native
  def setTimeout(callback: js.Function): fibjsLib.Class_Timer = js.native
  def setTimeout(callback: js.Function, timeout: scala.Double, args: js.Any*): fibjsLib.Class_Timer = js.native
}

