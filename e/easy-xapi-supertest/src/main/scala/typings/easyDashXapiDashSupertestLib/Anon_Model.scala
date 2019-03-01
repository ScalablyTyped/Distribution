package typings
package easyDashXapiDashSupertestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Model extends js.Object {
  var model: java.lang.String
  var speed: scala.Double
  var times: Anon_Idle
}

object Anon_Model {
  @scala.inline
  def apply(model: java.lang.String, speed: scala.Double, times: Anon_Idle): Anon_Model = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("speed")(speed)
    __obj.updateDynamic("times")(times)
    __obj.asInstanceOf[Anon_Model]
  }
}

