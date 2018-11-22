package typings
package glDashReactDashExpoLib.glviewnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gl-react-expo/GLViewNative", "GLViewNative")
@js.native
class GLViewNative ()
  extends reactLib.reactMod.Component[GLViewNativeProps, js.Object, js.Any] {
  var afterDraw: js.UndefOr[js.Function0[scala.Unit]] = js.native
  var ref: js.UndefOr[js.Any] = js.native
  def capture(opt: js.Any): stdLib.Promise[glDashReactDashExpoLib.Anon_Uri] = js.native
  def onContextCreate(gl: reactLib.WebGLRenderingContext): scala.Unit = js.native
  def onRef(ref: js.Any): scala.Unit = js.native
}

