package typings.googleVisualization.google.visualization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataObjectRow extends StObject {
  
  var c: js.Array[DataObjectCell] = js.native
  
  var p: js.UndefOr[js.Any] = js.native
}
object DataObjectRow {
  
  @scala.inline
  def apply(c: js.Array[DataObjectCell]): DataObjectRow = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObjectRow]
  }
  
  @scala.inline
  implicit class DataObjectRowMutableBuilder[Self <: DataObjectRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: js.Array[DataObjectCell]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCVarargs(value: DataObjectCell*): Self = StObject.set(x, "c", js.Array(value :_*))
    
    @scala.inline
    def setP(value: js.Any): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUndefined: Self = StObject.set(x, "p", js.undefined)
  }
}
