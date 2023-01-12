package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MipsWriterOptions extends StObject {
  
  /**
    * Specifies the initial program counter, which is useful when
    * generating code to a scratch buffer. This is essential when using
    * `Memory.patchCode()` on iOS, which may provide you with a
    * temporary location that later gets mapped into memory at the
    * intended memory location.
    */
  var pc: js.UndefOr[NativePointer] = js.undefined
}
object MipsWriterOptions {
  
  inline def apply(): MipsWriterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MipsWriterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MipsWriterOptions] (val x: Self) extends AnyVal {
    
    inline def setPc(value: NativePointer): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
    
    inline def setPcUndefined: Self = StObject.set(x, "pc", js.undefined)
  }
}
