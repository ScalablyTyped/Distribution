package typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.EnumValue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var name: String
  var number: Double
  var optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Option.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    name: String,
    number: Double,
    optionsList: js.Array[typings.googleDashProtobuf.googleProtobufTypeUnderscorePbMod.Option.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

