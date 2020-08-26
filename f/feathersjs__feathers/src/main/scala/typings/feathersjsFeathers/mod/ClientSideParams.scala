package typings.feathersjsFeathers.mod

import typings.feathersjsFeathers.anon.PickPaginationOptionsmax
import typings.feathersjsFeathers.feathersjsFeathersBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@feathersjs/feathers.@feathersjs/feathers.Params, 'query' | 'paginate'> */
@js.native
trait ClientSideParams extends js.Object {
  var paginate: js.UndefOr[`false` | PickPaginationOptionsmax] = js.native
  var query: js.UndefOr[Query] = js.native
}

object ClientSideParams {
  @scala.inline
  def apply(): ClientSideParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSideParams]
  }
  @scala.inline
  implicit class ClientSideParamsOps[Self <: ClientSideParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPaginate(value: `false` | PickPaginationOptionsmax): Self = this.set("paginate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaginate: Self = this.set("paginate", js.undefined)
    @scala.inline
    def setQuery(value: Query): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
  }
  
}

