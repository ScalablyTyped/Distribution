package typings.egjsAxes.wheelInputMod

import typings.egjsAxes.inputTypeMod.IInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@egjs/axes/inputType/WheelInput", "WheelInput")
@js.native
class WheelInput protected () extends IInputType {
  def this(el: js.Any) = this()
  def this(el: js.Any, options: WheelInputOption) = this()
  
  var _isEnabled: js.Any = js.native
  
  var _timer: js.Any = js.native
  
  /* private */ def attachEvent(observer: js.Any): js.Any = js.native
  
  /* private */ def dettachEvent(): js.Any = js.native
  
  @JSName("disable")
  def disable_MWheelInput(): this.type = js.native
  
  @JSName("enable")
  def enable_MWheelInput(): this.type = js.native
  
  @JSName("isEnable")
  def isEnable_MWheelInput(): Boolean = js.native
  
  var observer: js.Any = js.native
  
  /* private */ def onWheel(event: js.Any): js.Any = js.native
  
  var options: WheelInputOption = js.native
}
