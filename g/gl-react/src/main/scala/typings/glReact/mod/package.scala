package typings.glReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def GLSL(strings: typings.std.TemplateStringsArray, values: js.Any*): java.lang.String = (typings.glReact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("GLSL")(strings.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  type ShadersSheet = org.scalablytyped.runtime.StringDictionary[typings.glReact.mod.ShaderIdentifier]
  
  type Vec2 = js.Tuple2[scala.Double, scala.Double]
  
  type Vec4 = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  
  type connectSize = js.Function1[/* GLComponent */ js.Any, js.Any]
  
  type createSurface = js.Function5[
    /* GLView */ js.Any, 
    /* RenderLessElement */ js.Any, 
    /* mapRenderableContent */ js.Any, 
    /* requestFrame */ js.Function1[/* callback */ js.Function1[/* time */ scala.Double, scala.Unit], scala.Double], 
    /* cancelFrame */ js.Function1[/* id */ scala.Double, scala.Unit], 
    typings.glReact.mod.Surface[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GLView */ js.Any
    ]
  ]
  
  type listSurfaces = js.Function0[js.Array[typings.glReact.mod.Surface[js.Any]]]
}
