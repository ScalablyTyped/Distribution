package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoDecoderSupport extends StObject {
  
  var config: js.UndefOr[VideoDecoderConfig] = js.undefined
  
  var supported: js.UndefOr[Boolean] = js.undefined
}
object VideoDecoderSupport {
  
  inline def apply(): VideoDecoderSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoDecoderSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoDecoderSupport] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: VideoDecoderConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
    
    inline def setSupportedUndefined: Self = StObject.set(x, "supported", js.undefined)
  }
}
