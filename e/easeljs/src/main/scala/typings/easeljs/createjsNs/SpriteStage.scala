package typings.easeljs.createjsNs

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.SpriteStage")
@js.native
class SpriteStage protected () extends Stage {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, preserveDrawingBuffer: Boolean) = this()
  def this(canvas: HTMLCanvasElement, preserveDrawingBuffer: Boolean) = this()
  def this(canvas: String, preserveDrawingBuffer: Boolean, antialias: Boolean) = this()
  def this(canvas: HTMLCanvasElement, preserveDrawingBuffer: Boolean, antialias: Boolean) = this()
  var isWebGL: Boolean = js.native
  // methods
  def clearImageTexture(image: js.Object): Unit = js.native
  def updateViewport(width: Double, height: Double): Unit = js.native
}

/* static members */
@JSGlobal("createjs.SpriteStage")
@js.native
object SpriteStage extends js.Object {
  // properties
  var INDICES_PER_BOX: Double = js.native
  var MAX_BOXES_POINTS_INCREMENT: Double = js.native
  var MAX_INDEX_SIZE: Double = js.native
  var NUM_VERTEX_PROPERTIES: Double = js.native
  var NUM_VERTEX_PROPERTIES_PER_BOX: Double = js.native
  var POINTS_PER_BOX: Double = js.native
}

