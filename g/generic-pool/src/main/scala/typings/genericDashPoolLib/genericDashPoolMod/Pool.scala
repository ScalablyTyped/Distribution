package typings
package genericDashPoolLib.genericDashPoolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("generic-pool", "Pool")
@js.native
class Pool[T] ()
  extends nodeLib.eventsMod.EventEmitter {
  var available: scala.Double = js.native
  var borrowed: scala.Double = js.native
  var max: scala.Double = js.native
  var min: scala.Double = js.native
  var pending: scala.Double = js.native
  var size: scala.Double = js.native
  var spareResourceCapacity: scala.Double = js.native
  def acquire(): stdLib.PromiseLike[T] = js.native
  def acquire(priority: scala.Double): stdLib.PromiseLike[T] = js.native
  def clear(): stdLib.PromiseLike[scala.Unit] = js.native
  def destroy(resource: T): stdLib.PromiseLike[scala.Unit] = js.native
  def drain(): stdLib.PromiseLike[scala.Unit] = js.native
  def isBorrowedResource(resource: T): scala.Boolean = js.native
  def release(resource: T): stdLib.PromiseLike[scala.Unit] = js.native
  def start(): scala.Unit = js.native
  def use[U](cb: js.Function1[/* resource */ T, U]): stdLib.PromiseLike[U] = js.native
}

