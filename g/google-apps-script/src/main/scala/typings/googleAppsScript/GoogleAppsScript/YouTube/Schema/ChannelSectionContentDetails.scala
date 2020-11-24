package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelSectionContentDetails extends js.Object {
  
  var channels: js.UndefOr[js.Array[String]] = js.native
  
  var playlists: js.UndefOr[js.Array[String]] = js.native
}
object ChannelSectionContentDetails {
  
  @scala.inline
  def apply(): ChannelSectionContentDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelSectionContentDetails]
  }
  
  @scala.inline
  implicit class ChannelSectionContentDetailsOps[Self <: ChannelSectionContentDetails] (val x: Self) extends AnyVal {
    
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
    def setChannelsVarargs(value: String*): Self = this.set("channels", js.Array(value :_*))
    
    @scala.inline
    def setChannels(value: js.Array[String]): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setPlaylistsVarargs(value: String*): Self = this.set("playlists", js.Array(value :_*))
    
    @scala.inline
    def setPlaylists(value: js.Array[String]): Self = this.set("playlists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaylists: Self = this.set("playlists", js.undefined)
  }
}
