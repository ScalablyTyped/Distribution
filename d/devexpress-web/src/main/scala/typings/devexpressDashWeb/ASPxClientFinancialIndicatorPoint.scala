package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the FinancialIndicatorPoint class.
  */
@JSGlobal("ASPxClientFinancialIndicatorPoint")
@js.native
class ASPxClientFinancialIndicatorPoint () extends ASPxClientWebChartElement {
  /**
    * Gets the argument of the financial indicator's point.
    */
  var argument: js.Any = js.native
  /**
    * Gets the financial indicator that owns the current financial indicator point.
    */
  var financialIndicator: ASPxClientFinancialIndicator = js.native
  /**
    * Gets a value, indicating how the value of a financial indicator's point is obtained.
    */
  var valueLevel: String = js.native
}

