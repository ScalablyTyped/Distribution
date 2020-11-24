package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiserGroupsListResponse extends js.Object {
  
  var advertiserGroups: js.UndefOr[js.Array[AdvertiserGroup]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
}
object AdvertiserGroupsListResponse {
  
  @scala.inline
  def apply(): AdvertiserGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserGroupsListResponse]
  }
  
  @scala.inline
  implicit class AdvertiserGroupsListResponseOps[Self <: AdvertiserGroupsListResponse] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserGroupsVarargs(value: AdvertiserGroup*): Self = this.set("advertiserGroups", js.Array(value :_*))
    
    @scala.inline
    def setAdvertiserGroups(value: js.Array[AdvertiserGroup]): Self = this.set("advertiserGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserGroups: Self = this.set("advertiserGroups", js.undefined)
    
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
