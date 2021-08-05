package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  /**
    * The channel object encapsulates branding properties of the channel page.
    */
  var channel: DefaultTab
  
  /**
    * The hints object encapsulates additional branding properties
    */
  var hints: js.Array[Property]
  
  /**
    * The image object encapsulates information about images that display on the channels channel page or video watch pages.
    */
  var image: BackgroundImageUrl
  
  /**
    * The watch object encapsulates branding properties of the watch pages for the channels videos.
    */
  var watch: BackgroundColor
}
object Channel {
  
  inline def apply(channel: DefaultTab, hints: js.Array[Property], image: BackgroundImageUrl, watch: BackgroundColor): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], hints = hints.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], watch = watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setChannel(value: DefaultTab): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setHints(value: js.Array[Property]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsVarargs(value: Property*): Self = StObject.set(x, "hints", js.Array(value :_*))
    
    inline def setImage(value: BackgroundImageUrl): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setWatch(value: BackgroundColor): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
  }
}
