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

