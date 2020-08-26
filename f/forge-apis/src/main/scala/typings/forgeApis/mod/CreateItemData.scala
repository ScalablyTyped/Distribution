package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateItemData extends js.Object {
  var attributes: js.UndefOr[CreateStorageDataAttributes] = js.native
  var relationships: js.UndefOr[CreateItemDataRelationships] = js.native
  var `type`: String = js.native
}

object CreateItemData {
  @scala.inline
  def apply(`type`: String): CreateItemData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateItemData]
  }
  @scala.inline
  implicit class CreateItemDataOps[Self <: CreateItemData] (val x: Self) extends AnyVal {
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAttributes(value: CreateStorageDataAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setRelationships(value: CreateItemDataRelationships): Self = this.set("relationships", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationships: Self = this.set("relationships", js.undefined)
  }
  
}

