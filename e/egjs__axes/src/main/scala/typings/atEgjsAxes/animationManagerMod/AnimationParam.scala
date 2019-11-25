package typings.atEgjsAxes.animationManagerMod

import typings.atEgjsAxes.Anon_DestPos
import typings.atEgjsAxes.axisManagerMod.Axis
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationParam extends js.Object {
  var delta: Axis
  var depaPos: Axis
  var destPos: Axis
  var done: js.UndefOr[js.Function0[Unit]] = js.undefined
  var duration: Double
  var inputEvent: js.UndefOr[js.Any] = js.undefined
  var setTo: js.UndefOr[
    js.Function2[/* destPos */ js.UndefOr[Axis], /* duration */ js.UndefOr[Double], Anon_DestPos]
  ] = js.undefined
  var startTime: js.UndefOr[Double] = js.undefined
}

object AnimationParam {
  @scala.inline
  def apply(
    delta: Axis,
    depaPos: Axis,
    destPos: Axis,
    duration: Double,
    done: () => Unit = null,
    inputEvent: js.Any = null,
    setTo: (/* destPos */ js.UndefOr[Axis], /* duration */ js.UndefOr[Double]) => Anon_DestPos = null,
    startTime: Int | Double = null
  ): AnimationParam = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], depaPos = depaPos.asInstanceOf[js.Any], destPos = destPos.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction0(done))
    if (inputEvent != null) __obj.updateDynamic("inputEvent")(inputEvent.asInstanceOf[js.Any])
    if (setTo != null) __obj.updateDynamic("setTo")(js.Any.fromFunction2(setTo))
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationParam]
  }
}

