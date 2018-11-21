package typings
package expressDashRoutesDashVersioningLib.expressDashRoutesDashVersioningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object routesVersioningNs {
  type RoutesVersioningMiddleware = js.Function2[
    /* args */ VersionOptions, 
    /* notFoundMiddleware */ js.UndefOr[expressLib.expressMod.eNs.Handler], 
    expressLib.expressMod.eNs.Handler
  ]
}
