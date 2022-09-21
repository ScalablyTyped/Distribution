package typings.exceljs.anon

import typings.exceljs.mod.Cell
import typings.exceljs.mod.CellValue
import typings.exceljs.mod.Fill
import typings.exceljs.mod.Worksheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Column> */
trait PartialColumn extends StObject {
  
  var alignment: js.UndefOr[PartialAlignment] = js.undefined
  
  var border: js.UndefOr[PartialBordersBottom] = js.undefined
  
  var collapsed: js.UndefOr[Boolean] = js.undefined
  
  var defn: js.UndefOr[Any] = js.undefined
  
  var eachCell: js.UndefOr[
    js.Function1[/* callback */ js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit], Unit]
  ] = js.undefined
  
  var equivalentTo: js.UndefOr[js.Function1[/* other */ typings.exceljs.mod.Column, Boolean]] = js.undefined
  
  var fill: js.UndefOr[Fill] = js.undefined
  
  var font: js.UndefOr[PartialFont] = js.undefined
  
  var header: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var headerCount: js.UndefOr[Double] = js.undefined
  
  var headers: js.UndefOr[js.Array[String]] = js.undefined
  
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  var isCustomWidth: js.UndefOr[Boolean] = js.undefined
  
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var letter: js.UndefOr[String] = js.undefined
  
  var numFmt: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[Double] = js.undefined
  
  var outlineLevel: js.UndefOr[Double] = js.undefined
  
  var protection: js.UndefOr[PartialProtection] = js.undefined
  
  var style: js.UndefOr[PartialStyleAlignment] = js.undefined
  
  @JSName("toString")
  var toString_FPartialColumn: js.UndefOr[js.Function0[String]] = js.undefined
  
  var values: js.UndefOr[js.Array[CellValue]] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
  
  var worksheet: js.UndefOr[Worksheet] = js.undefined
}
object PartialColumn {
  
  inline def apply(): PartialColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialColumn]
  }
  
  extension [Self <: PartialColumn](x: Self) {
    
    inline def setAlignment(value: PartialAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    inline def setBorder(value: PartialBordersBottom): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
    
    inline def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
    
    inline def setDefn(value: Any): Self = StObject.set(x, "defn", value.asInstanceOf[js.Any])
    
    inline def setDefnUndefined: Self = StObject.set(x, "defn", js.undefined)
    
    inline def setEachCell(value: /* callback */ js.Function2[/* cell */ Cell, /* rowNumber */ Double, Unit] => Unit): Self = StObject.set(x, "eachCell", js.Any.fromFunction1(value))
    
    inline def setEachCellUndefined: Self = StObject.set(x, "eachCell", js.undefined)
    
    inline def setEquivalentTo(value: /* other */ typings.exceljs.mod.Column => Boolean): Self = StObject.set(x, "equivalentTo", js.Any.fromFunction1(value))
    
    inline def setEquivalentToUndefined: Self = StObject.set(x, "equivalentTo", js.undefined)
    
    inline def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHeader(value: String | js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderCount(value: Double): Self = StObject.set(x, "headerCount", value.asInstanceOf[js.Any])
    
    inline def setHeaderCountUndefined: Self = StObject.set(x, "headerCount", js.undefined)
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value*))
    
    inline def setHeaders(value: js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setIsCustomWidth(value: Boolean): Self = StObject.set(x, "isCustomWidth", value.asInstanceOf[js.Any])
    
    inline def setIsCustomWidthUndefined: Self = StObject.set(x, "isCustomWidth", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLetter(value: String): Self = StObject.set(x, "letter", value.asInstanceOf[js.Any])
    
    inline def setLetterUndefined: Self = StObject.set(x, "letter", js.undefined)
    
    inline def setNumFmt(value: String): Self = StObject.set(x, "numFmt", value.asInstanceOf[js.Any])
    
    inline def setNumFmtUndefined: Self = StObject.set(x, "numFmt", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setOutlineLevel(value: Double): Self = StObject.set(x, "outlineLevel", value.asInstanceOf[js.Any])
    
    inline def setOutlineLevelUndefined: Self = StObject.set(x, "outlineLevel", js.undefined)
    
    inline def setProtection(value: PartialProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    inline def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
    
    inline def setStyle(value: PartialStyleAlignment): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
    
    inline def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    
    inline def setValues(value: js.Array[CellValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: CellValue*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWorksheet(value: Worksheet): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    inline def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
