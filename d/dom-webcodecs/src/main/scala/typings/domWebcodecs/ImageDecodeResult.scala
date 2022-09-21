package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDecodeResult extends StObject {
  
  var complete: Boolean
  
  var image: VideoFrame
}
object ImageDecodeResult {
  
  inline def apply(complete: Boolean, image: VideoFrame): ImageDecodeResult = {
    val __obj = js.Dynamic.literal(complete = complete.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDecodeResult]
  }
  
  extension [Self <: ImageDecodeResult](x: Self) {
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setImage(value: VideoFrame): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
  }
}
