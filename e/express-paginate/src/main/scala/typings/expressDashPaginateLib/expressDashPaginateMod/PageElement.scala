package typings
package expressDashPaginateLib.expressDashPaginateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageElement extends js.Object {
  var number: scala.Double = js.native
  @JSName("url")
  var url_Original: js.Function1[
    /* req */ expressLib.expressMod.eNs.Request, 
    js.Function2[/* prev */ js.Object | scala.Boolean, /* params */ js.Object, java.lang.String]
  ] = js.native
  def url(req: expressLib.expressMod.eNs.Request): js.Function2[/* prev */ js.Object | scala.Boolean, /* params */ js.Object, java.lang.String] = js.native
}

