package typings.googleFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaContent extends js.Object {
  
  var bitrate: Double = js.native
  
  var channels: String = js.native
  
  var duration: Double = js.native
  
  var expression: String = js.native
  
  var fileSize: Double = js.native
  
  var framerate: Double = js.native
  
  var height: Double = js.native
  
  var isDefault: Boolean = js.native
  
  var lang: String = js.native
  
  var medium: String = js.native
  
  var samplingrate: Double = js.native
  
  var `type`: String = js.native
  
  var url: String = js.native
  
  var width: Double = js.native
}
object MediaContent {
  
  @scala.inline
  def apply(
    bitrate: Double,
    channels: String,
    duration: Double,
    expression: String,
    fileSize: Double,
    framerate: Double,
    height: Double,
    isDefault: Boolean,
    lang: String,
    medium: String,
    samplingrate: Double,
    `type`: String,
    url: String,
    width: Double
  ): MediaContent = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], framerate = framerate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isDefault = isDefault.asInstanceOf[js.Any], lang = lang.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], samplingrate = samplingrate.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaContent]
  }
  
  @scala.inline
  implicit class MediaContentOps[Self <: MediaContent] (val x: Self) extends AnyVal {
    
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
    def setBitrate(value: Double): Self = this.set("bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannels(value: String): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerate(value: Double): Self = this.set("framerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: String): Self = this.set("medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingrate(value: Double): Self = this.set("samplingrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
