package typings.draco3d.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecoderBuffer extends StObject {
  
  def Init(array: js.typedarray.Int8Array, byteLength: Double): Unit
}
object DecoderBuffer {
  
  inline def apply(Init: (js.typedarray.Int8Array, Double) => Unit): DecoderBuffer = {
    val __obj = js.Dynamic.literal(Init = js.Any.fromFunction2(Init))
    __obj.asInstanceOf[DecoderBuffer]
  }
  
  extension [Self <: DecoderBuffer](x: Self) {
    
    inline def setInit(value: (js.typedarray.Int8Array, Double) => Unit): Self = StObject.set(x, "Init", js.Any.fromFunction2(value))
  }
}
