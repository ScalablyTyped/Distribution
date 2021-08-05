package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Brightness extends StObject {
  
  /**
    * Value to brighten the image up (0..255)
    * @default 0
    */
  var brightness: Double
}
object Brightness {
  
  inline def apply(brightness: Double): Brightness = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brightness]
  }
  
  extension [Self <: Brightness](x: Self) {
    
    inline def setBrightness(value: Double): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
  }
}
