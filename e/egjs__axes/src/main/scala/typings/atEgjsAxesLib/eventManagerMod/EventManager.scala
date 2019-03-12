package typings
package atEgjsAxesLib.eventManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/EventManager", "EventManager")
@js.native
class EventManager protected () extends js.Object {
  def this(axes: js.Any, axm: js.Any) = this()
  var axes: js.Any = js.native
  var axm: js.Any = js.native
  /* private */ def createUserControll(pos: js.Any): js.Any = js.native
  /* private */ def createUserControll(pos: js.Any, duration: js.Any): js.Any = js.native
  def destroy(): scala.Unit = js.native
  def triggerAnimationEnd(): scala.Unit = js.native
  def triggerAnimationStart(param: atEgjsAxesLib.animationManagerMod.AnimationParam): scala.Boolean = js.native
  def triggerChange(pos: atEgjsAxesLib.axisManagerMod.Axis): scala.Unit = js.native
  def triggerChange(pos: atEgjsAxesLib.axisManagerMod.Axis, event: js.Any): scala.Unit = js.native
  def triggerHold(pos: atEgjsAxesLib.axisManagerMod.Axis, event: js.Any): scala.Unit = js.native
  def triggerRelease(param: atEgjsAxesLib.animationManagerMod.AnimationParam): scala.Unit = js.native
  def triggerRelease(param: atEgjsAxesLib.animationManagerMod.AnimationParam, event: js.Any): scala.Unit = js.native
}

