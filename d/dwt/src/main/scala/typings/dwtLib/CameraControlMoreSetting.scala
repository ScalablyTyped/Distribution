package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraControlMoreSetting extends js.Object {
  def GetDefaultValue(): scala.Double
  def GetIfAuto(): scala.Boolean
  def GetMaxValue(): scala.Double
  def GetMinValue(): scala.Double
  def GetSteppingDelta(): scala.Double
}

object CameraControlMoreSetting {
  @scala.inline
  def apply(
    GetDefaultValue: js.Function0[scala.Double],
    GetIfAuto: js.Function0[scala.Boolean],
    GetMaxValue: js.Function0[scala.Double],
    GetMinValue: js.Function0[scala.Double],
    GetSteppingDelta: js.Function0[scala.Double]
  ): CameraControlMoreSetting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetDefaultValue")(GetDefaultValue)
    __obj.updateDynamic("GetIfAuto")(GetIfAuto)
    __obj.updateDynamic("GetMaxValue")(GetMaxValue)
    __obj.updateDynamic("GetMinValue")(GetMinValue)
    __obj.updateDynamic("GetSteppingDelta")(GetSteppingDelta)
    __obj.asInstanceOf[CameraControlMoreSetting]
  }
}

