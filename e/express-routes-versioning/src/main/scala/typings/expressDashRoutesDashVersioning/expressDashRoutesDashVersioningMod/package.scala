package typings.expressDashRoutesDashVersioning

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashRoutesDashVersioningMod {
  type RoutesVersioningMiddleware = js.Function2[/* args */ VersionOptions, /* notFoundMiddleware */ js.UndefOr[Handler], Handler]
  type VersionOptions = StringDictionary[Handler]
}
