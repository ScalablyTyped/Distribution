package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.EnumValueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: String
  var number: Double
  var optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    name: String,
    number: Double,
    optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.OptionNs.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(name = name, number = number, optionsList = optionsList)
  
    __obj.asInstanceOf[AsObject]
  }
}

