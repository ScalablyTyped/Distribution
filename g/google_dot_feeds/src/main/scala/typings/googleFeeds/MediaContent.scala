package typings.googleFeeds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaContent extends StObject {
  
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
  implicit class MediaContentMutableBuilder[Self <: MediaContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannels(value: String): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpression(value: String): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingrate(value: Double): Self = StObject.set(x, "samplingrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
