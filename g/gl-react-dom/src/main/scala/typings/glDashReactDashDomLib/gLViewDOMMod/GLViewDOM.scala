package typings
package glDashReactDashDomLib.gLViewDOMMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react-dom/GLViewDOM", "GLViewDOM")
@js.native
class GLViewDOM ()
  extends reactLib.reactMod.Component[GLViewDOMProps, GLViewDOMState, js.Any] {
  var afterDraw: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var canvas: js.UndefOr[stdLib.HTMLCanvasElement] = js.native
  var debugError: js.UndefOr[js.Function1[/* error */ stdLib.Error, scala.Unit]] = js.native
  var gl: js.UndefOr[stdLib.WebGLRenderingContext] = js.native
  var webglContextAttributes: stdLib.WebGLContextAttributes = js.native
  def captureAsBlob(callback: js.Function1[/* data */ stdLib.Blob, scala.Unit]): js.Promise[stdLib.Blob] = js.native
  def captureAsBlob(callback: js.Function1[/* data */ stdLib.Blob, scala.Unit], `type`: SupportedImage): js.Promise[stdLib.Blob] = js.native
  def captureAsBlob(
    callback: js.Function1[/* data */ stdLib.Blob, scala.Unit],
    `type`: SupportedImage,
    quality: ValidQuality
  ): js.Promise[stdLib.Blob] = js.native
  def captureAsDataURL(): java.lang.String = js.native
  def captureAsDataURL(`type`: SupportedImage): java.lang.String = js.native
  def captureAsDataURL(`type`: SupportedImage, quality: ValidQuality): java.lang.String = js.native
  def onRef(ref: stdLib.HTMLCanvasElement): scala.Unit = js.native
}

