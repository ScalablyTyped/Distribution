package typings.fridaGum.global

import typings.fridaGum.NativePointerValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Relocates machine code for arm.
  */
@JSGlobal("ArmRelocator")
@js.native
class ArmRelocator protected ()
  extends typings.fridaGum.ArmRelocator {
  /**
    * Creates a new code relocator for copying ARM instructions
    * from one memory location to another, taking care to adjust
    * position-dependent instructions accordingly.
    *
    * @param inputCode Source address to copy instructions from.
    * @param output ArmWriter pointed at the desired target memory
    *               address.
    */
  def this(inputCode: NativePointerValue, output: typings.fridaGum.ArmWriter) = this()
}
