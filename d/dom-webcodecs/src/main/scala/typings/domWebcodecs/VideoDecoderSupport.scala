package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoDecoderSupport extends StObject {
  
  var config: VideoDecoderConfig
  
  var supported: Boolean
}
object VideoDecoderSupport {
  
  inline def apply(config: VideoDecoderConfig, supported: Boolean): VideoDecoderSupport = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDecoderSupport]
  }
  
  extension [Self <: VideoDecoderSupport](x: Self) {
    
    inline def setConfig(value: VideoDecoderConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
