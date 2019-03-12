package typings
package atEgjsAxesLib.animationManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationParam extends js.Object {
  var delta: atEgjsAxesLib.axisManagerMod.Axis
  var depaPos: atEgjsAxesLib.axisManagerMod.Axis
  var destPos: atEgjsAxesLib.axisManagerMod.Axis
  var done: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var duration: scala.Double
  var inputEvent: js.UndefOr[js.Any] = js.undefined
  var setTo: js.UndefOr[
    js.Function2[
      /* destPos */ js.UndefOr[atEgjsAxesLib.axisManagerMod.Axis], 
      /* duration */ js.UndefOr[scala.Double], 
      atEgjsAxesLib.Anon_DestPos
    ]
  ] = js.undefined
  var startTime: js.UndefOr[scala.Double] = js.undefined
}

object AnimationParam {
  @scala.inline
  def apply(
    delta: atEgjsAxesLib.axisManagerMod.Axis,
    depaPos: atEgjsAxesLib.axisManagerMod.Axis,
    destPos: atEgjsAxesLib.axisManagerMod.Axis,
    duration: scala.Double,
    done: () => scala.Unit = null,
    inputEvent: js.Any = null,
    setTo: (/* destPos */ js.UndefOr[atEgjsAxesLib.axisManagerMod.Axis], /* duration */ js.UndefOr[scala.Double]) => atEgjsAxesLib.Anon_DestPos = null,
    startTime: scala.Int | scala.Double = null
  ): AnimationParam = {
    val __obj = js.Dynamic.literal(delta = delta, depaPos = depaPos, destPos = destPos, duration = duration)
    if (done != null) __obj.updateDynamic("done")(js.Any.fromFunction0(done))
    if (inputEvent != null) __obj.updateDynamic("inputEvent")(inputEvent)
    if (setTo != null) __obj.updateDynamic("setTo")(js.Any.fromFunction2(setTo))
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationParam]
  }
}

