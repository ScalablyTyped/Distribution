package typings.gm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetterOptions extends StObject {
  
  var bufferStream: js.UndefOr[Boolean] = js.undefined
}
object GetterOptions {
  
  inline def apply(): GetterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetterOptions]
  }
  
  extension [Self <: GetterOptions](x: Self) {
    
    inline def setBufferStream(value: Boolean): Self = StObject.set(x, "bufferStream", value.asInstanceOf[js.Any])
    
    inline def setBufferStreamUndefined: Self = StObject.set(x, "bufferStream", js.undefined)
  }
}
