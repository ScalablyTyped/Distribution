package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraControlSetting extends js.Object {
  def GetIfAuto(): scala.Boolean
  def GetValue(): scala.Double
}

object CameraControlSetting {
  @scala.inline
  def apply(GetIfAuto: js.Function0[scala.Boolean], GetValue: js.Function0[scala.Double]): CameraControlSetting = {
    val __obj = js.Dynamic.literal(GetIfAuto = GetIfAuto, GetValue = GetValue)
  
    __obj.asInstanceOf[CameraControlSetting]
  }
}

