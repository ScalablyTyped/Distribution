package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[N, T] extends js.Object {
  var lifespanCount: js.UndefOr[scala.Double] = js.undefined
  var name: N
  var parameters: js.UndefOr[T] = js.undefined
}

object Context {
  @scala.inline
  def apply[N, T](name: N, lifespanCount: scala.Int | scala.Double = null, parameters: T = null): Context[N, T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (lifespanCount != null) __obj.updateDynamic("lifespanCount")(lifespanCount.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context[N, T]]
  }
}

