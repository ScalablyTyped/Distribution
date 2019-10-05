package typings.expressDashPaginate.expressDashPaginateMod

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-paginate", "getArrayPages")
@js.native
object getArrayPages extends js.Object {
  def apply(req: Request): js.Function3[
    /* limit */ Double, 
    /* pageCount */ Double, 
    /* currentPage */ Double, 
    js.Array[PageElement]
  ] = js.native
}

