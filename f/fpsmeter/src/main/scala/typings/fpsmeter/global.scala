package typings.fpsmeter

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class FPSMeter ()
    extends typings.fpsmeter.FPSMeter {
    def this(anchor: HTMLElement) = this()
    def this(anchor: js.UndefOr[scala.Nothing], options: FPSMeterOptions) = this()
    def this(anchor: HTMLElement, options: FPSMeterOptions) = this()
  }
}
