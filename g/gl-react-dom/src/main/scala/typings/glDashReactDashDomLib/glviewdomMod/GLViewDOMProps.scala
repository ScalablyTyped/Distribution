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

object GLViewDOMProps {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    debug: scala.Int | scala.Double = null,
    onContextCreate: js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit] = null,
    onContextFailure: js.Function1[/* e */ stdLib.Error, scala.Unit] = null,
    onContextLost: js.Function0[scala.Unit] = null,
    onContextRestored: js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit] = null,
    pixelRatio: scala.Int | scala.Double = null,
    style: js.Any = null,
    webglContextAttributes: stdLib.WebGLContextAttributes = null
  ): GLViewDOMProps = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(onContextCreate)
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(onContextFailure)
    if (onContextLost != null) __obj.updateDynamic("onContextLost")(onContextLost)
    if (onContextRestored != null) __obj.updateDynamic("onContextRestored")(onContextRestored)
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (webglContextAttributes != null) __obj.updateDynamic("webglContextAttributes")(webglContextAttributes)
    __obj.asInstanceOf[GLViewDOMProps]
  }
}

