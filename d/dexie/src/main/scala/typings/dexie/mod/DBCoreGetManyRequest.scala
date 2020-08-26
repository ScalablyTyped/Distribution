package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCoreGetManyRequest extends js.Object {
  var keys: js.Array[_] = js.native
  var trans: DBCoreTransaction = js.native
}

object DBCoreGetManyRequest {
  @scala.inline
  def apply(keys: js.Array[_], trans: DBCoreTransaction): DBCoreGetManyRequest = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreGetManyRequest]
  }
  @scala.inline
  implicit class DBCoreGetManyRequestOps[Self <: DBCoreGetManyRequest] (val x: Self) extends AnyVal {
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
    def setKeysVarargs(value: js.Any*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[_]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrans(value: DBCoreTransaction): Self = this.set("trans", value.asInstanceOf[js.Any])
  }
  
}

