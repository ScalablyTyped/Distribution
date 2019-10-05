package typings.dojo.dojox.drawing.annotations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/annotations/Angle.html
  *
  * When initiated, an HTML box will hover near the Stencil,
  * displaying it's angle while drawn or modified. Currently
  * only works with Vector, Line, Arrow, and Axes.
  * Annotation is positioned with dojox.drawing.util.positioning.angle
  * That method should be overwritten for custom placement.
  * Called internally.
  *
  * @param options One key value: the stencil that called this.
  */
@JSGlobal("dojox.drawing.annotations.Angle")
@js.native
class Angle protected () extends js.Object {
  def this(options: js.Object) = this()
  /**
    *
    */
  var angle: Double = js.native
  /**
    *
    */
  var `type`: String = js.native
  /**
    * Gets or creates HTMLNode used for display
    *
    */
  def getAngleNode(): js.Any = js.native
  /**
    * Turns display off.
    *
    */
  def hideAngle(): Unit = js.native
  /**
    * Called to display angle
    *
    */
  def showAngle(): Unit = js.native
}

