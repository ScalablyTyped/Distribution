package typings
package falcorDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object falcorDashRouterMod {
  type CallRouteResult = falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.PathValue | falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.InvalidPath | (js.Array[
    falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.PathValue | falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.InvalidPath
  ]) | falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.JSONGraphEnvelope
  type RoutePathSet = falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.PathSet
  type RouteResult = falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.PathValue | js.Array[falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.PathValue] | falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.JSONEnvelope[js.Any]
}
