package typings.egjsAxes.pinchInputMod

import typings.egjsAxes.inputTypeMod.IInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@egjs/axes/inputType/PinchInput", "PinchInput")
@js.native
class PinchInput protected () extends IInputType {
  def this(el: js.Any) = this()
  def this(el: js.Any, options: PinchInputOption) = this()
  
  var _prev: js.Any = js.native
  
  /* private */ def attachEvent(observer: js.Any): js.Any = js.native
  
  /* private */ def dettachEvent(): js.Any = js.native
  
  @JSName("disable")
  def disable_MPinchInput(): this.type = js.native
  
  @JSName("enable")
  def enable_MPinchInput(): this.type = js.native
  
  @JSName("isEnable")
  def isEnable_MPinchInput(): Boolean = js.native
  
  var observer: js.Any = js.native
  
  /* private */ def onPinchEnd(event: js.Any): js.Any = js.native
  
  /* private */ def onPinchMove(event: js.Any): js.Any = js.native
  
  /* private */ def onPinchStart(event: js.Any): js.Any = js.native
  
  var options: PinchInputOption = js.native
}
