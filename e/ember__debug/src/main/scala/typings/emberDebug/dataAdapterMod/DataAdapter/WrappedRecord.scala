package typings.emberDebug.dataAdapterMod.DataAdapter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrappedRecord extends js.Object {
  
  var columnValues: js.Object = js.native
  
  var `object`: js.Object = js.native
}
object WrappedRecord {
  
  @scala.inline
  def apply(columnValues: js.Object, `object`: js.Object): WrappedRecord = {
    val __obj = js.Dynamic.literal(columnValues = columnValues.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrappedRecord]
  }
  
  @scala.inline
  implicit class WrappedRecordOps[Self <: WrappedRecord] (val x: Self) extends AnyVal {
    
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
    def setColumnValues(value: js.Object): Self = this.set("columnValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: js.Object): Self = this.set("object", value.asInstanceOf[js.Any])
  }
}
