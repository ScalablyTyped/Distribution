package typings
package easeljsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.StageGL")
@js.native
class StageGL protected () extends Stage {
  def this(canvas: java.lang.String) = this()
  def this(canvas: js.Object) = this()
  def this(canvas: stdLib.HTMLCanvasElement) = this()
  def this(canvas: java.lang.String, options: IStageGLOptions) = this()
  def this(canvas: js.Object, options: IStageGLOptions) = this()
  def this(canvas: stdLib.HTMLCanvasElement, options: IStageGLOptions) = this()
  var autoPurge: scala.Double = js.native
  var isWebGL: scala.Boolean = js.native
  var vocalDebug: scala.Boolean = js.native
  def cacheDraw(target: DisplayObject, filters: js.Array[Filter], manager: BitmapCache): scala.Boolean = js.native
  def getBaseTexture(): stdLib.WebGLTexture | scala.Null = js.native
  def getBaseTexture(w: scala.Double): stdLib.WebGLTexture | scala.Null = js.native
  def getBaseTexture(w: scala.Double, h: scala.Double): stdLib.WebGLTexture | scala.Null = js.native
  def getFilterShader(filter: Filter): stdLib.WebGLProgram = js.native
  def getFilterShader(filter: js.Object): stdLib.WebGLProgram = js.native
  def getRenderBufferTexture(w: scala.Double, h: scala.Double): stdLib.WebGLTexture = js.native
  def getTargetRenderTexture(target: DisplayObject, w: scala.Double, h: scala.Double): js.Object = js.native
  def protectTextureSlot(id: scala.Double): scala.Unit = js.native
  def protectTextureSlot(id: scala.Double, lock: scala.Boolean): scala.Unit = js.native
  def purgeTextures(): scala.Unit = js.native
  def purgeTextures(count: scala.Double): scala.Unit = js.native
  def releaseTexture(item: DisplayObject): scala.Unit = js.native
  def releaseTexture(item: stdLib.HTMLCanvasElement): scala.Unit = js.native
  def releaseTexture(item: stdLib.HTMLImageElement): scala.Unit = js.native
  def releaseTexture(item: stdLib.WebGLTexture): scala.Unit = js.native
  def setTextureParams(gl: stdLib.WebGLRenderingContext): scala.Unit = js.native
  def setTextureParams(gl: stdLib.WebGLRenderingContext, isPOT: scala.Boolean): scala.Unit = js.native
  def updateSimultaneousTextureCount(): scala.Unit = js.native
  def updateSimultaneousTextureCount(count: scala.Double): scala.Unit = js.native
  def updateViewport(width: scala.Double, height: scala.Double): scala.Unit = js.native
}

@JSGlobal("createjs.StageGL")
@js.native
object StageGL extends js.Object {
  var COVER_FRAGMENT_BODY: java.lang.String = js.native
  var COVER_FRAGMENT_HEADER: java.lang.String = js.native
  var COVER_UV: stdLib.Float32Array = js.native
  var COVER_UV_FLIP: stdLib.Float32Array = js.native
  var COVER_VARYING_HEADER: java.lang.String = js.native
  var COVER_VERT: stdLib.Float32Array = js.native
  var COVER_VERTEX_BODY: java.lang.String = js.native
  var COVER_VERTEX_HEADER: java.lang.String = js.native
  var DEFAULT_MAX_BATCH_SIZE: scala.Double = js.native
  var INDICIES_PER_CARD: scala.Double = js.native
  var PARTICLE_FRAGMENT_BODY: java.lang.String = js.native
  var PARTICLE_VERTEX_BODY: java.lang.String = js.native
  var REGULAR_FRAGMENT_BODY: java.lang.String = js.native
  var REGULAR_FRAGMENT_HEADER: java.lang.String = js.native
  var REGULAR_FRAG_COLOR_NORMAL: java.lang.String = js.native
  var REGULAR_FRAG_COLOR_PREMULTIPLY: java.lang.String = js.native
  var REGULAR_VARYING_HEADER: java.lang.String = js.native
  var REGULAR_VERTEX_BODY: java.lang.String = js.native
  var REGULAR_VERTEX_HEADER: java.lang.String = js.native
  var UV_RECT: scala.Double = js.native
  // properties
  var VERTEX_PROPERTY_COUNT: scala.Double = js.native
  var WEBGL_MAX_INDEX_NUM: scala.Double = js.native
  // methods
  def buildUVRects(spritesheet: easeljsLib.createjsNs.SpriteSheet): js.Object = js.native
  // methods
  def buildUVRects(spritesheet: easeljsLib.createjsNs.SpriteSheet, target: scala.Double): js.Object = js.native
  // methods
  def buildUVRects(spritesheet: easeljsLib.createjsNs.SpriteSheet, target: scala.Double, onlyTarget: scala.Boolean): js.Object = js.native
  def isWebGLActive(ctx: stdLib.CanvasRenderingContext2D): scala.Boolean = js.native
}

