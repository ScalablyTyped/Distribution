package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBCoreOpenCursorRequest extends js.Object {
  
  var query: DBCoreQuery = js.native
  
  var reverse: js.UndefOr[Boolean] = js.native
  
  var trans: DBCoreTransaction = js.native
  
  var unique: js.UndefOr[Boolean] = js.native
  
  var values: js.UndefOr[Boolean] = js.native
}
object DBCoreOpenCursorRequest {
  
  @scala.inline
  def apply(query: DBCoreQuery, trans: DBCoreTransaction): DBCoreOpenCursorRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreOpenCursorRequest]
  }
  
  @scala.inline
  implicit class DBCoreOpenCursorRequestOps[Self <: DBCoreOpenCursorRequest] (val x: Self) extends AnyVal {
    
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
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
    
    @scala.inline
    def setValues(value: Boolean): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
