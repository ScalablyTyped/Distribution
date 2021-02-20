package typings.exceljs.anon

import typings.exceljs.mod.Fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Style> */
@js.native
trait PartialStyle extends StObject {
  
  var alignment: js.UndefOr[PartialAlignment] = js.native
  
  var border: js.UndefOr[PartialBordersBottom] = js.native
  
  var fill: js.UndefOr[Fill] = js.native
  
  var font: js.UndefOr[PartialFont] = js.native
  
  var numFmt: js.UndefOr[String] = js.native
  
  var protection: js.UndefOr[PartialProtection] = js.native
}
object PartialStyle {
  
  @scala.inline
  def apply(): PartialStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialStyle]
  }
  
  @scala.inline
  implicit class PartialStyleMutableBuilder[Self <: PartialStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignment(value: PartialAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    
    @scala.inline
    def setBorder(value: PartialBordersBottom): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setNumFmt(value: String): Self = StObject.set(x, "numFmt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFmtUndefined: Self = StObject.set(x, "numFmt", js.undefined)
    
    @scala.inline
    def setProtection(value: PartialProtection): Self = StObject.set(x, "protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionUndefined: Self = StObject.set(x, "protection", js.undefined)
  }
}
