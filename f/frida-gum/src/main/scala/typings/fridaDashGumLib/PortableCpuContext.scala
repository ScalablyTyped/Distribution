package typings
package fridaDashGumLib

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
    val __obj = js.Dynamic.literal(pc = pc, sp = sp)
  
    __obj.asInstanceOf[PortableCpuContext]
  }
}

