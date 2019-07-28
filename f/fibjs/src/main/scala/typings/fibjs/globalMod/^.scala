package typings.fibjs.globalMod

import typings.fibjs.Class_Stream
import typings.fibjs.Class_Timer
import typings.fibjs.Class_Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("global", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Master: Class_Worker = js.native
  val __dirname: String = js.native
  val __filename: String = js.native
  val argv: js.Array[js.Any] = js.native
  val global: js.Object = js.native
  def GC(): Unit = js.native
  def clearHrInterval(t: js.Any): Unit = js.native
  def clearImmediate(t: js.Any): Unit = js.native
  def clearInterval(t: js.Any): Unit = js.native
  def clearTimeout(t: js.Any): Unit = js.native
  def repl(): Unit = js.native
  def repl(cmds: js.Array[_]): Unit = js.native
  def repl(out: Class_Stream): Unit = js.native
  def repl(out: Class_Stream, cmds: js.Array[_]): Unit = js.native
  def require(id: String): js.Any = js.native
  def run(fname: String): Unit = js.native
  def run(fname: String, argv: js.Array[_]): Unit = js.native
  def setHrInterval(callback: js.Function, timeout: Double, args: js.Any*): Class_Timer = js.native
  def setImmediate(callback: js.Function, args: js.Any*): Class_Timer = js.native
  def setInterval(callback: js.Function, timeout: Double, args: js.Any*): Class_Timer = js.native
  def setTimeout(callback: js.Function): Class_Timer = js.native
  def setTimeout(callback: js.Function, timeout: Double, args: js.Any*): Class_Timer = js.native
}

