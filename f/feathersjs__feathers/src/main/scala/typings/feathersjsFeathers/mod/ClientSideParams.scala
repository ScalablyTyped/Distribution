package typings.feathersjsFeathers.mod

import typings.feathersjsFeathers.PickPaginationOptionsmax
import typings.feathersjsFeathers.feathersjsFeathersBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@feathersjs/feathers.@feathersjs/feathers.Params, 'query' | 'paginate'> */
trait ClientSideParams extends js.Object {
  var paginate: js.UndefOr[`false` | PickPaginationOptionsmax] = js.undefined
  var query: js.UndefOr[Query] = js.undefined
}

object ClientSideParams {
  @scala.inline
  def apply(paginate: `false` | PickPaginationOptionsmax = null, query: Query = null): ClientSideParams = {
    val __obj = js.Dynamic.literal()
    if (paginate != null) __obj.updateDynamic("paginate")(paginate.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSideParams]
  }
}

