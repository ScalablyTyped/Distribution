package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableSortInfo extends js.Object {
  
  var ascending: Boolean = js.native
  
  var column: Double = js.native
  
  var sortedIndexes: js.Array[Double] = js.native
}
object TableSortInfo {
  
  @scala.inline
  def apply(ascending: Boolean, column: Double, sortedIndexes: js.Array[Double]): TableSortInfo = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], sortedIndexes = sortedIndexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortInfo]
  }
  
  @scala.inline
  implicit class TableSortInfoOps[Self <: TableSortInfo] (val x: Self) extends AnyVal {
    
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
    def setAscending(value: Boolean): Self = this.set("ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortedIndexesVarargs(value: Double*): Self = this.set("sortedIndexes", js.Array(value :_*))
    
    @scala.inline
    def setSortedIndexes(value: js.Array[Double]): Self = this.set("sortedIndexes", value.asInstanceOf[js.Any])
  }
}
