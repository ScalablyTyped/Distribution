package typings.fpsmeter

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class FPSMeter ()
    extends typings.fpsmeter.FPSMeter {
    def this(anchor: HTMLElement) = this()
    def this(anchor: HTMLElement, options: FPSMeterOptions) = this()
    /* CompleteClass */
    override var options: FPSMeterOptions = js.native
    /* CompleteClass */
    override def destroy(): Unit = js.native
    /* CompleteClass */
    override def hide(): typings.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def pause(): typings.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def resume(): typings.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def set(name: String, value: js.Any): typings.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def show(): typings.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def showDuration(): typings.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def showFps(): typings.fpsmeter.FPSMeter = js.native
    /* CompleteClass */
    override def tick(): Unit = js.native
    /* CompleteClass */
    override def tickStart(): Unit = js.native
    /* CompleteClass */
    override def toggle(): typings.fpsmeter.FPSMeter = js.native
  }
  
}

