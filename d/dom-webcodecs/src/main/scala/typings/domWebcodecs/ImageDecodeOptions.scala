package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDecodeOptions extends StObject {
  
  var completeFramesOnly: js.UndefOr[Boolean] = js.undefined
  
  var frameIndex: js.UndefOr[Double] = js.undefined
}
object ImageDecodeOptions {
  
  inline def apply(): ImageDecodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDecodeOptions]
  }
  
  extension [Self <: ImageDecodeOptions](x: Self) {
    
    inline def setCompleteFramesOnly(value: Boolean): Self = StObject.set(x, "completeFramesOnly", value.asInstanceOf[js.Any])
    
    inline def setCompleteFramesOnlyUndefined: Self = StObject.set(x, "completeFramesOnly", js.undefined)
    
    inline def setFrameIndex(value: Double): Self = StObject.set(x, "frameIndex", value.asInstanceOf[js.Any])
    
    inline def setFrameIndexUndefined: Self = StObject.set(x, "frameIndex", js.undefined)
  }
}
