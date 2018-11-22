package typings
package glDashReactDashNativeLib.glviewnativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GLViewNativeProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  def onContextCreate(gl: reactLib.WebGLRenderingContext): scala.Unit
  def onContextFailure(e: stdLib.Error): scala.Unit
}

