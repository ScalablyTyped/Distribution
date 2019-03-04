package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPropertyMoreSetting extends js.Object {
  def GetDefaultValue(): scala.Double
  def GetIfAuto(): scala.Boolean
  def GetMaxValue(): scala.Double
  def GetMinValue(): scala.Double
  def GetSteppingDelta(): scala.Double
}

object VideoPropertyMoreSetting {
  @scala.inline
  def apply(
    GetDefaultValue: js.Function0[scala.Double],
    GetIfAuto: js.Function0[scala.Boolean],
    GetMaxValue: js.Function0[scala.Double],
    GetMinValue: js.Function0[scala.Double],
    GetSteppingDelta: js.Function0[scala.Double]
  ): VideoPropertyMoreSetting = {
    val __obj = js.Dynamic.literal(GetDefaultValue = GetDefaultValue, GetIfAuto = GetIfAuto, GetMaxValue = GetMaxValue, GetMinValue = GetMinValue, GetSteppingDelta = GetSteppingDelta)
  
    __obj.asInstanceOf[VideoPropertyMoreSetting]
  }
}

