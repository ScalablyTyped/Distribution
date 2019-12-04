package typings.dojo.dojox.charting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/Chart3D.html
  *
  *
  * @param node
  * @param lights
  * @param camera
  * @param theme
  */
@JSGlobal("dojox.charting.Chart3D")
@js.native
class Chart3D protected () extends js.Object {
  def this(node: js.Any, lights: js.Any, camera: js.Any, theme: js.Any) = this()
  /**
    *
    * @param plot
    */
  def addPlot(plot: js.Any): js.Any = js.native
  /**
    *
    * @param wall
    */
  def addWall(wall: js.Any): js.Any = js.native
  /**
    *
    */
  def generate(): js.Any = js.native
  /**
    *
    */
  def invalidate(): js.Function = js.native
  /**
    *
    * @param plot
    */
  def removePlot(plot: js.Any): js.Any = js.native
  /**
    *
    * @param wall
    */
  def removeWall(wall: js.Any): js.Any = js.native
  /**
    *
    */
  def render(): js.Function = js.native
  /**
    *
    * @param dir
    */
  def setDir(dir: String): js.Function = js.native
}

