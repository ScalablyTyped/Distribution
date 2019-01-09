package typings
package glDashReactDashNativeLib.glDashReactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- glDashReactDashNativeLib.glviewnativeMod.GLViewNativeProps because var conflicts: children, style. Inlined onContextCreate, onContextFailure */ trait SurfaceProps
  extends glDashReactLib.glDashReactMod.SurfaceProps {
  var onContextCreate: js.UndefOr[js.Function1[/* gl */ reactLib.WebGLRenderingContext, scala.Unit]] = js.undefined
  var onContextFailure: js.UndefOr[js.Function1[/* e */ stdLib.Error, scala.Unit]] = js.undefined
}

