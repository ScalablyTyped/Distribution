package typings.fridaGum.global

import typings.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relocates machine code for arm64.
  */
@JSGlobal("Arm64Relocator")
@js.native
class Arm64Relocator protected ()
  extends typings.fridaGum.Arm64Relocator {
  /**
    * Creates a new code relocator for copying AArch64 instructions
    * from one memory location to another, taking care to adjust
    * position-dependent instructions accordingly.
    *
    * @param inputCode Source address to copy instructions from.
    * @param output Arm64Writer pointed at the desired target memory
    *               address.
    */
  def this(inputCode: NativePointerValue, output: typings.fridaGum.Arm64Writer) = this()
}

