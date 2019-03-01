package typings
package falcorDashRouterLib.falcorDashRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FalcorRouterNs {
  type CallRouteResult = falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.PathValue | falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.InvalidPath | (js.Array[
    falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.PathValue | falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.InvalidPath
  ]) | falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.JSONGraphEnvelope
  type CreatedRouter = falcorDashRouterLib.falcorDashRouterMod.FalcorRouter
  type RoutePathSet = falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.PathSet
  type RouteResult = falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.PathValue | (js.Array[
    falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.PathValue
  ]) | falcorDashJsonDashGraphLib.falcorDashJsonDashGraphMod.FalcorJsonGraphNs.JSONEnvelope[js.Any]
}
