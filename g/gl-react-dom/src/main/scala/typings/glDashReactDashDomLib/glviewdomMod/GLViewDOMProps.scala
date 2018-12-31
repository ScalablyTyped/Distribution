package typings
package glDashReactDashDomLib.glviewdomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLViewDOMProps extends js.Object {
  var debug: js.UndefOr[scala.Double] = js.undefined
  var height: scala.Double
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit]] = js.undefined
  var onContextFailure: js.UndefOr[js.Function1[/* e */ stdLib.Error, scala.Unit]] = js.undefined
  var onContextLost: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onContextRestored: js.UndefOr[js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit]] = js.undefined
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var webglContextAttributes: js.UndefOr[stdLib.WebGLContextAttributes] = js.undefined
  var width: scala.Double
}

