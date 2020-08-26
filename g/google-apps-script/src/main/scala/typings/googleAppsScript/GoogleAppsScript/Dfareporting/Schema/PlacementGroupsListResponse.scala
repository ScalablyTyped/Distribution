package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlacementGroupsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
  var placementGroups: js.UndefOr[js.Array[PlacementGroup]] = js.native
}

object PlacementGroupsListResponse {
  @scala.inline
  def apply(): PlacementGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementGroupsListResponse]
  }
  @scala.inline
  implicit class PlacementGroupsListResponseOps[Self <: PlacementGroupsListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setPlacementGroupsVarargs(value: PlacementGroup*): Self = this.set("placementGroups", js.Array(value :_*))
    @scala.inline
    def setPlacementGroups(value: js.Array[PlacementGroup]): Self = this.set("placementGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementGroups: Self = this.set("placementGroups", js.undefined)
  }
  
}

