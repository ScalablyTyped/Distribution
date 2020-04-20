package typings.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortableCpuContext extends CpuContext {
  var pc: NativePointer
  var sp: NativePointer
}

object PortableCpuContext {
  @scala.inline
  def apply(pc: NativePointer, sp: NativePointer): PortableCpuContext = {
    val __obj = js.Dynamic.literal(pc = pc.asInstanceOf[js.Any], sp = sp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortableCpuContext]
  }
}

