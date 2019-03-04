package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPropertySetting extends js.Object {
  def GetIfAuto(): scala.Boolean
  def GetValue(): scala.Double
}

object VideoPropertySetting {
  @scala.inline
  def apply(GetIfAuto: js.Function0[scala.Boolean], GetValue: js.Function0[scala.Double]): VideoPropertySetting = {
    val __obj = js.Dynamic.literal(GetIfAuto = GetIfAuto, GetValue = GetValue)
  
    __obj.asInstanceOf[VideoPropertySetting]
  }
}

