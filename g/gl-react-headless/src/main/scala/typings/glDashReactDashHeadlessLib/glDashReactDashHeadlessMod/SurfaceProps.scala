package typings
package glDashReactDashHeadlessLib.glDashReactDashHeadlessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceProps
  extends glDashReactLib.glDashReactMod.SurfaceProps
     with glDashReactDashHeadlessLib.glviewheadlessMod.GLViewHeadlessProps

object SurfaceProps {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    children: js.Any = null,
    onContextCreate: js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit] = null,
    onContextFailure: js.Function1[/* e */ stdLib.Error, scala.Unit] = null,
    onContextLost: js.Function0[scala.Unit] = null,
    onContextRestored: js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit] = null,
    onLoad: js.Function0[scala.Unit] = null,
    onLoadError: js.Function1[/* e */ stdLib.Error, scala.Unit] = null,
    pixelRatio: scala.Int | scala.Double = null,
    preload: js.Array[_] = null,
    style: js.Any = null,
    visitor: glDashReactLib.glDashReactMod.Visitor = null,
    webglContextAttributes: stdLib.WebGLContextAttributes = null
  ): SurfaceProps = {
    val __obj = js.Dynamic.literal(height = height, width = width)
    if (children != null) __obj.updateDynamic("children")(children)
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(onContextCreate)
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(onContextFailure)
    if (onContextLost != null) __obj.updateDynamic("onContextLost")(onContextLost)
    if (onContextRestored != null) __obj.updateDynamic("onContextRestored")(onContextRestored)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(onLoadError)
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (style != null) __obj.updateDynamic("style")(style)
    if (visitor != null) __obj.updateDynamic("visitor")(visitor)
    if (webglContextAttributes != null) __obj.updateDynamic("webglContextAttributes")(webglContextAttributes)
    __obj.asInstanceOf[SurfaceProps]
  }
}

