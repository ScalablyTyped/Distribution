package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoEncoderSupport extends StObject {
  
  var config: VideoEncoderConfig
  
  var supported: Boolean
}
object VideoEncoderSupport {
  
  inline def apply(config: VideoEncoderConfig, supported: Boolean): VideoEncoderSupport = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEncoderSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoEncoderSupport] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: VideoEncoderConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
