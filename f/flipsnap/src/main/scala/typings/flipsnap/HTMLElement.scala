package typings.flipsnap

import typings.flipsnap.flipsnapStrings.fstouchend
import typings.flipsnap.flipsnapStrings.fstouchmove
import typings.flipsnap.flipsnapStrings.fstouchstart
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
  @JSName("addEventListener")
  def addEventListener_fstouchend(`type`: fstouchend, listener: js.Function1[/* ev */ FlipsnapTouchEndEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchend(`type`: fstouchend, listener: js.Function1[/* ev */ FlipsnapTouchEndEvent, _], useCapture: Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchmove(`type`: fstouchmove, listener: js.Function1[/* ev */ FlipsnapTouchMoveEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchmove(
    `type`: fstouchmove,
    listener: js.Function1[/* ev */ FlipsnapTouchMoveEvent, _],
    useCapture: Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchstart(`type`: fstouchstart, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchstart(`type`: fstouchstart, listener: js.Function1[/* ev */ Event, _], useCapture: Boolean): Unit = js.native
}

