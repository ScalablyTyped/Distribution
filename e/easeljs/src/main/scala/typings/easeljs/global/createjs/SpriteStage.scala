package typings.easeljs.global.createjs

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("createjs.SpriteStage")
@js.native
class SpriteStage protected ()
  extends StObject
     with typings.easeljs.createjs.SpriteStage {
  def this(canvas: String) = this()
  def this(canvas: HTMLCanvasElement) = this()
  def this(canvas: String, preserveDrawingBuffer: Boolean) = this()
  def this(canvas: HTMLCanvasElement, preserveDrawingBuffer: Boolean) = this()
  def this(canvas: String, preserveDrawingBuffer: Boolean, antialias: Boolean) = this()
  def this(canvas: String, preserveDrawingBuffer: Unit, antialias: Boolean) = this()
  def this(canvas: HTMLCanvasElement, preserveDrawingBuffer: Boolean, antialias: Boolean) = this()
  def this(canvas: HTMLCanvasElement, preserveDrawingBuffer: Unit, antialias: Boolean) = this()
}
/* static members */
object SpriteStage {
  
  @JSGlobal("createjs.SpriteStage")
  @js.native
  val ^ : js.Any = js.native
  
  // properties
  @JSGlobal("createjs.SpriteStage.INDICES_PER_BOX")
  @js.native
  def INDICES_PER_BOX: Double = js.native
  @scala.inline
  def INDICES_PER_BOX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INDICES_PER_BOX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.SpriteStage.MAX_BOXES_POINTS_INCREMENT")
  @js.native
  def MAX_BOXES_POINTS_INCREMENT: Double = js.native
  @scala.inline
  def MAX_BOXES_POINTS_INCREMENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_BOXES_POINTS_INCREMENT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.SpriteStage.MAX_INDEX_SIZE")
  @js.native
  def MAX_INDEX_SIZE: Double = js.native
  @scala.inline
  def MAX_INDEX_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_INDEX_SIZE")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.SpriteStage.NUM_VERTEX_PROPERTIES")
  @js.native
  def NUM_VERTEX_PROPERTIES: Double = js.native
  @scala.inline
  def NUM_VERTEX_PROPERTIES_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM_VERTEX_PROPERTIES")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.SpriteStage.NUM_VERTEX_PROPERTIES_PER_BOX")
  @js.native
  def NUM_VERTEX_PROPERTIES_PER_BOX: Double = js.native
  @scala.inline
  def NUM_VERTEX_PROPERTIES_PER_BOX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUM_VERTEX_PROPERTIES_PER_BOX")(x.asInstanceOf[js.Any])
  
  @JSGlobal("createjs.SpriteStage.POINTS_PER_BOX")
  @js.native
  def POINTS_PER_BOX: Double = js.native
  @scala.inline
  def POINTS_PER_BOX_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POINTS_PER_BOX")(x.asInstanceOf[js.Any])
}
