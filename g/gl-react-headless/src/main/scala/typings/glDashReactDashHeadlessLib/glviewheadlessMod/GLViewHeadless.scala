package typings
package glDashReactDashHeadlessLib.glviewheadlessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react-headless/GLViewHeadless", "GLViewHeadless")
@js.native
class GLViewHeadless ()
  extends reactLib.reactMod.Component[GLViewHeadlessProps, js.Object, js.Any] {
  var canvas: js.UndefOr[reactLib.HTMLCanvasElement] = js.native
  var gl: js.UndefOr[reactLib.WebGLRenderingContext] = js.native
  var webglContextAttributes: stdLib.WebGLContextAttributes = js.native
  def captureAsBlob(): js.Promise[stdLib.Blob] = js.native
  def captureAsDataURL(): java.lang.String = js.native
  def onRef(ref: reactLib.HTMLCanvasElement): scala.Unit = js.native
  def simulateContextLost(): scala.Unit = js.native
  def simulateContextRestored(): scala.Unit = js.native
}

