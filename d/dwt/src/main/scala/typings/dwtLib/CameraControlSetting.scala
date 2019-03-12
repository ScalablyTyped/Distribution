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
  def apply(GetIfAuto: () => scala.Boolean, GetValue: () => scala.Double): CameraControlSetting = {
    val __obj = js.Dynamic.literal(GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetValue = js.Any.fromFunction0(GetValue))
  
    __obj.asInstanceOf[CameraControlSetting]
  }
}

