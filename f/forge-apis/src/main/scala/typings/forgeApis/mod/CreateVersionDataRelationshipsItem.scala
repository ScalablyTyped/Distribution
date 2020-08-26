package typings.forgeApis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVersionDataRelationshipsItem extends js.Object {
  var data: js.UndefOr[CreateVersionDataRelationshipsItemData] = js.native
}

object CreateVersionDataRelationshipsItem {
  @scala.inline
  def apply(): CreateVersionDataRelationshipsItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVersionDataRelationshipsItem]
  }
  @scala.inline
  implicit class CreateVersionDataRelationshipsItemOps[Self <: CreateVersionDataRelationshipsItem] (val x: Self) extends AnyVal {
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
    def setData(value: CreateVersionDataRelationshipsItemData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

