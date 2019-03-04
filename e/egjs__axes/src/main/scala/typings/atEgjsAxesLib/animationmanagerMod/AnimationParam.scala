package typings
package atEgjsAxesLib.animationmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationParam extends js.Object {
  var delta: atEgjsAxesLib.axismanagerMod.Axis
  var depaPos: atEgjsAxesLib.axismanagerMod.Axis
  var destPos: atEgjsAxesLib.axismanagerMod.Axis
  var done: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var duration: scala.Double
  var inputEvent: js.UndefOr[js.Any] = js.undefined
  var setTo: js.UndefOr[
    js.Function2[
      /* destPos */ js.UndefOr[atEgjsAxesLib.axismanagerMod.Axis], 
      /* duration */ js.UndefOr[scala.Double], 
      atEgjsAxesLib.Anon_DestPos
    ]
  ] = js.undefined
  var startTime: js.UndefOr[scala.Double] = js.undefined
}

object AnimationParam {
  @scala.inline
  def apply(
    delta: atEgjsAxesLib.axismanagerMod.Axis,
    depaPos: atEgjsAxesLib.axismanagerMod.Axis,
    destPos: atEgjsAxesLib.axismanagerMod.Axis,
    duration: scala.Double,
    done: js.Function0[scala.Unit] = null,
    inputEvent: js.Any = null,
    setTo: js.Function2[
      /* destPos */ js.UndefOr[atEgjsAxesLib.axismanagerMod.Axis], 
      /* duration */ js.UndefOr[scala.Double], 
      atEgjsAxesLib.Anon_DestPos
    ] = null,
    startTime: scala.Int | scala.Double = null
  ): AnimationParam = {
    val __obj = js.Dynamic.literal(delta = delta, depaPos = depaPos, destPos = destPos, duration = duration)
    if (done != null) __obj.updateDynamic("done")(done)
    if (inputEvent != null) __obj.updateDynamic("inputEvent")(inputEvent)
    if (setTo != null) __obj.updateDynamic("setTo")(setTo)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationParam]
  }
}

