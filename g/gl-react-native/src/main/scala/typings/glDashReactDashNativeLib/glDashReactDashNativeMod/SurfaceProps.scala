package typings
package glDashReactDashNativeLib.glDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- glDashReactDashNativeLib.gLViewNativeMod.GLViewNativeProps because var conflicts: children, style. Inlined onContextCreate, onContextFailure */ trait SurfaceProps
  extends glDashReactLib.glDashReactMod.SurfaceProps {
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ stdLib.WebGLRenderingContext, scala.Unit]] = js.undefined
  var onContextFailure: js.UndefOr[js.Function1[/* e */ stdLib.Error, scala.Unit]] = js.undefined
}

object SurfaceProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    onContextCreate: /* gl */ stdLib.WebGLRenderingContext => scala.Unit = null,
    onContextFailure: /* e */ stdLib.Error => scala.Unit = null,
    onLoad: () => scala.Unit = null,
    onLoadError: /* e */ stdLib.Error => scala.Unit = null,
    preload: js.Array[_] = null,
    style: js.Any = null,
    visitor: glDashReactLib.glDashReactMod.Visitor = null
  ): SurfaceProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1(onContextCreate))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1(onContextFailure))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction0(onLoad))
    if (onLoadError != null) __obj.updateDynamic("onLoadError")(js.Any.fromFunction1(onLoadError))
    if (preload != null) __obj.updateDynamic("preload")(preload)
    if (style != null) __obj.updateDynamic("style")(style)
    if (visitor != null) __obj.updateDynamic("visitor")(visitor)
    __obj.asInstanceOf[SurfaceProps]
  }
}

