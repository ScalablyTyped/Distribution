package typings.expressDashPaginate.expressDashPaginateMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-paginate", "middleware")
@js.native
object middleware extends js.Object {
  def apply(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
  def apply(limit: Double): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
  def apply(limit: Double, maxLimit: Double): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
}

