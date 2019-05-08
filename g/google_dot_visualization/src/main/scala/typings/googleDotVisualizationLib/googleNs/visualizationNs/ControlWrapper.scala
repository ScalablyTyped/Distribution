package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("google.visualization.ControlWrapper")
@js.native
class ControlWrapper () extends js.Object {
  def this(opt_spec: ControlWrapperOptions) = this()
  def draw(): scala.Unit = js.native
  def getContainerId(): java.lang.String = js.native
  def getControl(): ControlWrapper = js.native
  def getControlName(): java.lang.String = js.native
  def getControlType(): java.lang.String = js.native
  def getOption(key: java.lang.String): js.Any = js.native
  def getOption(key: java.lang.String, opt_default_val: js.Any): js.Any = js.native
  def getOptions(): js.Object = js.native
  def getState(): js.Object = js.native
  def setContainerId(id: scala.Double): scala.Unit = js.native
  def setControlName(name: java.lang.String): scala.Unit = js.native
  def setControlType(`type`: java.lang.String): scala.Unit = js.native
  def setOption(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def setOptions(options_obj: js.Object): scala.Unit = js.native
  def setState(state_obj: js.Object): scala.Unit = js.native
  def toJSON(): java.lang.String = js.native
}

