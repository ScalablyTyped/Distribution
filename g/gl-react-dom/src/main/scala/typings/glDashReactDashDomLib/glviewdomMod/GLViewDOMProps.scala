package typings
package glDashReactDashDomLib.glviewdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GLViewDOMProps extends js.Object {
  var debug: js.UndefOr[scala.Double] = js.undefined
  var height: scala.Double
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var webglContextAttributes: js.UndefOr[stdLib.WebGLContextAttributes] = js.undefined
  var width: scala.Double
  def onContextCreate(gl: reactLib.WebGLRenderingContext): scala.Unit
  def onContextFailure(e: stdLib.Error): scala.Unit
  def onContextLost(): scala.Unit
  def onContextRestored(gl: reactLib.WebGLRenderingContext): scala.Unit
}

