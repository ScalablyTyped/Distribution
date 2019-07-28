package typings.atEgjsAxes.inputTypeWheelInputMod

import typings.atEgjsAxes.inputTypeInputTypeMod.IInputType
import typings.atEgjsAxes.inputTypeInputTypeMod.IInputTypeObserver
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@egjs/axes/inputType/WheelInput", "WheelInput")
@js.native
class WheelInput protected () extends IInputType {
  def this(el: js.Any) = this()
  def this(el: js.Any, options: WheelInputOption) = this()
  var _isEnabled: js.Any = js.native
  var _timer: js.Any = js.native
  /* CompleteClass */
  override var axes: js.Array[String] = js.native
  /* CompleteClass */
  override var element: HTMLElement = js.native
  var observer: js.Any = js.native
  var options: WheelInputOption = js.native
  /* private */ def attachEvent(observer: js.Any): js.Any = js.native
  /* CompleteClass */
  override def connect(observer: IInputTypeObserver): IInputType = js.native
  /* CompleteClass */
  override def destroy(): js.Any = js.native
  /* private */ def dettachEvent(): js.Any = js.native
  @JSName("disable")
  def disable_MWheelInput(): this.type = js.native
  /* CompleteClass */
  override def disconnect(): js.Any = js.native
  @JSName("enable")
  def enable_MWheelInput(): this.type = js.native
  @JSName("isEnable")
  def isEnable_MWheelInput(): Boolean = js.native
  /* CompleteClass */
  override def mapAxes(axes: js.Array[String]): js.Any = js.native
  /* private */ def onWheel(event: js.Any): js.Any = js.native
}

