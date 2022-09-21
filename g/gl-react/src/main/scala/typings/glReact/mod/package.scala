package typings.glReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.glReact.mod.^
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def GLSL(strings: TemplateStringsArray, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GLSL")(List(strings.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]

type ShadersSheet = StringDictionary[ShaderIdentifier]

type Vec2 = js.Tuple2[Double, Double]

type Vec4 = js.Tuple4[Double, Double, Double, Double]

type connectSize = js.Function1[/* GLComponent */ Any, Any]

type createSurface = js.Function5[
/* GLView */ Any, 
/* RenderLessElement */ Any, 
/* mapRenderableContent */ Any, 
/* requestFrame */ js.Function1[/* callback */ js.Function1[/* time */ Double, Unit], Double], 
/* cancelFrame */ js.Function1[/* id */ Double, Unit], 
Surface[
  /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof GLView */ Any
]]

type listSurfaces = js.Function0[js.Array[Surface[Any]]]
