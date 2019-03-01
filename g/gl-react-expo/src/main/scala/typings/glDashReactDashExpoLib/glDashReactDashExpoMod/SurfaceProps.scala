package typings
package glDashReactDashExpoLib.glDashReactDashExpoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- glDashReactDashExpoLib.glviewnativeMod.GLViewNativeProps because var conflicts: children, style. Inlined onContextCreate */ trait SurfaceProps
  extends glDashReactLib.glDashReactMod.SurfaceProps {
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit]] = js.undefined
}

object SurfaceProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    onContextCreate: js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit] = null,
    onLoad: js.Function0[scala.Unit] = null,
    onLoadError: js.Function1[/* e */ stdLib.Error, scala.Unit] = null,
    preload: js.Array[_] = null,
    style: js.Any = null,
    visitor: glDashReactLib.glDashReactMod.Visitor = null
  ): SurfaceProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(onContextCreate)
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad)
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(onLoadError)
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (style != null) __obj.updateDynamic("style")(style)
    if (visitor != null) __obj.updateDynamic("visitor")(visitor)
    __obj.asInstanceOf[SurfaceProps]
  }
}

