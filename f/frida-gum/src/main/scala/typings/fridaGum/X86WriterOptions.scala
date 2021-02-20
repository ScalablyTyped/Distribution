package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X86WriterOptions extends StObject {
  
  /**
    * Specifies the initial program counter, which is useful when
    * generating code to a scratch buffer. This is essential when using
    * `Memory.patchCode()` on iOS, which may provide you with a
    * temporary location that later gets mapped into memory at the
    * intended memory location.
    */
  var pc: js.UndefOr[NativePointer] = js.native
}
object X86WriterOptions {
  
  @scala.inline
  def apply(): X86WriterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X86WriterOptions]
  }
  
  @scala.inline
  implicit class X86WriterOptionsMutableBuilder[Self <: X86WriterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPc(value: NativePointer): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcUndefined: Self = StObject.set(x, "pc", js.undefined)
  }
}
