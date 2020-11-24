package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arm64WriterOptions extends js.Object {
  
  /**
    * Specifies the initial program counter, which is useful when
    * generating code to a scratch buffer. This is essential when using
    * `Memory.patchCode()` on iOS, which may provide you with a
    * temporary location that later gets mapped into memory at the
    * intended memory location.
    */
  var pc: js.UndefOr[NativePointer] = js.native
}
object Arm64WriterOptions {
  
  @scala.inline
  def apply(): Arm64WriterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arm64WriterOptions]
  }
  
  @scala.inline
  implicit class Arm64WriterOptionsOps[Self <: Arm64WriterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPc(value: NativePointer): Self = this.set("pc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePc: Self = this.set("pc", js.undefined)
  }
}
