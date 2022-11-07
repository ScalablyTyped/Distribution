package typings.draco3d.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DracoDecoderModuleProps extends StObject {
  
  var onModuleLoaded: js.UndefOr[js.Function1[/* draco */ DecoderModule, Unit]] = js.undefined
  
  var wasmBinary: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
}
object DracoDecoderModuleProps {
  
  inline def apply(): DracoDecoderModuleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DracoDecoderModuleProps]
  }
  
  extension [Self <: DracoDecoderModuleProps](x: Self) {
    
    inline def setOnModuleLoaded(value: /* draco */ DecoderModule => Unit): Self = StObject.set(x, "onModuleLoaded", js.Any.fromFunction1(value))
    
    inline def setOnModuleLoadedUndefined: Self = StObject.set(x, "onModuleLoaded", js.undefined)
    
    inline def setWasmBinary(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "wasmBinary", value.asInstanceOf[js.Any])
    
    inline def setWasmBinaryUndefined: Self = StObject.set(x, "wasmBinary", js.undefined)
  }
}
