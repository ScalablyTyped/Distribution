package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPropertyMoreSetting extends js.Object {
  def GetDefaultValue(): Double
  def GetIfAuto(): Boolean
  def GetMaxValue(): Double
  def GetMinValue(): Double
  def GetSteppingDelta(): Double
}

object VideoPropertyMoreSetting {
  @scala.inline
  def apply(
    GetDefaultValue: () => Double,
    GetIfAuto: () => Boolean,
    GetMaxValue: () => Double,
    GetMinValue: () => Double,
    GetSteppingDelta: () => Double
  ): VideoPropertyMoreSetting = {
    val __obj = js.Dynamic.literal(GetDefaultValue = js.Any.fromFunction0(GetDefaultValue), GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetMaxValue = js.Any.fromFunction0(GetMaxValue), GetMinValue = js.Any.fromFunction0(GetMinValue), GetSteppingDelta = js.Any.fromFunction0(GetSteppingDelta))
    __obj.asInstanceOf[VideoPropertyMoreSetting]
  }
}

