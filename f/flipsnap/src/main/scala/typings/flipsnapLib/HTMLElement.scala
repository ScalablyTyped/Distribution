package typings
package flipsnapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLElement extends js.Object {
  @JSName("addEventListener")
  def addEventListener_fstouchend(
    `type`: flipsnapLib.flipsnapLibStrings.fstouchend,
    listener: js.Function1[/* ev */ FlipsnapTouchEndEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchend(
    `type`: flipsnapLib.flipsnapLibStrings.fstouchend,
    listener: js.Function1[/* ev */ FlipsnapTouchEndEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchmove(
    `type`: flipsnapLib.flipsnapLibStrings.fstouchmove,
    listener: js.Function1[/* ev */ FlipsnapTouchMoveEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchmove(
    `type`: flipsnapLib.flipsnapLibStrings.fstouchmove,
    listener: js.Function1[/* ev */ FlipsnapTouchMoveEvent, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchstart(
    `type`: flipsnapLib.flipsnapLibStrings.fstouchstart,
    listener: js.Function1[/* ev */ stdLib.Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_fstouchstart(
    `type`: flipsnapLib.flipsnapLibStrings.fstouchstart,
    listener: js.Function1[/* ev */ stdLib.Event, _],
    useCapture: scala.Boolean
  ): scala.Unit = js.native
}

