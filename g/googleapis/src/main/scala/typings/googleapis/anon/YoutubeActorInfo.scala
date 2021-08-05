package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YoutubeActorInfo extends StObject {
  
  var youtubeActorInfo: js.UndefOr[ChannelId] = js.undefined
}
object YoutubeActorInfo {
  
  inline def apply(): YoutubeActorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YoutubeActorInfo]
  }
  
  extension [Self <: YoutubeActorInfo](x: Self) {
    
    inline def setYoutubeActorInfo(value: ChannelId): Self = StObject.set(x, "youtubeActorInfo", value.asInstanceOf[js.Any])
    
    inline def setYoutubeActorInfoUndefined: Self = StObject.set(x, "youtubeActorInfo", js.undefined)
  }
}
