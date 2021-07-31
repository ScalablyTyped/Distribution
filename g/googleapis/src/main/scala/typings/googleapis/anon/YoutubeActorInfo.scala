package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YoutubeActorInfo extends StObject {
  
  var youtubeActorInfo: js.UndefOr[ChannelId] = js.undefined
}
object YoutubeActorInfo {
  
  @scala.inline
  def apply(): YoutubeActorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YoutubeActorInfo]
  }
  
  @scala.inline
  implicit class YoutubeActorInfoMutableBuilder[Self <: YoutubeActorInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setYoutubeActorInfo(value: ChannelId): Self = StObject.set(x, "youtubeActorInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYoutubeActorInfoUndefined: Self = StObject.set(x, "youtubeActorInfo", js.undefined)
  }
}
