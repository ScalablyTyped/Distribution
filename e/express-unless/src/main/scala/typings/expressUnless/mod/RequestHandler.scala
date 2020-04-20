package typings.expressUnless.mod

import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHandler
  extends typings.expressServeStaticCore.mod.RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
  var unless: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof unless */ js.Any
  ] = js.native
}

