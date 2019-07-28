package typings.expressDashPaginate.expressDashPaginateMod

import typings.express.expressMod.NextFunction
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-paginate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getArrayPages(req: Request): js.Function3[
    /* limit */ Double, 
    /* pageCount */ Double, 
    /* currentPage */ Double, 
    js.Array[PageElement]
  ] = js.native
  def hasNextPages(req: Request): js.Function1[/* pageCount */ Double, Boolean] = js.native
  def href(req: Request): js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String] = js.native
  def middleware(): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
  def middleware(limit: Double): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
  def middleware(limit: Double, maxLimit: Double): js.Function3[/* req */ Request, /* res */ Response, /* next */ NextFunction, Unit] = js.native
}

