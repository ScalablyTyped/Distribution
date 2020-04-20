package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPropertySetting extends js.Object {
  def GetIfAuto(): Boolean
  def GetValue(): Double
}

object VideoPropertySetting {
  @scala.inline
  def apply(GetIfAuto: () => Boolean, GetValue: () => Double): VideoPropertySetting = {
    val __obj = js.Dynamic.literal(GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetValue = js.Any.fromFunction0(GetValue))
    __obj.asInstanceOf[VideoPropertySetting]
  }
}

