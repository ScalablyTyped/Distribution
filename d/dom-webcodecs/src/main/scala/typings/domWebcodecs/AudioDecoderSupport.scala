package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioDecoderSupport extends StObject {
  
  var config: AudioDecoderConfig
  
  var supported: Boolean
}
object AudioDecoderSupport {
  
  inline def apply(config: AudioDecoderConfig, supported: Boolean): AudioDecoderSupport = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDecoderSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioDecoderSupport] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: AudioDecoderConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
