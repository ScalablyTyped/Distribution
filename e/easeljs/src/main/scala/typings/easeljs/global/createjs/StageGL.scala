package typings.easeljs.global.createjs

import typings.easeljs.createjs.IStageGLOptions
import typings.std.CanvasRenderingContext2D
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.StageGL")
@js.native
class StageGL protected ()
  extends typings.easeljs.createjs.StageGL {
  def this(canvas: String) = this()
  def this(canvas: js.Object) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, options: IStageGLOptions) = this()
  def this(canvas: js.Object, options: IStageGLOptions) = this()
  def this(canvas: HTMLCanvasElement, options: IStageGLOptions) = this()
}

/* static members */
@JSGlobal("createjs.StageGL")
@js.native
object StageGL extends js.Object {
  var COVER_FRAGMENT_BODY: String = js.native
  var COVER_FRAGMENT_HEADER: String = js.native
  var COVER_UV: Float32Array = js.native
  var COVER_UV_FLIP: Float32Array = js.native
  var COVER_VARYING_HEADER: String = js.native
  var COVER_VERT: Float32Array = js.native
  var COVER_VERTEX_BODY: String = js.native
  var COVER_VERTEX_HEADER: String = js.native
  var DEFAULT_MAX_BATCH_SIZE: Double = js.native
  var INDICIES_PER_CARD: Double = js.native
  var PARTICLE_FRAGMENT_BODY: String = js.native
  var PARTICLE_VERTEX_BODY: String = js.native
  var REGULAR_FRAGMENT_BODY: String = js.native
  var REGULAR_FRAGMENT_HEADER: String = js.native
  var REGULAR_FRAG_COLOR_NORMAL: String = js.native
  var REGULAR_FRAG_COLOR_PREMULTIPLY: String = js.native
  var REGULAR_VARYING_HEADER: String = js.native
  var REGULAR_VERTEX_BODY: String = js.native
  var REGULAR_VERTEX_HEADER: String = js.native
  var UV_RECT: Double = js.native
  // properties
  var VERTEX_PROPERTY_COUNT: Double = js.native
  var WEBGL_MAX_INDEX_NUM: Double = js.native
  // methods
  def buildUVRects(spritesheet: typings.easeljs.createjs.SpriteSheet): js.Object = js.native
  def buildUVRects(spritesheet: typings.easeljs.createjs.SpriteSheet, target: Double): js.Object = js.native
  def buildUVRects(spritesheet: typings.easeljs.createjs.SpriteSheet, target: Double, onlyTarget: Boolean): js.Object = js.native
  def isWebGLActive(ctx: CanvasRenderingContext2D): Boolean = js.native
}

