package typings
package atFrctlFractalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Params extends js.Object {
  var params: js.Any
  var route: Anon_HandleView
}

object Anon_Params {
  @scala.inline
  def apply(params: js.Any, route: Anon_HandleView): Anon_Params = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("route")(route)
    __obj.asInstanceOf[Anon_Params]
  }
}

