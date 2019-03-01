package typings
package glDashReactDashDomLib.glDashReactDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- glDashReactDashDomLib.glviewdomMod.GLViewDOMProps because var conflicts: style. Inlined onContextCreate, onContextFailure, onContextLost, onContextRestored, webglContextAttributes, pixelRatio, width, height, debug */ trait SurfaceProps
  extends glDashReactLib.glDashReactMod.SurfaceProps {
  var debug: js.UndefOr[scala.Double] = js.undefined
  var height: scala.Double
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit]] = js.undefined
  var onContextFailure: js.UndefOr[js.Function1[/* e */ stdLib.Error, scala.Unit]] = js.undefined
  var onContextLost: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onContextRestored: js.UndefOr[js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit]] = js.undefined
  var pixelRatio: js.UndefOr[scala.Double] = js.undefined
  var webglContextAttributes: js.UndefOr[stdLib.WebGLContextAttributes] = js.undefined
  var width: scala.Double
}

object SurfaceProps {
  @scala.inline
  def apply(
    height: scala.Double,
    width: scala.Double,
    children: js.Any = null,
    debug: scala.Int | scala.Double = null,
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    if (children != null) __obj.updateDynamic("children")(children)
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
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

