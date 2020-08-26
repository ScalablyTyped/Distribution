package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCoreQueryRequest extends js.Object {
  var limit: js.UndefOr[Double] = js.native
  var query: DBCoreQuery = js.native
  var trans: DBCoreTransaction = js.native
  var values: js.UndefOr[Boolean] = js.native
}

object DBCoreQueryRequest {
  @scala.inline
  def apply(query: DBCoreQuery, trans: DBCoreTransaction): DBCoreQueryRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreQueryRequest]
  }
  @scala.inline
  implicit class DBCoreQueryRequestOps[Self <: DBCoreQueryRequest] (val x: Self) extends AnyVal {
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
    def setQuery(value: DBCoreQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrans(value: DBCoreTransaction): Self = this.set("trans", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setValues(value: Boolean): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
  
}

