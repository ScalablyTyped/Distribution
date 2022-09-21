package typings.easeljs.global.createjs

import typings.easeljs.createjs.IStageGLOptions
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.StageGL")
@js.native
open class StageGL protected ()
  extends StObject
     with typings.easeljs.createjs.StageGL {
  def this(canvas: String) = this()
  def this(canvas: js.Object) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, options: IStageGLOptions) = this()
  def this(canvas: js.Object, options: IStageGLOptions) = this()
  def this(canvas: HTMLCanvasElement, options: IStageGLOptions) = this()
}
/* static members */
object StageGL {
  
  @JSGlobal("createjs.StageGL")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("createjs.StageGL.COVER_FRAGMENT_BODY")
  @js.native
  def COVER_FRAGMENT_BODY: String = js.native
  inline def COVER_FRAGMENT_BODY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COVER_FRAGMENT_BODY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.COVER_FRAGMENT_HEADER")
  @js.native
  def COVER_FRAGMENT_HEADER: String = js.native
  inline def COVER_FRAGMENT_HEADER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COVER_FRAGMENT_HEADER")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.COVER_UV")
  @js.native
  def COVER_UV: js.typedarray.Float32Array = js.native
  inline def COVER_UV_=(x: js.typedarray.Float32Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COVER_UV")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.COVER_UV_FLIP")
  @js.native
  def COVER_UV_FLIP: js.typedarray.Float32Array = js.native
  inline def COVER_UV_FLIP_=(x: js.typedarray.Float32Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COVER_UV_FLIP")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.COVER_VARYING_HEADER")
  @js.native
  def COVER_VARYING_HEADER: String = js.native
  inline def COVER_VARYING_HEADER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COVER_VARYING_HEADER")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.COVER_VERT")
  @js.native
  def COVER_VERT: js.typedarray.Float32Array = js.native
  
  @JSGlobal("createjs.StageGL.COVER_VERTEX_BODY")
  @js.native
  def COVER_VERTEX_BODY: String = js.native
  inline def COVER_VERTEX_BODY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COVER_VERTEX_BODY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.COVER_VERTEX_HEADER")
  @js.native
  def COVER_VERTEX_HEADER: String = js.native
  inline def COVER_VERTEX_HEADER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COVER_VERTEX_HEADER")(x.asInstanceOf[js.Any])
  
  inline def COVER_VERT_=(x: js.typedarray.Float32Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COVER_VERT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.DEFAULT_MAX_BATCH_SIZE")
  @js.native
  def DEFAULT_MAX_BATCH_SIZE: Double = js.native
  inline def DEFAULT_MAX_BATCH_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_MAX_BATCH_SIZE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.INDICIES_PER_CARD")
  @js.native
  def INDICIES_PER_CARD: Double = js.native
  inline def INDICIES_PER_CARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICIES_PER_CARD")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.PARTICLE_FRAGMENT_BODY")
  @js.native
  def PARTICLE_FRAGMENT_BODY: String = js.native
  inline def PARTICLE_FRAGMENT_BODY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PARTICLE_FRAGMENT_BODY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.PARTICLE_VERTEX_BODY")
  @js.native
  def PARTICLE_VERTEX_BODY: String = js.native
  inline def PARTICLE_VERTEX_BODY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PARTICLE_VERTEX_BODY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.REGULAR_FRAGMENT_BODY")
  @js.native
  def REGULAR_FRAGMENT_BODY: String = js.native
  inline def REGULAR_FRAGMENT_BODY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGULAR_FRAGMENT_BODY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.REGULAR_FRAGMENT_HEADER")
  @js.native
  def REGULAR_FRAGMENT_HEADER: String = js.native
  inline def REGULAR_FRAGMENT_HEADER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGULAR_FRAGMENT_HEADER")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.REGULAR_FRAG_COLOR_NORMAL")
  @js.native
  def REGULAR_FRAG_COLOR_NORMAL: String = js.native
  inline def REGULAR_FRAG_COLOR_NORMAL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGULAR_FRAG_COLOR_NORMAL")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.REGULAR_FRAG_COLOR_PREMULTIPLY")
  @js.native
  def REGULAR_FRAG_COLOR_PREMULTIPLY: String = js.native
  inline def REGULAR_FRAG_COLOR_PREMULTIPLY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGULAR_FRAG_COLOR_PREMULTIPLY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.REGULAR_VARYING_HEADER")
  @js.native
  def REGULAR_VARYING_HEADER: String = js.native
  inline def REGULAR_VARYING_HEADER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGULAR_VARYING_HEADER")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.REGULAR_VERTEX_BODY")
  @js.native
  def REGULAR_VERTEX_BODY: String = js.native
  inline def REGULAR_VERTEX_BODY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGULAR_VERTEX_BODY")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.REGULAR_VERTEX_HEADER")
  @js.native
  def REGULAR_VERTEX_HEADER: String = js.native
  inline def REGULAR_VERTEX_HEADER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REGULAR_VERTEX_HEADER")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.UV_RECT")
  @js.native
  def UV_RECT: Double = js.native
  inline def UV_RECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UV_RECT")(x.asInstanceOf[js.Any])
  
  // properties
  @JSGlobal("createjs.StageGL.VERTEX_PROPERTY_COUNT")
  @js.native
  def VERTEX_PROPERTY_COUNT: Double = js.native
  inline def VERTEX_PROPERTY_COUNT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERTEX_PROPERTY_COUNT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.StageGL.WEBGL_MAX_INDEX_NUM")
  @js.native
  def WEBGL_MAX_INDEX_NUM: Double = js.native
  inline def WEBGL_MAX_INDEX_NUM_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WEBGL_MAX_INDEX_NUM")(x.asInstanceOf[js.Any])
  
  // methods
  inline def buildUVRects(spritesheet: typings.easeljs.createjs.SpriteSheet): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("buildUVRects")(spritesheet.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def buildUVRects(spritesheet: typings.easeljs.createjs.SpriteSheet, target: Double): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("buildUVRects")(spritesheet.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def buildUVRects(spritesheet: typings.easeljs.createjs.SpriteSheet, target: Double, onlyTarget: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("buildUVRects")(spritesheet.asInstanceOf[js.Any], target.asInstanceOf[js.Any], onlyTarget.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def buildUVRects(spritesheet: typings.easeljs.createjs.SpriteSheet, target: Unit, onlyTarget: Boolean): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("buildUVRects")(spritesheet.asInstanceOf[js.Any], target.asInstanceOf[js.Any], onlyTarget.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def isWebGLActive(ctx: CanvasRenderingContext2D): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWebGLActive")(ctx.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
