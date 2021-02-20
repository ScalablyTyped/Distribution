package typings.easeljs.createjs

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.WebGLProgram
import typings.std.WebGLRenderingContext
import typings.std.WebGLTexture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageGL extends Stage {
  
  var autoPurge: Double = js.native
  
  def cacheDraw(target: DisplayObject, filters: js.Array[Filter], manager: BitmapCache): Boolean = js.native
  
  def getBaseTexture(): WebGLTexture | Null = js.native
  def getBaseTexture(w: js.UndefOr[scala.Nothing], h: Double): WebGLTexture | Null = js.native
  def getBaseTexture(w: Double): WebGLTexture | Null = js.native
  def getBaseTexture(w: Double, h: Double): WebGLTexture | Null = js.native
  
  def getFilterShader(filter: js.Object): WebGLProgram = js.native
  def getFilterShader(filter: Filter): WebGLProgram = js.native
  
  def getRenderBufferTexture(w: Double, h: Double): WebGLTexture = js.native
  
  def getTargetRenderTexture(target: DisplayObject, w: Double, h: Double): js.Object = js.native
  
  var isWebGL: Boolean = js.native
  
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
  
  var vocalDebug: Boolean = js.native
}
