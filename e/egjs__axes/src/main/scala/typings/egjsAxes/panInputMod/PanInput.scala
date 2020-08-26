package typings.egjsAxes.panInputMod

import typings.egjsAxes.constMod.DIRECTION
import typings.egjsAxes.inputTypeMod.IInputType
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/inputType/PanInput", "PanInput")
@js.native
class PanInput protected () extends IInputType {
  def this(el: String) = this()
  def this(el: HTMLElement) = this()
  def this(el: String, options: PanInputOption) = this()
  def this(el: HTMLElement, options: PanInputOption) = this()
  var _direction: js.Any = js.native
  var observer: js.Any = js.native
  var options: PanInputOption = js.native
  /* private */ def attachEvent(observer: js.Any): js.Any = js.native
  /* private */ def dettachEvent(): js.Any = js.native
  @JSName("disable")
  def disable_MPanInput(): this.type = js.native
  @JSName("enable")
  def enable_MPanInput(): this.type = js.native
  /* private */ def getOffset(properties: js.Any, useDirection: js.Any): js.Any = js.native
  @JSName("isEnable")
  def isEnable_MPanInput(): Boolean = js.native
  /* private */ def onHammerInput(event: js.Any): js.Any = js.native
  /* private */ def onPanend(event: js.Any): js.Any = js.native
  /* private */ def onPanmove(event: js.Any): js.Any = js.native
}

/* static members */
@JSImport("@egjs/axes/inputType/PanInput", "PanInput")
@js.native
object PanInput extends js.Object {
  def getDirectionByAngle(angle: Double, thresholdAngle: Double): DIRECTION = js.native
  def getNextOffset(speeds: js.Array[Double], deceleration: Double): js.Array[Double] = js.native
  def useDirection(checkType: DIRECTION, direction: DIRECTION): Boolean = js.native
  def useDirection(checkType: DIRECTION, direction: DIRECTION, userDirection: DIRECTION): Boolean = js.native
}

