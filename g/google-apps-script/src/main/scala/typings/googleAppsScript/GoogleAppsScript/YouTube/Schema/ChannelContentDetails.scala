package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelContentDetails extends js.Object {
  
  var relatedPlaylists: js.UndefOr[ChannelContentDetailsRelatedPlaylists] = js.native
}
object ChannelContentDetails {
  
  @scala.inline
  def apply(): ChannelContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelContentDetails]
  }
  
  @scala.inline
  implicit class ChannelContentDetailsOps[Self <: ChannelContentDetails] (val x: Self) extends AnyVal {
    
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
    def setRelatedPlaylists(value: ChannelContentDetailsRelatedPlaylists): Self = this.set("relatedPlaylists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelatedPlaylists: Self = this.set("relatedPlaylists", js.undefined)
  }
}
