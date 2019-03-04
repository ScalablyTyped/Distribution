package typings
package glDashReactDashHeadlessLib.glviewheadlessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLViewHeadlessProps extends js.Object {
  var height: scala.Double
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit]] = js.undefined
  var onContextFailure: js.UndefOr[js.Function1[/* e */ stdLib.Error, scala.Unit]] = js.undefined
  var onContextLost: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onContextRestored: js.UndefOr[js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit]] = js.undefined
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var webglContextAttributes: js.UndefOr[stdLib.WebGLContextAttributes] = js.undefined
  var width: scala.Double
}

object GLViewHeadlessProps {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    onContextCreate: js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit] = null,
    onContextFailure: js.Function1[/* e */ stdLib.Error, scala.Unit] = null,
    onContextLost: js.Function0[scala.Unit] = null,
    onContextRestored: js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit] = null,
    pixelRatio: scala.Int | scala.Double = null,
    webglContextAttributes: stdLib.WebGLContextAttributes = null
  ): GLViewHeadlessProps = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(onContextCreate)
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(onContextFailure)
    if (onContextLost != null) __obj.updateDynamic("onContextLost")(onContextLost)
    if (onContextRestored != null) __obj.updateDynamic("onContextRestored")(onContextRestored)
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (webglContextAttributes != null) __obj.updateDynamic("webglContextAttributes")(webglContextAttributes)
    __obj.asInstanceOf[GLViewHeadlessProps]
  }
}

