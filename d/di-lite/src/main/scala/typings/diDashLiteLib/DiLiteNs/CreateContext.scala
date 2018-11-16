package typings
package diDashLiteLib.DiLiteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateContext extends js.Object {
  var map: Dictionary[_] = js.native
  def clear(): scala.Unit = js.native
  def create[T](name: java.lang.String, args: js.Any): T = js.native
  def entry[T](name: java.lang.String): T = js.native
  def get(name: java.lang.String): js.Any = js.native
  def has(name: java.lang.String): scala.Boolean = js.native
  def initialize(): scala.Unit = js.native
  def inject[T](name: java.lang.String, o: T, dependencies: java.lang.String): T = js.native
  def ready[T](o: js.Any): T = js.native
  def ready[T](o: js.Function): T = js.native
  def register[T](name: java.lang.String, service: T): Entry = js.native
}

