package typings
package fibjsLib.coroutineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("coroutine", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val fibers: js.Array[js.Any] = js.native
  val loglevel: scala.Double = js.native
  val spareFibers: scala.Double = js.native
  val vmid: scala.Double = js.native
  def current(): fibjsLib.Class_Fiber = js.native
  def parallel(datas: js.Array[_], func: js.Function): js.Array[_] = js.native
  def parallel(datas: js.Array[_], func: js.Function, fibers: scala.Double): js.Array[_] = js.native
  def parallel(func: js.Function, num: scala.Double): js.Array[_] = js.native
  def parallel(func: js.Function, num: scala.Double, fibers: scala.Double): js.Array[_] = js.native
  def parallel(funcs: js.Any*): js.Array[_] = js.native
  def parallel(funcs: js.Array[_]): js.Array[_] = js.native
  def parallel(funcs: js.Array[_], fibers: scala.Double): js.Array[_] = js.native
  def sleep(): scala.Unit = js.native
  def sleep(ms: scala.Double): scala.Unit = js.native
  def start(func: js.Function, args: js.Any*): fibjsLib.Class_Fiber = js.native
}

