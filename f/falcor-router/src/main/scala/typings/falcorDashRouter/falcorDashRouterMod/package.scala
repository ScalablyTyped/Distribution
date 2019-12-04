package typings.falcorDashRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object falcorDashRouterMod {
  import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.InvalidPath
  import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.JSONEnvelope
  import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.JSONGraphEnvelope
  import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.PathSet
  import typings.falcorDashJsonDashGraph.falcorDashJsonDashGraphMod.PathValue

  type CallRouteResult = PathValue | InvalidPath | (js.Array[PathValue | InvalidPath]) | JSONGraphEnvelope
  type RoutePathSet = PathSet
  type RouteResult = PathValue | js.Array[PathValue] | JSONEnvelope[js.Any]
}
