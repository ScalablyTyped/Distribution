package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbWriterOptions extends StObject {
  
  /**
    * Specifies the initial program counter, which is useful when
    * generating code to a scratch buffer. This is essential when using
    * `Memory.patchCode()` on iOS, which may provide you with a
    * temporary location that later gets mapped into memory at the
    * intended memory location.
    */
  var pc: js.UndefOr[NativePointer] = js.undefined
}
object ThumbWriterOptions {
  
  @scala.inline
  def apply(): ThumbWriterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbWriterOptions]
  }
  
  @scala.inline
  implicit class ThumbWriterOptionsMutableBuilder[Self <: ThumbWriterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPc(value: NativePointer): Self = StObject.set(x, "pc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPcUndefined: Self = StObject.set(x, "pc", js.undefined)
  }
}
