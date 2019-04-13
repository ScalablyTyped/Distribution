package typings
package expressDashPaginateLib.expressDashPaginateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-paginate", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getArrayPages(req: expressLib.expressMod.Request): js.Function3[
    /* limit */ scala.Double, 
    /* pageCount */ scala.Double, 
    /* currentPage */ scala.Double, 
    js.Array[PageElement]
  ] = js.native
  def hasNextPages(req: expressLib.expressMod.Request): js.Function1[/* pageCount */ scala.Double, scala.Boolean] = js.native
  def href(req: expressLib.expressMod.Request): js.Function2[/* prev */ js.Object | scala.Boolean, /* params */ js.Object, java.lang.String] = js.native
  def middleware(): js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    scala.Unit
  ] = js.native
  def middleware(limit: scala.Double): js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    scala.Unit
  ] = js.native
  def middleware(limit: scala.Double, maxLimit: scala.Double): js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    /* next */ expressLib.expressMod.NextFunction, 
    scala.Unit
  ] = js.native
}

