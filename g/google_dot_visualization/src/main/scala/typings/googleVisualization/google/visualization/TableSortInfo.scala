package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableSortInfo extends StObject {
  
  var ascending: Boolean
  
  var column: Double
  
  var sortedIndexes: js.Array[Double]
}
object TableSortInfo {
  
  @scala.inline
  def apply(ascending: Boolean, column: Double, sortedIndexes: js.Array[Double]): TableSortInfo = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], sortedIndexes = sortedIndexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableSortInfo]
  }
  
  @scala.inline
  implicit class TableSortInfoMutableBuilder[Self <: TableSortInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAscending(value: Boolean): Self = StObject.set(x, "ascending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortedIndexes(value: js.Array[Double]): Self = StObject.set(x, "sortedIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortedIndexesVarargs(value: Double*): Self = StObject.set(x, "sortedIndexes", js.Array(value :_*))
  }
}
