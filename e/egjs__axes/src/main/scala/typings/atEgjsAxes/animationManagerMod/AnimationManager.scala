package typings.atEgjsAxes.animationManagerMod

import typings.atEgjsAxes.Anon_DestPos
import typings.atEgjsAxes.axesMod.AxesOption
import typings.atEgjsAxes.axisManagerMod.Axis
import typings.atEgjsAxes.axisManagerMod.AxisManager
import typings.atEgjsAxes.eventManagerMod.EventManager
import typings.atEgjsAxes.interruptManagerMod.InterruptManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/AnimationManager", "AnimationManager")
@js.native
class AnimationManager protected () extends js.Object {
  def this(options: AxesOption, itm: InterruptManager, em: EventManager, axm: AxisManager) = this()
  var _animateParam: js.Any = js.native
  var _raf: js.Any = js.native
  var axm: js.Any = js.native
  var em: js.Any = js.native
  var itm: js.Any = js.native
  var options: js.Any = js.native
  /* private */ def animateLoop(param: js.Any, complete: js.Any): js.Any = js.native
  def animateTo(destPos: Axis, duration: Double): Unit = js.native
  def animateTo(destPos: Axis, duration: Double, inputEvent: js.Any): Unit = js.native
  def animationEnd(): Unit = js.native
  /* private */ def createAnimationParam(pos: js.Any, duration: js.Any): js.Any = js.native
  /* private */ def createAnimationParam(pos: js.Any, duration: js.Any, inputEvent: js.Any): js.Any = js.native
  def easing(p: js.Any): Double = js.native
  /* private */ def frame(param: js.Any): js.Any = js.native
  def getDuration(depaPos: Axis, destPos: Axis): Double = js.native
  def getDuration(depaPos: Axis, destPos: Axis, wishDuration: Double): Double = js.native
  def getUserControll(param: AnimationParam): Anon_DestPos = js.native
  def grab(axes: js.Array[String]): Unit = js.native
  def grab(axes: js.Array[String], event: js.Any): Unit = js.native
  def restore(): Unit = js.native
  def restore(inputEvent: js.Any): Unit = js.native
  def setBy(pos: Axis): this.type = js.native
  def setBy(pos: Axis, duration: Double): this.type = js.native
  def setTo(pos: Axis): this.type = js.native
  def setTo(pos: Axis, duration: Double): this.type = js.native
}

/* static members */
@JSImport("@egjs/axes/AnimationManager", "AnimationManager")
@js.native
object AnimationManager extends js.Object {
  def getDuration(duration: Double, min: Double, max: Double): Double = js.native
}

