package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.SpriteStage")
@js.native
class SpriteStage protected () extends Stage {
  def this(canvas: java.lang.String) = this()
  def this(canvas: stdLib.HTMLCanvasElement) = this()
  def this(canvas: java.lang.String, preserveDrawingBuffer: scala.Boolean) = this()
  def this(canvas: stdLib.HTMLCanvasElement, preserveDrawingBuffer: scala.Boolean) = this()
  def this(canvas: java.lang.String, preserveDrawingBuffer: scala.Boolean, antialias: scala.Boolean) = this()
  def this(canvas: stdLib.HTMLCanvasElement, preserveDrawingBuffer: scala.Boolean, antialias: scala.Boolean) = this()
  var isWebGL: scala.Boolean = js.native
  // methods
  def clearImageTexture(image: js.Object): scala.Unit = js.native
  def updateViewport(width: scala.Double, height: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("createjs.SpriteStage")
@js.native
object SpriteStage extends js.Object {
  // properties
  var INDICES_PER_BOX: scala.Double = js.native
  var MAX_BOXES_POINTS_INCREMENT: scala.Double = js.native
  var MAX_INDEX_SIZE: scala.Double = js.native
  var NUM_VERTEX_PROPERTIES: scala.Double = js.native
  var NUM_VERTEX_PROPERTIES_PER_BOX: scala.Double = js.native
  var POINTS_PER_BOX: scala.Double = js.native
}

