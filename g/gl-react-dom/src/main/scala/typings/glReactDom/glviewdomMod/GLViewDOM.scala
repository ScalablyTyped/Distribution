package typings.glReactDom.glviewdomMod

import typings.react.mod.Component
import typings.std.Blob
import typings.std.Error
import typings.std.HTMLCanvasElement
import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react-dom/GLViewDOM", "GLViewDOM")
@js.native
class GLViewDOM ()
  extends Component[GLViewDOMProps, GLViewDOMState, js.Any] {
  var afterDraw: js.UndefOr[js.Function0[Unit]] = js.native
  var canvas: js.UndefOr[HTMLCanvasElement] = js.native
  var debugError: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
  var gl: js.UndefOr[WebGLRenderingContext] = js.native
  var webglContextAttributes: WebGLContextAttributes = js.native
  def captureAsBlob(callback: js.Function1[/* data */ Blob, Unit]): js.Promise[Blob] = js.native
  def captureAsBlob(
    callback: js.Function1[/* data */ Blob, Unit],
    `type`: js.UndefOr[scala.Nothing],
    quality: ValidQuality
  ): js.Promise[Blob] = js.native
  def captureAsBlob(callback: js.Function1[/* data */ Blob, Unit], `type`: SupportedImage): js.Promise[Blob] = js.native
  def captureAsBlob(callback: js.Function1[/* data */ Blob, Unit], `type`: SupportedImage, quality: ValidQuality): js.Promise[Blob] = js.native
  def captureAsDataURL(): String = js.native
  def captureAsDataURL(`type`: js.UndefOr[scala.Nothing], quality: ValidQuality): String = js.native
  def captureAsDataURL(`type`: SupportedImage): String = js.native
  def captureAsDataURL(`type`: SupportedImage, quality: ValidQuality): String = js.native
  def onRef(ref: HTMLCanvasElement): Unit = js.native
}

