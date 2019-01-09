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

