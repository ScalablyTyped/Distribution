package typings.dexie.mod

import typings.dexie.dexieStrings.put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBCorePutRequest extends DBCoreMutateRequest {
  
  var keys: js.UndefOr[js.Array[_]] = js.native
  
  var trans: DBCoreTransaction = js.native
  
  var `type`: put = js.native
  
  var values: js.Array[_] = js.native
  
  var wantResults: js.UndefOr[Boolean] = js.native
}
object DBCorePutRequest {
  
  @scala.inline
  def apply(trans: DBCoreTransaction, `type`: put, values: js.Array[_]): DBCorePutRequest = {
    val __obj = js.Dynamic.literal(trans = trans.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCorePutRequest]
  }
  
  @scala.inline
  implicit class DBCorePutRequestOps[Self <: DBCorePutRequest] (val x: Self) extends AnyVal {
    
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
    def setTrans(value: DBCoreTransaction): Self = this.set("trans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: put): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: js.Any*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[_]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: js.Any*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[_]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setWantResults(value: Boolean): Self = this.set("wantResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWantResults: Self = this.set("wantResults", js.undefined)
  }
}
