package typings.flipsnap

import typings.flipsnap.flipsnapStrings.fstouchend
import typings.flipsnap.flipsnapStrings.fstouchmove
import typings.flipsnap.flipsnapStrings.fstouchstart
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLElement extends StObject {
  
  @JSName("addEventListener")
  def addEventListener_fstouchend(`type`: fstouchend, listener: js.Function1[/* ev */ FlipsnapTouchEndEvent, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchend(
    `type`: fstouchend,
    listener: js.Function1[/* ev */ FlipsnapTouchEndEvent, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchmove(`type`: fstouchmove, listener: js.Function1[/* ev */ FlipsnapTouchMoveEvent, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchmove(
    `type`: fstouchmove,
    listener: js.Function1[/* ev */ FlipsnapTouchMoveEvent, js.Any],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchstart(`type`: fstouchstart, listener: js.Function1[/* ev */ Event, js.Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchstart(`type`: fstouchstart, listener: js.Function1[/* ev */ Event, js.Any], useCapture: Boolean): Unit = js.native
}
