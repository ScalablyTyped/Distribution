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
  def apply(GetIfAuto: () => scala.Boolean, GetValue: () => scala.Double): VideoPropertySetting = {
    val __obj = js.Dynamic.literal(GetIfAuto = js.Any.fromFunction0(GetIfAuto), GetValue = js.Any.fromFunction0(GetValue))
  
    __obj.asInstanceOf[VideoPropertySetting]
  }
}

