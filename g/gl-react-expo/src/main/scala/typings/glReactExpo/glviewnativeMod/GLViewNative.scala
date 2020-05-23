package typings.glReactExpo.glviewnativeMod

import typings.glReactExpo.anon.Height
import typings.react.mod.Component
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react-expo/GLViewNative", "GLViewNative")
@js.native
class GLViewNative ()
  extends Component[GLViewNativeProps, js.Object, js.Any] {
  var afterDraw: js.UndefOr[js.Function0[Unit]] = js.native
  var ref: js.UndefOr[js.Any] = js.native
  def capture(opt: js.Any): js.Promise[Height] = js.native
  def onContextCreate(gl: WebGLRenderingContext): Unit = js.native
  def onRef(ref: js.Any): Unit = js.native
}

