package typings.expressDashPaginate.expressDashPaginateMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-paginate", "hasNextPages")
@js.native
object hasNextPages extends js.Object {
  def apply(req: Request[ParamsDictionary]): js.Function1[/* pageCount */ Double, Boolean] = js.native
}

