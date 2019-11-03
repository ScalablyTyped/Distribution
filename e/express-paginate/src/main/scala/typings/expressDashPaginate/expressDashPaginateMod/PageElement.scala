package typings.expressDashPaginate.expressDashPaginateMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageElement extends js.Object {
  var number: Double = js.native
  @JSName("url")
  var url_Original: js.Function1[
    /* req */ Request[ParamsDictionary], 
    js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String]
  ] = js.native
  def url(req: Request[ParamsDictionary]): js.Function2[/* prev */ js.Object | Boolean, /* params */ js.Object, String] = js.native
}

