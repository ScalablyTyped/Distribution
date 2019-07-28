package typings.easeljs.createjsNs

import typings.std.CanvasRenderingContext2D
import typings.std.Float32Array
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.StageGL")
@js.native
class StageGL protected () extends Stage {
  def this(canvas: String) = this()
  def this(canvas: js.Object) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, options: IStageGLOptions) = this()
  def this(canvas: js.Object, options: IStageGLOptions) = this()
  def this(canvas: HTMLCanvasElement, options: IStageGLOptions) = this()
  var autoPurge: Double = js.native
  var isWebGL: Boolean = js.native
  var vocalDebug: Boolean = js.native
  def cacheDraw(target: DisplayObject, filters: js.Array[Filter], manager: BitmapCache): Boolean = js.native
  def getBaseTexture(): WebGLTexture | Null = js.native
  def getBaseTexture(w: Double): WebGLTexture | Null = js.native
  def getBaseTexture(w: Double, h: Double): WebGLTexture | Null = js.native
  def getFilterShader(filter: js.Object): WebGLProgram = js.native
  def getFilterShader(filter: Filter): WebGLProgram = js.native
  def getRenderBufferTexture(w: Double, h: Double): WebGLTexture = js.native
  def getTargetRenderTexture(target: DisplayObject, w: Double, h: Double): js.Object = js.native
  def protectTextureSlot(id: Double): Unit = js.native
  def protectTextureSlot(id: Double, lock: Boolean): Unit = js.native
  def purgeTextures(): Unit = js.native
  def purgeTextures(count: Double): Unit = js.native
  def releaseTexture(item: DisplayObject): Unit = js.native
  def releaseTexture(item: HTMLCanvasElement): Unit = js.native
  def releaseTexture(item: HTMLImageElement): Unit = js.native
  def releaseTexture(item: WebGLTexture): Unit = js.native
  def setTextureParams(gl: WebGLRenderingContext): Unit = js.native
  def setTextureParams(gl: WebGLRenderingContext, isPOT: Boolean): Unit = js.native
  def updateSimultaneousTextureCount(): Unit = js.native
  def updateSimultaneousTextureCount(count: Double): Unit = js.native
  def updateViewport(width: Double, height: Double): Unit = js.native
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
  def buildUVRects(spritesheet: SpriteSheet): js.Object = js.native
  def buildUVRects(spritesheet: SpriteSheet, target: Double): js.Object = js.native
  def buildUVRects(spritesheet: SpriteSheet, target: Double, onlyTarget: Boolean): js.Object = js.native
  def isWebGLActive(ctx: CanvasRenderingContext2D): Boolean = js.native
}

