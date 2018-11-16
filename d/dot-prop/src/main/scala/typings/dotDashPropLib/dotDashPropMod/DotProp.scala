package typings
package dotDashPropLib.dotDashPropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DotProp extends js.Object {
  def delete(obj: js.Object, path: java.lang.String): scala.Boolean = js.native
  def get(obj: js.Object, path: java.lang.String): js.Any = js.native
  def get(obj: js.Object, path: java.lang.String, defaultValue: js.Any): js.Any = js.native
  def has(obj: js.Object, path: java.lang.String): scala.Boolean = js.native
  def set[T /* <: js.Object */](obj: T, path: java.lang.String, value: js.Any): T = js.native
}

