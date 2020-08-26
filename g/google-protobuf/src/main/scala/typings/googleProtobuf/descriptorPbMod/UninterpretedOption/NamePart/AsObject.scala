package typings.googleProtobuf.descriptorPbMod.UninterpretedOption.NamePart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var isExtension: js.UndefOr[Boolean] = js.native
  var namePart: js.UndefOr[String] = js.native
}

object AsObject {
  @scala.inline
  def apply(): AsObject = {
    val __obj = js.Dynamic.literal()
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
    def setIsExtension(value: Boolean): Self = this.set("isExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExtension: Self = this.set("isExtension", js.undefined)
    @scala.inline
    def setNamePart(value: String): Self = this.set("namePart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePart: Self = this.set("namePart", js.undefined)
  }
  
}

