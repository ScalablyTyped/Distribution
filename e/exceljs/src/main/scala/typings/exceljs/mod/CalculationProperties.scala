package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalculationProperties extends js.Object {
  /**
  	 * Whether the application shall perform a full recalculation when the workbook is opened
  	 */
  var fullCalcOnLoad: Boolean
}

object CalculationProperties {
  @scala.inline
  def apply(fullCalcOnLoad: Boolean): CalculationProperties = {
    val __obj = js.Dynamic.literal(fullCalcOnLoad = fullCalcOnLoad.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CalculationProperties]
  }
}

