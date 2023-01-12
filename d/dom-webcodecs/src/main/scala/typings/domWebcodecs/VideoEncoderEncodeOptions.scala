package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoEncoderEncodeOptions extends StObject {
  
  var keyFrame: js.UndefOr[Boolean | Null] = js.undefined
}
object VideoEncoderEncodeOptions {
  
  inline def apply(): VideoEncoderEncodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoEncoderEncodeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoEncoderEncodeOptions] (val x: Self) extends AnyVal {
    
    inline def setKeyFrame(value: Boolean): Self = StObject.set(x, "keyFrame", value.asInstanceOf[js.Any])
    
    inline def setKeyFrameNull: Self = StObject.set(x, "keyFrame", null)
    
    inline def setKeyFrameUndefined: Self = StObject.set(x, "keyFrame", js.undefined)
  }
}
