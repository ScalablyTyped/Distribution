package typings.googleProtobuf.descriptorPbMod.MethodOptions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var deprecated: js.UndefOr[Boolean] = js.native
  var idempotencyLevel: js.UndefOr[IdempotencyLevel] = js.native
  var uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    uninterpretedOptionList: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
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
    def setUninterpretedOptionListVarargs(value: typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject*): Self = this.set("uninterpretedOptionList", js.Array(value :_*))
    @scala.inline
    def setUninterpretedOptionList(value: js.Array[typings.googleProtobuf.descriptorPbMod.UninterpretedOption.AsObject]): Self = this.set("uninterpretedOptionList", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeprecated(value: Boolean): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setIdempotencyLevel(value: IdempotencyLevel): Self = this.set("idempotencyLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdempotencyLevel: Self = this.set("idempotencyLevel", js.undefined)
  }
  
}

