package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalculationProperties extends StObject {
  
  /**
  	 * Whether the application shall perform a full recalculation when the workbook is opened
  	 */
  var fullCalcOnLoad: Boolean
}
object CalculationProperties {
  
  inline def apply(fullCalcOnLoad: Boolean): CalculationProperties = {
    val __obj = js.Dynamic.literal(fullCalcOnLoad = fullCalcOnLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalculationProperties]
  }
  
  extension [Self <: CalculationProperties](x: Self) {
    
    inline def setFullCalcOnLoad(value: Boolean): Self = StObject.set(x, "fullCalcOnLoad", value.asInstanceOf[js.Any])
  }
}
