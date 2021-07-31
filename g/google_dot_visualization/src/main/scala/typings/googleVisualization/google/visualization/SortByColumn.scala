package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortByColumn extends StObject {
  
  var column: Double
  
  var desc: Boolean
}
object SortByColumn {
  
  @scala.inline
  def apply(column: Double, desc: Boolean): SortByColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortByColumn]
  }
  
  @scala.inline
  implicit class SortByColumnMutableBuilder[Self <: SortByColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: Boolean): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
  }
}
