package typings.dojo.dojox.charting.bidi

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/bidi/Chart3D.html
  *
  *
  */
@JSGlobal("dojox.charting.bidi.Chart3D")
@js.native
class Chart3D () extends js.Object {
  /**
    * Mirroring support,  the main variable which is responsible for the direction of the chart.
    *
    * Allowed values:
    * 1. "ltr"
    * 2. "rtl"
    *
    * By default is ltr.
    *
    */
  var direction: String = js.native
  /**
    *
    */
  var isMirrored: Boolean = js.native
  /**
    * apply the mirroring operation to the current chart plots.
    *
    * @param plot
    * @param dim
    * @param offsets
    */
  def applyMirroring(plot: js.Any, dim: js.Any, offsets: js.Any): js.Function = js.native
  /**
    *
    */
  def generate(): js.Function = js.native
  /**
    * check the Direction of the chart.
    * check the chartBaseDirection attribute to determine the rendering direction
    * of the chart.
    *
    */
  def isRightToLeft(): Boolean = js.native
  /**
    * The keyword arguments that can be passed in a Chart constructor.
    *
    * @param node The DOM node to construct the chart on.
    * @param lights Lighting properties for the 3d scene
    * @param camera Camera properties describing the viewing camera position.
    * @param theme Charting theme to use for coloring chart elements.
    * @param direction the direction used to render the chart values[rtl/ltr]
    */
  def postscript(node: HTMLElement, lights: js.Any, camera: js.Object, theme: js.Object, direction: String): Unit = js.native
  /**
    * Setter for the chartBaseDirection attribute.
    * Allows dynamically set the chartBaseDirection attribute, which will used toupdates the chart rendering direction.
    * dir : the desired chart direction [rtl: for right to left ,ltr: for left to right]
    *
    * @param dir
    */
  def setDir(dir: js.Any): js.Function = js.native
}

