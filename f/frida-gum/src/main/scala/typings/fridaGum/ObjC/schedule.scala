package typings.fridaGum.ObjC

import typings.fridaGum.NativePointerValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ObjC.schedule")
@js.native
object schedule extends js.Object {
  /**
    * Schedule the JavaScript function `work` on the GCD queue specified by `queue`. An NSAutoreleasePool is created
    * just before calling `work`, and cleaned up on return.
    *
    * E.g. on macOS:
    * ```
    *     const { NSSound } = ObjC.classes;
    *     ObjC.schedule(ObjC.mainQueue, () => {
    *         const sound = NSSound.alloc().initWithContentsOfFile_byReference_("/Users/oleavr/.Trash/test.mp3", true).autorelease();
    *         sound.play();
    *     });
    * ```
    *
    * @param queue GCD queue to schedule `work` on.
    * @param work Function to call on the specified `queue`.
    */
  def apply(queue: NativePointerValue, work: js.Function0[Unit]): Unit = js.native
}

