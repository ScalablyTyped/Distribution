package typings
package glDashReactDashDomLib.gLViewDOMMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GLViewDOMProps extends js.Object {
  var debug: js.UndefOr[scala.Double] = js.undefined
  var height: scala.Double
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit]] = js.undefined
  var onContextFailure: js.UndefOr[js.Function1[/* e */ stdLib.Error, scala.Unit]] = js.undefined
  var onContextLost: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onContextRestored: js.UndefOr[js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit]] = js.undefined
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
    onContextCreate: /* gl */ stdLib.WebGLRenderingContext => scala.Unit = null,
    onContextFailure: /* e */ stdLib.Error => scala.Unit = null,
    onContextLost: () => scala.Unit = null,
    onContextRestored: /* gl */ stdLib.WebGLRenderingContext => scala.Unit = null,
    pixelRatio: scala.Int | scala.Double = null,
    style: js.Any = null,
    webglContextAttributes: stdLib.WebGLContextAttributes = null
  ): GLViewDOMProps = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1(onContextCreate))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1(onContextFailure))
    if (onContextLost != null) __obj.updateDynamic("onContextLost")(js.Any.fromFunction0(onContextLost))
    if (onContextRestored != null) __obj.updateDynamic("onContextRestored")(js.Any.fromFunction1(onContextRestored))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (webglContextAttributes != null) __obj.updateDynamic("webglContextAttributes")(webglContextAttributes)
    __obj.asInstanceOf[GLViewDOMProps]
  }
}

