package typings.easyXapiSupertest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonModel extends js.Object {
  var model: String
  var speed: Double
  var times: AnonIdle
}

object AnonModel {
  @scala.inline
  def apply(model: String, speed: Double, times: AnonIdle): AnonModel = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonModel]
  }
}

