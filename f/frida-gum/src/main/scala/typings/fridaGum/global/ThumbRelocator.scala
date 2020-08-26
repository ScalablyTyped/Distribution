package typings.fridaGum.global

import typings.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Relocates machine code for arm.
  */
@JSGlobal("ThumbRelocator")
@js.native
class ThumbRelocator protected ()
  extends typings.fridaGum.ThumbRelocator {
  /**
    * Creates a new code relocator for copying ARM instructions
    * from one memory location to another, taking care to adjust
    * position-dependent instructions accordingly.
    *
    * @param inputCode Source address to copy instructions from.
    * @param output ThumbWriter pointed at the desired target memory
    *               address.
    */
  def this(inputCode: NativePointerValue, output: typings.fridaGum.ThumbWriter) = this()
}

