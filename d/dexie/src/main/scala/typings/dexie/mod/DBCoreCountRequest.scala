package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCoreCountRequest extends js.Object {
  var query: DBCoreQuery = js.native
  var trans: DBCoreTransaction = js.native
}

object DBCoreCountRequest {
  @scala.inline
  def apply(query: DBCoreQuery, trans: DBCoreTransaction): DBCoreCountRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreCountRequest]
  }
  @scala.inline
  implicit class DBCoreCountRequestOps[Self <: DBCoreCountRequest] (val x: Self) extends AnyVal {
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
  }
  
}

