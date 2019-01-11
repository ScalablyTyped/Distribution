package typings
package atEgjsAxesLib.inputTypePanInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/inputType/PanInput", "PanInput")
@js.native
class PanInput protected ()
  extends atEgjsAxesLib.inputTypeInputTypeMod.IInputType {
  def this(el: java.lang.String) = this()
  def this(el: stdLib.HTMLElement) = this()
  def this(el: java.lang.String, options: PanInputOption) = this()
  def this(el: stdLib.HTMLElement, options: PanInputOption) = this()
  var _direction: js.Any = js.native
  /* CompleteClass */
  override var axes: js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override var element: stdLib.HTMLElement = js.native
  var observer: js.Any = js.native
  var options: PanInputOption = js.native
  /* private */ def attachEvent(observer: js.Any): js.Any = js.native
  /* CompleteClass */
  override def connect(observer: atEgjsAxesLib.inputTypeInputTypeMod.IInputTypeObserver): atEgjsAxesLib.inputTypeInputTypeMod.IInputType = js.native
  /* CompleteClass */
  override def destroy(): js.Any = js.native
  /* private */ def dettachEvent(): js.Any = js.native
  @JSName("disable")
  def disable_MPanInput(): this.type = js.native
  /* CompleteClass */
  override def disconnect(): js.Any = js.native
  @JSName("enable")
  def enable_MPanInput(): this.type = js.native
  /* private */ def getOffset(properties: js.Any, useDirection: js.Any): js.Any = js.native
  @JSName("isEnable")
  def isEnable_MPanInput(): scala.Boolean = js.native
  /* CompleteClass */
  override def mapAxes(axes: js.Array[java.lang.String]): js.Any = js.native
  /* private */ def onHammerInput(event: js.Any): js.Any = js.native
  /* private */ def onPanend(event: js.Any): js.Any = js.native
  /* private */ def onPanmove(event: js.Any): js.Any = js.native
}

@JSImport("@egjs/axes/inputType/PanInput", "PanInput")
@js.native
object PanInput extends js.Object {
  def getDirectionByAngle(angle: scala.Double, thresholdAngle: scala.Double): atEgjsAxesLib.constMod.DIRECTION = js.native
  def getNextOffset(speeds: js.Array[scala.Double], deceleration: scala.Double): js.Array[scala.Double] = js.native
  def useDirection(checkType: atEgjsAxesLib.constMod.DIRECTION, direction: atEgjsAxesLib.constMod.DIRECTION): scala.Boolean = js.native
  def useDirection(
    checkType: atEgjsAxesLib.constMod.DIRECTION,
    direction: atEgjsAxesLib.constMod.DIRECTION,
    userDirection: atEgjsAxesLib.constMod.DIRECTION
  ): scala.Boolean = js.native
}

