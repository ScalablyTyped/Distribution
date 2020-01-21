package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X86WriterOptions extends js.Object {
  /**
    * Specifies the initial program counter, which is useful when
    * generating code to a scratch buffer. This is essential when using
    * `Memory.patchCode()` on iOS, which may provide you with a
    * temporary location that later gets mapped into memory at the
    * intended memory location.
    */
  var pc: js.UndefOr[NativePointer] = js.undefined
}

object X86WriterOptions {
  @scala.inline
  def apply(pc: NativePointer = null): X86WriterOptions = {
    val __obj = js.Dynamic.literal()
    if (pc != null) __obj.updateDynamic("pc")(pc.asInstanceOf[js.Any])
    __obj.asInstanceOf[X86WriterOptions]
  }
}

