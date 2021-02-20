package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalculationProperties extends StObject {
  
  /**
  	 * Whether the application shall perform a full recalculation when the workbook is opened
  	 */
  var fullCalcOnLoad: Boolean = js.native
}
object CalculationProperties {
  
  @scala.inline
  def apply(fullCalcOnLoad: Boolean): CalculationProperties = {
    val __obj = js.Dynamic.literal(fullCalcOnLoad = fullCalcOnLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculationProperties]
  }
  
  @scala.inline
  implicit class CalculationPropertiesMutableBuilder[Self <: CalculationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullCalcOnLoad(value: Boolean): Self = StObject.set(x, "fullCalcOnLoad", value.asInstanceOf[js.Any])
  }
}
