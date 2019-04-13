package typings
package expressDashRoutesDashVersioningLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashRoutesDashVersioningMod {
  type RoutesVersioningMiddleware = js.Function2[
    /* args */ VersionOptions, 
    /* notFoundMiddleware */ js.UndefOr[expressLib.expressMod.Handler], 
    expressLib.expressMod.Handler
  ]
  type VersionOptions = org.scalablytyped.runtime.StringDictionary[expressLib.expressMod.Handler]
}
