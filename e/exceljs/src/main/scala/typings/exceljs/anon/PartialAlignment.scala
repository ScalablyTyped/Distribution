package typings.exceljs.anon

import typings.exceljs.exceljsStrings.bottom
import typings.exceljs.exceljsStrings.center
import typings.exceljs.exceljsStrings.centerContinuous
import typings.exceljs.exceljsStrings.distributed
import typings.exceljs.exceljsStrings.fill
import typings.exceljs.exceljsStrings.justify
import typings.exceljs.exceljsStrings.left
import typings.exceljs.exceljsStrings.ltr
import typings.exceljs.exceljsStrings.middle
import typings.exceljs.exceljsStrings.right
import typings.exceljs.exceljsStrings.rtl
import typings.exceljs.exceljsStrings.top
import typings.exceljs.exceljsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Alignment> */
@js.native
trait PartialAlignment extends StObject {
  
  var horizontal: js.UndefOr[left | center | right | fill | justify | centerContinuous | distributed] = js.native
  
  var indent: js.UndefOr[Double] = js.native
  
  var readingOrder: js.UndefOr[rtl | ltr] = js.native
  
  var shrinkToFit: js.UndefOr[Boolean] = js.native
  
  var textRotation: js.UndefOr[Double | vertical] = js.native
  
  var vertical: js.UndefOr[top | middle | bottom | distributed | justify] = js.native
  
  var wrapText: js.UndefOr[Boolean] = js.native
}
object PartialAlignment {
  
  @scala.inline
  def apply(): PartialAlignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAlignment]
  }
  
  @scala.inline
  implicit class PartialAlignmentMutableBuilder[Self <: PartialAlignment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHorizontal(value: left | center | right | fill | justify | centerContinuous | distributed): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
    
    @scala.inline
    def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    
    @scala.inline
    def setReadingOrder(value: rtl | ltr): Self = StObject.set(x, "readingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadingOrderUndefined: Self = StObject.set(x, "readingOrder", js.undefined)
    
    @scala.inline
    def setShrinkToFit(value: Boolean): Self = StObject.set(x, "shrinkToFit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShrinkToFitUndefined: Self = StObject.set(x, "shrinkToFit", js.undefined)
    
    @scala.inline
    def setTextRotation(value: Double | vertical): Self = StObject.set(x, "textRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextRotationUndefined: Self = StObject.set(x, "textRotation", js.undefined)
    
    @scala.inline
    def setVertical(value: top | middle | bottom | distributed | justify): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    
    @scala.inline
    def setWrapText(value: Boolean): Self = StObject.set(x, "wrapText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapTextUndefined: Self = StObject.set(x, "wrapText", js.undefined)
  }
}
