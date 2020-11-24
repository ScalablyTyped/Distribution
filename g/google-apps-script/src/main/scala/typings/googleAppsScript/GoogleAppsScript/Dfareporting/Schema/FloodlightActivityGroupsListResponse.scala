package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightActivityGroupsListResponse extends js.Object {
  
  var floodlightActivityGroups: js.UndefOr[js.Array[FloodlightActivityGroup]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
}
object FloodlightActivityGroupsListResponse {
  
  @scala.inline
  def apply(): FloodlightActivityGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivityGroupsListResponse]
  }
  
  @scala.inline
  implicit class FloodlightActivityGroupsListResponseOps[Self <: FloodlightActivityGroupsListResponse] (val x: Self) extends AnyVal {
    
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
    def setFloodlightActivityGroupsVarargs(value: FloodlightActivityGroup*): Self = this.set("floodlightActivityGroups", js.Array(value :_*))
    
    @scala.inline
    def setFloodlightActivityGroups(value: js.Array[FloodlightActivityGroup]): Self = this.set("floodlightActivityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloodlightActivityGroups: Self = this.set("floodlightActivityGroups", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
