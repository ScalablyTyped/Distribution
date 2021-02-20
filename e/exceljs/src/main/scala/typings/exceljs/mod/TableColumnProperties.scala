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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableColumnProperties extends StObject {
  
  /**
  	  * Switches the filter control in the header
  	  * @default false
  	  */
  var filterButton: js.UndefOr[Boolean] = js.native
  
  /**
  	  * The name of the column, also used in the header
  	  */
  var name: String = js.native
  
  /**
  	  * Optional formula for custom functions
  	  */
  var totalsRowFormula: js.UndefOr[String] = js.native
  
  /**
  	  * Name of the totals function
  	  * @default 'none'
  	  */
  var totalsRowFunction: js.UndefOr[none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom] = js.native
  
  /**
  	  * Label to describe the totals row (first column)
  	  * @default 'Total'
  	  */
  var totalsRowLabel: js.UndefOr[String] = js.native
}
object TableColumnProperties {
  
  @scala.inline
  def apply(name: String): TableColumnProperties = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumnProperties]
  }
  
  @scala.inline
  implicit class TableColumnPropertiesMutableBuilder[Self <: TableColumnProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterButton(value: Boolean): Self = StObject.set(x, "filterButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterButtonUndefined: Self = StObject.set(x, "filterButton", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalsRowFormula(value: String): Self = StObject.set(x, "totalsRowFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalsRowFormulaUndefined: Self = StObject.set(x, "totalsRowFormula", js.undefined)
    
    @scala.inline
    def setTotalsRowFunction(value: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom): Self = StObject.set(x, "totalsRowFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalsRowFunctionUndefined: Self = StObject.set(x, "totalsRowFunction", js.undefined)
    
    @scala.inline
    def setTotalsRowLabel(value: String): Self = StObject.set(x, "totalsRowLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalsRowLabelUndefined: Self = StObject.set(x, "totalsRowLabel", js.undefined)
  }
}
