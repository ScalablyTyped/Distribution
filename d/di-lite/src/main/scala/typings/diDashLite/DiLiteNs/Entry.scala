package typings.diDashLite.DiLiteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entry extends js.Object {
  def args[T](): T = js.native
  def args[T](a: T): Entry = js.native
  def create(newArgs: js.Any): Entry = js.native
  def dependencies[T](): T = js.native
  def dependencies[T](d: T): Entry = js.native
  def factory(f: js.Function): Entry = js.native
  def factory[T](): T = js.native
  def `object`[T](): T = js.native
  def `object`[T](o: T): Entry = js.native
  def strategy[T](): T = js.native
  def strategy[T](s: js.Function): Entry = js.native
  def `type`[T](): T = js.native
  def `type`[T](t: T): Entry = js.native
}

