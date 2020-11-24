package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelBrandingSettings extends js.Object {
  
  var channel: js.UndefOr[ChannelSettings] = js.native
  
  var hints: js.UndefOr[js.Array[PropertyValue]] = js.native
  
  var image: js.UndefOr[ImageSettings] = js.native
  
  var watch: js.UndefOr[WatchSettings] = js.native
}
object ChannelBrandingSettings {
  
  @scala.inline
  def apply(): ChannelBrandingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelBrandingSettings]
  }
  
  @scala.inline
  implicit class ChannelBrandingSettingsOps[Self <: ChannelBrandingSettings] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: ChannelSettings): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setHintsVarargs(value: PropertyValue*): Self = this.set("hints", js.Array(value :_*))
    
    @scala.inline
    def setHints(value: js.Array[PropertyValue]): Self = this.set("hints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHints: Self = this.set("hints", js.undefined)
    
    @scala.inline
    def setImage(value: ImageSettings): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setWatch(value: WatchSettings): Self = this.set("watch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWatch: Self = this.set("watch", js.undefined)
  }
}
