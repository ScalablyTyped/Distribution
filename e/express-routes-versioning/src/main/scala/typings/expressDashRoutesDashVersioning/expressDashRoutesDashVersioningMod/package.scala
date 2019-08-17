package typings.expressDashRoutesDashVersioning

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressDashRoutesDashVersioningMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.express.expressMod.Handler

  type RoutesVersioningMiddleware = js.Function2[/* args */ VersionOptions, /* notFoundMiddleware */ js.UndefOr[Handler], Handler]
  type VersionOptions = StringDictionary[Handler]
}
