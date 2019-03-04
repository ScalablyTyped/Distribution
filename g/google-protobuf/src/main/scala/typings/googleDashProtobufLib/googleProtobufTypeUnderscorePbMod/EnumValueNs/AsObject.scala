package typings
package googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.EnumValueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: java.lang.String
  var number: scala.Double
  var optionsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    name: java.lang.String,
    number: scala.Double,
    optionsList: js.Array[googleDashProtobufLib.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(name = name, number = number, optionsList = optionsList)
  
    __obj.asInstanceOf[AsObject]
  }
}

