package typings.falcorRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallRouteResult = typings.falcorJsonGraph.mod.PathValue_ | typings.falcorJsonGraph.mod.InvalidPath | (js.Array[typings.falcorJsonGraph.mod.PathValue_ | typings.falcorJsonGraph.mod.InvalidPath]) | typings.falcorJsonGraph.mod.JSONGraphEnvelope
  
  type RoutePathSet = typings.falcorJsonGraph.mod.PathSet
  
  type RouteResult = typings.falcorJsonGraph.mod.PathValue_ | js.Array[typings.falcorJsonGraph.mod.PathValue_] | typings.falcorJsonGraph.mod.JSONEnvelope[js.Any]
}
