package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowBreak extends StObject {
  
  var id: Double
  
  var man: Double
  
  var max: Double
  
  var min: Double
}
object RowBreak {
  
  @scala.inline
  def apply(id: Double, man: Double, max: Double, min: Double): RowBreak = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], man = man.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowBreak]
  }
  
  @scala.inline
  implicit class RowBreakMutableBuilder[Self <: RowBreak] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMan(value: Double): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
