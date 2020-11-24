package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBCoreQuery extends js.Object {
  
  var index: DBCoreIndex = js.native
  
  //keyPath: null | string | string[]; // null represents primary key. string a property, string[] several properties.
  var range: DBCoreKeyRange = js.native
}
object DBCoreQuery {
  
  @scala.inline
  def apply(index: DBCoreIndex, range: DBCoreKeyRange): DBCoreQuery = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreQuery]
  }
  
  @scala.inline
  implicit class DBCoreQueryOps[Self <: DBCoreQuery] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: DBCoreIndex): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRange(value: DBCoreKeyRange): Self = this.set("range", value.asInstanceOf[js.Any])
  }
}
