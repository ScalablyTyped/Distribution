package typings
package atEgjsAxesLib.axesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axes
  extends atEgjsComponentLib.atEgjsComponentMod.namespaced {
  var _am: atEgjsAxesLib.animationmanagerMod.AnimationManager = js.native
  var _axm: atEgjsAxesLib.axismanagerMod.AxisManager = js.native
  var _em: atEgjsAxesLib.eventmanagerMod.EventManager = js.native
  var _inputs: js.Array[atEgjsAxesLib.inputTypeInputTypeMod.IInputType] = js.native
  var _io: atEgjsAxesLib.inputobserverMod.InputObserver = js.native
  var _itm: atEgjsAxesLib.interruptmanagerMod.InterruptManager = js.native
  var axis: org.scalablytyped.runtime.StringDictionary[atEgjsAxesLib.axismanagerMod.AxisOption] = js.native
  @JSName("options")
  var options_Axes: AxesOption = js.native
  /* private */ def _complementOptions(): js.Any = js.native
  def connect(axes: java.lang.String, inputType: atEgjsAxesLib.inputTypeInputTypeMod.IInputType): this.type = js.native
  def connect(axes: js.Array[java.lang.String], inputType: atEgjsAxesLib.inputTypeInputTypeMod.IInputType): this.type = js.native
  def destroy(): scala.Unit = js.native
  def disconnect(): this.type = js.native
  def disconnect(inputType: atEgjsAxesLib.inputTypeInputTypeMod.IInputType): this.type = js.native
  def get(): atEgjsAxesLib.axismanagerMod.Axis = js.native
  def get(axes: js.Array[java.lang.String]): atEgjsAxesLib.axismanagerMod.Axis = js.native
  def isBounceArea(): scala.Boolean = js.native
  def isBounceArea(axes: js.Array[java.lang.String]): scala.Boolean = js.native
  def setBy(pos: atEgjsAxesLib.axismanagerMod.Axis): this.type = js.native
  def setBy(pos: atEgjsAxesLib.axismanagerMod.Axis, duration: scala.Double): this.type = js.native
  def setTo(pos: atEgjsAxesLib.axismanagerMod.Axis): this.type = js.native
  def setTo(pos: atEgjsAxesLib.axismanagerMod.Axis, duration: scala.Double): this.type = js.native
}

