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
    GetDefaultValue: () => scala.Double,
    GetIfAuto: () => scala.Boolean,
    GetMaxValue: () => scala.Double,
    GetMinValue: () => scala.Double,
    GetSteppingDelta: () => scala.Double
  ): VideoPropertyMoreSetting = {
    val __obj = js.Dynamic.literal(GetDefaultValue = js.Any.fromFunction0(GetDefaultValue), GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetMaxValue = js.Any.fromFunction0(GetMaxValue), GetMinValue = js.Any.fromFunction0(GetMinValue), GetSteppingDelta = js.Any.fromFunction0(GetSteppingDelta))
  
    __obj.asInstanceOf[VideoPropertyMoreSetting]
  }
}

