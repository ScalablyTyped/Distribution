package typings.flexmonster.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalFormat extends StObject {
  
  var column: js.UndefOr[Double] = js.native
  
  var format: js.UndefOr[Style] = js.native
  
  var formatCSS: js.UndefOr[String] = js.native
  
  var formula: js.UndefOr[String] = js.native
  
  var hierarchy: js.UndefOr[String] = js.native
  
  var isTotal: js.UndefOr[Double] = js.native
  
  var measureName: js.UndefOr[String] = js.native
  
  var member: js.UndefOr[String] = js.native
  
  var row: js.UndefOr[Double] = js.native
}
object ConditionalFormat {
  
  @scala.inline
  def apply(): ConditionalFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalFormat]
  }
  
  @scala.inline
  implicit class ConditionalFormatMutableBuilder[Self <: ConditionalFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    @scala.inline
    def setFormat(value: Style): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatCSS(value: String): Self = StObject.set(x, "formatCSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatCSSUndefined: Self = StObject.set(x, "formatCSS", js.undefined)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    @scala.inline
    def setHierarchy(value: String): Self = StObject.set(x, "hierarchy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHierarchyUndefined: Self = StObject.set(x, "hierarchy", js.undefined)
    
    @scala.inline
    def setIsTotal(value: Double): Self = StObject.set(x, "isTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTotalUndefined: Self = StObject.set(x, "isTotal", js.undefined)
    
    @scala.inline
    def setMeasureName(value: String): Self = StObject.set(x, "measureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasureNameUndefined: Self = StObject.set(x, "measureName", js.undefined)
    
    @scala.inline
    def setMember(value: String): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
