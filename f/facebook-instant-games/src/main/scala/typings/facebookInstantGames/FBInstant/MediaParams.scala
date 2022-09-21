package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the media payload used by custom update and custom share.
  */
trait MediaParams extends StObject {
  
  /**
    * If provided, the content should contain information for us to get the gif.
    */
  var gif: js.UndefOr[MediaContent] = js.undefined
  
  /**
    * If provided, the content should contain information for us to get the video.
    */
  var video: js.UndefOr[MediaContent] = js.undefined
}
object MediaParams {
  
  inline def apply(): MediaParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaParams]
  }
  
  extension [Self <: MediaParams](x: Self) {
    
    inline def setGif(value: MediaContent): Self = StObject.set(x, "gif", value.asInstanceOf[js.Any])
    
    inline def setGifUndefined: Self = StObject.set(x, "gif", js.undefined)
    
    inline def setVideo(value: MediaContent): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
