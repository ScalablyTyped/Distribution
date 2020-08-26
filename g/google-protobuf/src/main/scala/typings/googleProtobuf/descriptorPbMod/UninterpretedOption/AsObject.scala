package typings.googleProtobuf.descriptorPbMod.UninterpretedOption

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var aggregateValue: js.UndefOr[String] = js.native
  var doubleValue: js.UndefOr[Double] = js.native
  var identifierValue: js.UndefOr[String] = js.native
  var nameList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject] = js.native
  var negativeIntValue: js.UndefOr[Double] = js.native
  var positiveIntValue: js.UndefOr[Double] = js.native
  var stringValue: Uint8Array | String = js.native
}

object AsObject {
  @scala.inline
  def apply(
    nameList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject],
    stringValue: Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(nameList = nameList.asInstanceOf[js.Any], stringValue = stringValue.asInstanceOf[js.Any])
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
    def setNameListVarargs(value: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject*): Self = this.set("nameList", js.Array(value :_*))
    @scala.inline
    def setNameList(value: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart.AsObject]): Self = this.set("nameList", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringValue(value: Uint8Array | String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setAggregateValue(value: String): Self = this.set("aggregateValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregateValue: Self = this.set("aggregateValue", js.undefined)
    @scala.inline
    def setDoubleValue(value: Double): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    @scala.inline
    def setIdentifierValue(value: String): Self = this.set("identifierValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifierValue: Self = this.set("identifierValue", js.undefined)
    @scala.inline
    def setNegativeIntValue(value: Double): Self = this.set("negativeIntValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeIntValue: Self = this.set("negativeIntValue", js.undefined)
    @scala.inline
    def setPositiveIntValue(value: Double): Self = this.set("positiveIntValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositiveIntValue: Self = this.set("positiveIntValue", js.undefined)
  }
  
}

