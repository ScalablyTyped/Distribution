package typings.exceljs.mod

import typings.exceljs.exceljsStrings.`var`
import typings.exceljs.exceljsStrings.average
import typings.exceljs.exceljsStrings.count
import typings.exceljs.exceljsStrings.countNums
import typings.exceljs.exceljsStrings.custom
import typings.exceljs.exceljsStrings.max
import typings.exceljs.exceljsStrings.min
import typings.exceljs.exceljsStrings.none_
import typings.exceljs.exceljsStrings.stdDev
import typings.exceljs.exceljsStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<exceljs.exceljs.TableColumnProperties> */
@js.native
trait TableColumn extends js.Object {
  var filterButton: Boolean = js.native
  var name: String = js.native
  var totalsRowFormula: String = js.native
  var totalsRowFunction: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom = js.native
  var totalsRowLabel: String = js.native
}

object TableColumn {
  @scala.inline
  def apply(
    filterButton: Boolean,
    name: String,
    totalsRowFormula: String,
    totalsRowFunction: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom,
    totalsRowLabel: String
  ): TableColumn = {
    val __obj = js.Dynamic.literal(filterButton = filterButton.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], totalsRowFormula = totalsRowFormula.asInstanceOf[js.Any], totalsRowFunction = totalsRowFunction.asInstanceOf[js.Any], totalsRowLabel = totalsRowLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumn]
  }
  @scala.inline
  implicit class TableColumnOps[Self <: TableColumn] (val x: Self) extends AnyVal {
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
    def setFilterButton(value: Boolean): Self = this.set("filterButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalsRowFormula(value: String): Self = this.set("totalsRowFormula", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalsRowFunction(value: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom): Self = this.set("totalsRowFunction", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalsRowLabel(value: String): Self = this.set("totalsRowLabel", value.asInstanceOf[js.Any])
  }
  
}

