package typings.frctlFractal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var params: js.Any
  var route: View
}

object Params {
  @scala.inline
  def apply(params: js.Any, route: View): Params = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

