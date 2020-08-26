package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupObjectsRequest extends js.Object {
  var childrenObjectIds: js.UndefOr[js.Array[String]] = js.native
  var groupObjectId: js.UndefOr[String] = js.native
}

object GroupObjectsRequest {
  @scala.inline
  def apply(): GroupObjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupObjectsRequest]
  }
  @scala.inline
  implicit class GroupObjectsRequestOps[Self <: GroupObjectsRequest] (val x: Self) extends AnyVal {
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
    def setChildrenObjectIdsVarargs(value: String*): Self = this.set("childrenObjectIds", js.Array(value :_*))
    @scala.inline
    def setChildrenObjectIds(value: js.Array[String]): Self = this.set("childrenObjectIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildrenObjectIds: Self = this.set("childrenObjectIds", js.undefined)
    @scala.inline
    def setGroupObjectId(value: String): Self = this.set("groupObjectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupObjectId: Self = this.set("groupObjectId", js.undefined)
  }
  
}

