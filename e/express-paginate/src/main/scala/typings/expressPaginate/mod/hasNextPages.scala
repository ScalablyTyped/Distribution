package typings.expressPaginate.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-paginate", "hasNextPages")
@js.native
object hasNextPages extends js.Object {
  def apply(req: Request_[ParamsDictionary]): js.Function1[/* pageCount */ Double, Boolean] = js.native
}

