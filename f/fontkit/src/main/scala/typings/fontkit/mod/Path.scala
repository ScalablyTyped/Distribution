package typings.fontkit.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Path extends js.Object {
  /**
    * Gets the exact bounding box of the path by evaluating curve segments.
    * Slower to compute than the control box, but more accurate.
    */
  var bbox: BBOX = js.native
  /**
    * Gets the "control box" of a path.
    * This is like the bounding box, but it includes all points including
    * control points of bezier segments and is much faster to compute than
    * the real bounding box.
    */
  var cbox: BBOX = js.native
  var commands: js.Array[PathCommand] = js.native
  /** Rotates the path by the given angle (in radians) */
  def rotate(angle: Double): this.type = js.native
  /** Scales the path */
  def scale(scaleX: Double): this.type = js.native
  def scale(scaleX: Double, scaleY: Double): this.type = js.native
  /**
    * Compiles the path to a JavaScript function that can be applied with
    * a graphics context in order to render the path.
    */
  def toFunction(): js.Function1[/* ctx */ CanvasRenderingContext2D, Unit] = js.native
  /** Converts the path to an SVG path data string */
  def toSVG(): String = js.native
  /** Transforms the path by the given matrix */
  def transform(m0: Double, m1: Double, m2: Double, m3: Double, m4: Double, m5: Double): this.type = js.native
  /** Translates the path by the given offset */
  def translate(x: Double, y: Double): this.type = js.native
}

