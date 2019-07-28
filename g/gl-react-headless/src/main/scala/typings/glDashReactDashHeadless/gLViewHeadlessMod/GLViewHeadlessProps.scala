package typings.glDashReactDashHeadless.gLViewHeadlessMod

import typings.std.Error
import typings.std.WebGLContextAttributes
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLViewHeadlessProps extends js.Object {
  var height: Double
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
  var onContextFailure: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
  var onContextLost: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onContextRestored: js.UndefOr[js.Function1[/* gl */ WebGLRenderingContext, Unit]] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var webglContextAttributes: js.UndefOr[WebGLContextAttributes] = js.undefined
  var width: Double
}

object GLViewHeadlessProps {
  @scala.inline
  def apply(
    height: Double,
    width: Double,
    onContextCreate: /* gl */ WebGLRenderingContext => Unit = null,
    onContextFailure: /* e */ Error => Unit = null,
    onContextLost: () => Unit = null,
    onContextRestored: /* gl */ WebGLRenderingContext => Unit = null,
    pixelRatio: Int | Double = null,
    webglContextAttributes: WebGLContextAttributes = null
  ): GLViewHeadlessProps = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1(onContextCreate))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1(onContextFailure))
    if (onContextLost != null) __obj.updateDynamic("onContextLost")(js.Any.fromFunction0(onContextLost))
    if (onContextRestored != null) __obj.updateDynamic("onContextRestored")(js.Any.fromFunction1(onContextRestored))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (webglContextAttributes != null) __obj.updateDynamic("webglContextAttributes")(webglContextAttributes)
    __obj.asInstanceOf[GLViewHeadlessProps]
  }
}

