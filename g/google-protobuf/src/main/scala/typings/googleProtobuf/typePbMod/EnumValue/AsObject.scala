package typings.googleProtobuf.typePbMod.EnumValue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var name: String = js.native
  var number: Double = js.native
  var optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    name: String,
    number: Double,
    optionsList: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], optionsList = optionsList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptionsListVarargs(value: typings.googleProtobuf.typePbMod.Option.AsObject*): Self = this.set("optionsList", js.Array(value :_*))
    @scala.inline
    def setOptionsList(value: js.Array[typings.googleProtobuf.typePbMod.Option.AsObject]): Self = this.set("optionsList", value.asInstanceOf[js.Any])
  }
  
}

