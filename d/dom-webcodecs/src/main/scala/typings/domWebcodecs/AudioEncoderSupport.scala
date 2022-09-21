package typings.domWebcodecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioEncoderSupport extends StObject {
  
  var config: AudioEncoderConfig
  
  var supported: Boolean
}
object AudioEncoderSupport {
  
  inline def apply(config: AudioEncoderConfig, supported: Boolean): AudioEncoderSupport = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEncoderSupport]
  }
  
  extension [Self <: AudioEncoderSupport](x: Self) {
    
    inline def setConfig(value: AudioEncoderConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setSupported(value: Boolean): Self = StObject.set(x, "supported", value.asInstanceOf[js.Any])
  }
}
