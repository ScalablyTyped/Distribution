package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnPath extends js.Object {
  
  var columnPath: js.UndefOr[js.Array[String | Double | typings.std.Date]] = js.native
  
  var customColumns: js.UndefOr[js.Array[String]] = js.native
  
  var dataIndex: js.UndefOr[Double] = js.native
  
  var maxRowCount: js.UndefOr[Double] = js.native
  
  var rowPath: js.UndefOr[js.Array[String | Double | typings.std.Date]] = js.native
}
object ColumnPath {
  
  @scala.inline
  def apply(): ColumnPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnPath]
  }
  
  @scala.inline
  implicit class ColumnPathOps[Self <: ColumnPath] (val x: Self) extends AnyVal {
    
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
    def setColumnPathVarargs(value: (String | Double | typings.std.Date)*): Self = this.set("columnPath", js.Array(value :_*))
    
    @scala.inline
    def setColumnPath(value: js.Array[String | Double | typings.std.Date]): Self = this.set("columnPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnPath: Self = this.set("columnPath", js.undefined)
    
    @scala.inline
    def setCustomColumnsVarargs(value: String*): Self = this.set("customColumns", js.Array(value :_*))
    
    @scala.inline
    def setCustomColumns(value: js.Array[String]): Self = this.set("customColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomColumns: Self = this.set("customColumns", js.undefined)
    
    @scala.inline
    def setDataIndex(value: Double): Self = this.set("dataIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataIndex: Self = this.set("dataIndex", js.undefined)
    
    @scala.inline
    def setMaxRowCount(value: Double): Self = this.set("maxRowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRowCount: Self = this.set("maxRowCount", js.undefined)
    
    @scala.inline
    def setRowPathVarargs(value: (String | Double | typings.std.Date)*): Self = this.set("rowPath", js.Array(value :_*))
    
    @scala.inline
    def setRowPath(value: js.Array[String | Double | typings.std.Date]): Self = this.set("rowPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowPath: Self = this.set("rowPath", js.undefined)
  }
}
