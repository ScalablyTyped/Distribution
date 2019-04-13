package typings
package atEgjsAxesLib.axesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axes
  extends atEgjsComponentLib.atEgjsComponentMod.^ {
  var _am: atEgjsAxesLib.animationManagerMod.AnimationManager = js.native
  var _axm: atEgjsAxesLib.axisManagerMod.AxisManager = js.native
  var _em: atEgjsAxesLib.eventManagerMod.EventManager = js.native
  var _inputs: js.Array[atEgjsAxesLib.inputTypeInputTypeMod.IInputType] = js.native
  var _io: atEgjsAxesLib.inputObserverMod.InputObserver = js.native
  var _itm: atEgjsAxesLib.interruptManagerMod.InterruptManager = js.native
  var axis: org.scalablytyped.runtime.StringDictionary[atEgjsAxesLib.axisManagerMod.AxisOption] = js.native
  @JSName("options")
  var options_Axes: AxesOption = js.native
  /* private */ def _complementOptions(): js.Any = js.native
  def connect(axes: java.lang.String, inputType: atEgjsAxesLib.inputTypeInputTypeMod.IInputType): this.type = js.native
  def connect(axes: js.Array[java.lang.String], inputType: atEgjsAxesLib.inputTypeInputTypeMod.IInputType): this.type = js.native
  def destroy(): scala.Unit = js.native
  def disconnect(): this.type = js.native
  def disconnect(inputType: atEgjsAxesLib.inputTypeInputTypeMod.IInputType): this.type = js.native
  def get(): atEgjsAxesLib.axisManagerMod.Axis = js.native
  def get(axes: js.Array[java.lang.String]): atEgjsAxesLib.axisManagerMod.Axis = js.native
  def isBounceArea(): scala.Boolean = js.native
  def isBounceArea(axes: js.Array[java.lang.String]): scala.Boolean = js.native
  def setBy(pos: atEgjsAxesLib.axisManagerMod.Axis): this.type = js.native
  def setBy(pos: atEgjsAxesLib.axisManagerMod.Axis, duration: scala.Double): this.type = js.native
  def setTo(pos: atEgjsAxesLib.axisManagerMod.Axis): this.type = js.native
  def setTo(pos: atEgjsAxesLib.axisManagerMod.Axis, duration: scala.Double): this.type = js.native
}

