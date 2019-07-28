package typings.atEgjsAxes.axesMod

import org.scalablytyped.runtime.StringDictionary
import typings.atEgjsAxes.animationManagerMod.AnimationManager
import typings.atEgjsAxes.axisManagerMod.Axis
import typings.atEgjsAxes.axisManagerMod.AxisManager
import typings.atEgjsAxes.axisManagerMod.AxisOption
import typings.atEgjsAxes.eventManagerMod.EventManager
import typings.atEgjsAxes.inputObserverMod.InputObserver
import typings.atEgjsAxes.inputTypeInputTypeMod.IInputType
import typings.atEgjsAxes.interruptManagerMod.InterruptManager
import typings.atEgjsComponent.atEgjsComponentMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Axes extends ^ {
  var _am: AnimationManager = js.native
  var _axm: AxisManager = js.native
  var _em: EventManager = js.native
  var _inputs: js.Array[IInputType] = js.native
  var _io: InputObserver = js.native
  var _itm: InterruptManager = js.native
  var axis: StringDictionary[AxisOption] = js.native
  @JSName("options")
  var options_Axes: AxesOption = js.native
  /* private */ def _complementOptions(): js.Any = js.native
  def connect(axes: String, inputType: IInputType): this.type = js.native
  def connect(axes: js.Array[String], inputType: IInputType): this.type = js.native
  def destroy(): Unit = js.native
  def disconnect(): this.type = js.native
  def disconnect(inputType: IInputType): this.type = js.native
  def get(): Axis = js.native
  def get(axes: js.Array[String]): Axis = js.native
  def isBounceArea(): Boolean = js.native
  def isBounceArea(axes: js.Array[String]): Boolean = js.native
  def setBy(pos: Axis): this.type = js.native
  def setBy(pos: Axis, duration: Double): this.type = js.native
  def setTo(pos: Axis): this.type = js.native
  def setTo(pos: Axis, duration: Double): this.type = js.native
}

