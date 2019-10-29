package typings.exceljs.exceljsMod

import typings.exceljs.exceljsStrings.`var`
import typings.exceljs.exceljsStrings.average
import typings.exceljs.exceljsStrings.count
import typings.exceljs.exceljsStrings.countNums
import typings.exceljs.exceljsStrings.custom
import typings.exceljs.exceljsStrings.max
import typings.exceljs.exceljsStrings.min
import typings.exceljs.exceljsStrings.none
import typings.exceljs.exceljsStrings.stdDev
import typings.exceljs.exceljsStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumnProperties extends js.Object {
  /**
  	  * Switches the filter control in the header
  	  * @default false
  	  */
  var filterButton: js.UndefOr[Boolean] = js.undefined
  /**
  	  * The name of the column, also used in the header
  	  */
  var name: String
  /**
  	  * Optional formula for custom functions
  	  */
  var totalsRowFormula: js.UndefOr[String] = js.undefined
  /**
  	  * Name of the totals function
  	  * @default 'none'
  	  */
  var totalsRowFunction: js.UndefOr[none | average | countNums | count | max | min | stdDev | `var` | sum | custom] = js.undefined
  /**
  	  * Label to describe the totals row (first column)
  	  * @default 'Total'
  	  */
  var totalsRowLabel: js.UndefOr[String] = js.undefined
}

object TableColumnProperties {
  @scala.inline
  def apply(
    name: String,
    filterButton: js.UndefOr[Boolean] = js.undefined,
    totalsRowFormula: String = null,
    totalsRowFunction: none | average | countNums | count | max | min | stdDev | `var` | sum | custom = null,
    totalsRowLabel: String = null
  ): TableColumnProperties = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(filterButton)) __obj.updateDynamic("filterButton")(filterButton)
    if (totalsRowFormula != null) __obj.updateDynamic("totalsRowFormula")(totalsRowFormula)
    if (totalsRowFunction != null) __obj.updateDynamic("totalsRowFunction")(totalsRowFunction.asInstanceOf[js.Any])
    if (totalsRowLabel != null) __obj.updateDynamic("totalsRowLabel")(totalsRowLabel)
    __obj.asInstanceOf[TableColumnProperties]
  }
}

