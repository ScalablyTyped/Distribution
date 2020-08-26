package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementTag extends js.Object {
  var placementId: js.UndefOr[String] = js.native
  var tagDatas: js.UndefOr[js.Array[TagData]] = js.native
}

object PlacementTag {
  @scala.inline
  def apply(): PlacementTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementTag]
  }
  @scala.inline
  implicit class PlacementTagOps[Self <: PlacementTag] (val x: Self) extends AnyVal {
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
    def setPlacementId(value: String): Self = this.set("placementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementId: Self = this.set("placementId", js.undefined)
    @scala.inline
    def setTagDatasVarargs(value: TagData*): Self = this.set("tagDatas", js.Array(value :_*))
    @scala.inline
    def setTagDatas(value: js.Array[TagData]): Self = this.set("tagDatas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagDatas: Self = this.set("tagDatas", js.undefined)
  }
  
}

