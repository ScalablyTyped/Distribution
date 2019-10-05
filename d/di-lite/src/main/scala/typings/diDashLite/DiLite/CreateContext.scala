package typings.diDashLite.DiLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateContext extends js.Object {
  var map: Dictionary[_] = js.native
  def clear(): Unit = js.native
  def create[T](name: String, args: js.Any): T = js.native
  def entry[T](name: String): T = js.native
  def get(name: String): js.Any = js.native
  def has(name: String): Boolean = js.native
  def initialize(): Unit = js.native
  def inject[T](name: String, o: T, dependencies: String): T = js.native
  def ready[T](o: js.Any): T = js.native
  def ready[T](o: js.Function): T = js.native
  def register[T](name: String, service: T): Entry = js.native
}

