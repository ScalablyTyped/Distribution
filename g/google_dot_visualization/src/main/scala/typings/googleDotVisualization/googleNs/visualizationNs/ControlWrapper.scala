package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.ControlWrapper")
@js.native
class ControlWrapper () extends js.Object {
  def this(opt_spec: ControlWrapperOptions) = this()
  def draw(): Unit = js.native
  def getContainerId(): String = js.native
  def getControl(): ControlWrapper = js.native
  def getControlName(): String = js.native
  def getControlType(): String = js.native
  def getOption(key: String): js.Any = js.native
  def getOption(key: String, opt_default_val: js.Any): js.Any = js.native
  def getOptions(): js.Object = js.native
  def getState(): js.Object = js.native
  def setContainerId(id: Double): Unit = js.native
  def setControlName(name: String): Unit = js.native
  def setControlType(`type`: String): Unit = js.native
  def setOption(key: String, value: String): Unit = js.native
  def setOptions(options_obj: js.Object): Unit = js.native
  def setState(state_obj: js.Object): Unit = js.native
  def toJSON(): String = js.native
}

