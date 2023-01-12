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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<exceljs.exceljs.TableColumnProperties> */
trait TableColumn extends StObject {
  
  var filterButton: Boolean
  
  var name: String
  
  var totalsRowFormula: String
  
  var totalsRowFunction: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom
  
  var totalsRowLabel: String
}
object TableColumn {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: TableColumn] (val x: Self) extends AnyVal {
    
    inline def setFilterButton(value: Boolean): Self = StObject.set(x, "filterButton", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTotalsRowFormula(value: String): Self = StObject.set(x, "totalsRowFormula", value.asInstanceOf[js.Any])
    
    inline def setTotalsRowFunction(value: none_ | average | countNums | count | max | min | stdDev | `var` | sum | custom): Self = StObject.set(x, "totalsRowFunction", value.asInstanceOf[js.Any])
    
    inline def setTotalsRowLabel(value: String): Self = StObject.set(x, "totalsRowLabel", value.asInstanceOf[js.Any])
  }
}
