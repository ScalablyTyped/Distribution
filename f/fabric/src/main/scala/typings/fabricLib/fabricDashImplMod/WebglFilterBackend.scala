package typings
package fabricLib.fabricDashImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fabric/fabric-impl", "WebglFilterBackend")
@js.native
class WebglFilterBackend ()
  extends FilterBackend
     with WebglFilterBackendOptions {
  def this(options: WebglFilterBackendOptions) = this()
  /* CompleteClass */
  override var tileSize: scala.Double = js.native
  def applyFiltersDebug(
    filters: js.Array[IBaseFilter],
    sourceElement: stdLib.HTMLCanvasElement,
    sourceWidth: scala.Double,
    sourceHeight: scala.Double,
    targetCanvas: stdLib.HTMLCanvasElement
  ): js.Any = js.native
  def applyFiltersDebug(
    filters: js.Array[IBaseFilter],
    sourceElement: stdLib.HTMLCanvasElement,
    sourceWidth: scala.Double,
    sourceHeight: scala.Double,
    targetCanvas: stdLib.HTMLCanvasElement,
    cacheKey: java.lang.String
  ): js.Any = js.native
  def applyFiltersDebug(
    filters: js.Array[IBaseFilter],
    sourceElement: stdLib.HTMLImageElement,
    sourceWidth: scala.Double,
    sourceHeight: scala.Double,
    targetCanvas: stdLib.HTMLCanvasElement
  ): js.Any = js.native
  def applyFiltersDebug(
    filters: js.Array[IBaseFilter],
    sourceElement: stdLib.HTMLImageElement,
    sourceWidth: scala.Double,
    sourceHeight: scala.Double,
    targetCanvas: stdLib.HTMLCanvasElement,
    cacheKey: java.lang.String
  ): js.Any = js.native
  def captureGPUInfo(): GPUInfo = js.native
  def chooseFastestCopyGLTo2DMethod(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def copyGLTo2D(gl: stdLib.WebGLRenderingContext, pipelineState: js.Any): scala.Unit = js.native
  def createTexture(gl: stdLib.WebGLRenderingContext, width: scala.Double, height: scala.Double): stdLib.WebGLTexture = js.native
  def createTexture(
    gl: stdLib.WebGLRenderingContext,
    width: scala.Double,
    height: scala.Double,
    textureImageSource: stdLib.HTMLCanvasElement
  ): stdLib.WebGLTexture = js.native
  def createTexture(
    gl: stdLib.WebGLRenderingContext,
    width: scala.Double,
    height: scala.Double,
    textureImageSource: stdLib.HTMLImageElement
  ): stdLib.WebGLTexture = js.native
  def createWebGLCanvas(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def getCachedTexture(uniqueId: java.lang.String, textureImageSource: stdLib.HTMLCanvasElement): stdLib.WebGLTexture = js.native
  def getCachedTexture(uniqueId: java.lang.String, textureImageSource: stdLib.HTMLImageElement): stdLib.WebGLTexture = js.native
  def glErrorToString(context: js.Any, errorCode: js.Any): java.lang.String = js.native
  def setupGLContext(width: scala.Double, height: scala.Double): scala.Unit = js.native
}

