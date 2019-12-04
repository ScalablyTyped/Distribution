package typings.dojo.dojox.drawing.tools.custom

import typings.dojo.dojox.drawing.manager.Anchors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/tools/custom/Axes.html
  *
  * Draws a right-angle Axes (shaped like an L, not a +)
  * This Stencil is created with a Path so that the L shape
  * is one continuous piece. Arrow heads are placed at the end
  * of each axis. The Axes can be rotated. There are custom
  * label methods.
  *
  * @param options
  */
@JSGlobal("dojox.drawing.tools.custom.Axes")
@js.native
class Axes_ protected ()
  extends typings.dojo.dojox.drawing.stencil.Path {
  def this(options: js.Any) = this()
  /**
    *
    */
  var draws: Boolean = js.native
  /**
    * See stencil._Base ToolsSetup
    *
    */
  var setup: js.Object = js.native
  /**
    *
    */
  var showAngle: Boolean = js.native
  /**
    *
    */
  var zScale: Double = js.native
  /**
    * Gets called from anchor to check if its current
    * position is ok. If not, its x or y transform will
    * be changed until this passes.
    *
    * @param x
    * @param y
    * @param anchor
    */
  def anchorPositionCheck(x: Double, y: Double, anchor: Anchors): js.Object = js.native
  /**
    * Creates the label for each axis.
    *
    */
  def createLabels(): Unit = js.native
  /**
    * Overwrites _Base.onTransform
    *
    * @param anchor
    */
  def onTransform(anchor: Double): Unit = js.native
  /**
    * Converts points to data.
    *
    */
  def pointsToData(): js.Object = js.native
  /**
    * Custom placement for x-axis label
    *
    */
  def setLabelX(): js.Object = js.native
  /**
    * Custom placement for y-axis label
    *
    */
  def setLabelY(): js.Object = js.native
  /**
    * Custom placement for z-axis label
    *
    */
  def setLabelZ(): js.Object = js.native
  /**
    * Finds the point for the z axis.
    *
    * @param obj
    */
  def zPoint(obj: js.Any): js.Object = js.native
  /**
    *
    */
  def zSet(): Unit = js.native
}

