package typings.expressDashRoutesDashVersioning

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-routes-versioning", JSImport.Namespace)
@js.native
object expressDashRoutesDashVersioningMod extends js.Object {
  def apply(): RoutesVersioningMiddleware = js.native
  type RoutesVersioningMiddleware = js.Function2[/* args */ VersionOptions, /* notFoundMiddleware */ js.UndefOr[Handler], Handler]
  type VersionOptions = StringDictionary[Handler]
}

