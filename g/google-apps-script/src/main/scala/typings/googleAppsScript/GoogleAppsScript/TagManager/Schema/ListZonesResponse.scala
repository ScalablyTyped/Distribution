package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListZonesResponse extends js.Object {
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  var zone: js.UndefOr[js.Array[Zone]] = js.native
}
object ListZonesResponse {
  
  @scala.inline
  def apply(): ListZonesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListZonesResponse]
  }
  
  @scala.inline
  implicit class ListZonesResponseOps[Self <: ListZonesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setZoneVarargs(value: Zone*): Self = this.set("zone", js.Array(value :_*))
    
    @scala.inline
    def setZone(value: js.Array[Zone]): Self = this.set("zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
}
