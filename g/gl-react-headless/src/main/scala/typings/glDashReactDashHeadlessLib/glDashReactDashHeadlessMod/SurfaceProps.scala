package typings
package glDashReactDashHeadlessLib.glDashReactDashHeadlessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceProps
  extends glDashReactLib.glDashReactMod.SurfaceProps
     with glDashReactDashHeadlessLib.gLViewHeadlessMod.GLViewHeadlessProps

object SurfaceProps {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    children: js.Any = null,
    onContextCreate: /* gl */ stdLib.WebGLRenderingContext => scala.Unit = null,
    onContextFailure: /* e */ stdLib.Error => scala.Unit = null,
    onContextLost: () => scala.Unit = null,
    onContextRestored: /* gl */ stdLib.WebGLRenderingContext => scala.Unit = null,
    onLoad: () => scala.Unit = null,
    onLoadError: /* e */ stdLib.Error => scala.Unit = null,
    pixelRatio: scala.Int | scala.Double = null,
    preload: js.Array[_] = null,
    style: js.Any = null,
    visitor: glDashReactLib.glDashReactMod.Visitor = null,
    webglContextAttributes: stdLib.WebGLContextAttributes = null
  ): SurfaceProps = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (children != null) __obj.updateDynamic("children")(children)
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1(onContextCreate))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1(onContextFailure))
    if (onContextLost != null) __obj.updateDynamic("onContextLost")(js.Any.fromFunction0(onContextLost))
    if (onContextRestored != null) __obj.updateDynamic("onContextRestored")(js.Any.fromFunction1(onContextRestored))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (style != null) __obj.updateDynamic("style")(style)
    if (visitor != null) __obj.updateDynamic("visitor")(visitor)
    if (webglContextAttributes != null) __obj.updateDynamic("webglContextAttributes")(webglContextAttributes)
    __obj.asInstanceOf[SurfaceProps]
  }
}

