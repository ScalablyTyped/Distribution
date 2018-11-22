package typings
package glDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object glDashReactMod {
  type Vec2 = js.Tuple2[scala.Double, scala.Double]
  type Vec4 = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  type connectSize = js.Function1[/* GLComponent */ js.Any, js.Any]
  type createSurface = js.Function5[
    /* GLView */ js.Any, 
    /* RenderLessElement */ js.Any, 
    /* mapRenderableContent */ js.Any, 
    /* requestFrame */ js.Function1[/* callback */ js.Function1[/* time */ scala.Double, scala.Unit], scala.Double], 
    /* cancelFrame */ js.Function1[/* id */ scala.Double, scala.Unit], 
    Surface[js.Any]
  ]
  type listSurfaces = js.Function0[js.Array[Surface[js.Any]]]
}
