package typings.glDashReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object glDashReactMod {
  import org.scalablytyped.runtime.StringDictionary

  type ShadersSheet = StringDictionary[ShaderIdentifier]
  type Vec2 = js.Tuple2[Double, Double]
  type Vec4 = js.Tuple4[Double, Double, Double, Double]
  type connectSize = js.Function1[/* GLComponent */ js.Any, js.Any]
  type createSurface = js.Function5[
    /* GLView */ js.Any, 
    /* RenderLessElement */ js.Any, 
    /* mapRenderableContent */ js.Any, 
    /* requestFrame */ js.Function1[/* callback */ js.Function1[/* time */ Double, Unit], Double], 
    /* cancelFrame */ js.Function1[/* id */ Double, Unit], 
    Surface[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GLView */ js.Any
    ]
  ]
  type listSurfaces = js.Function0[js.Array[Surface[js.Any]]]
}
