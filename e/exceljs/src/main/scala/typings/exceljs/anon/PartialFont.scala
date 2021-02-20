package typings.exceljs.anon

import typings.exceljs.exceljsStrings.double
import typings.exceljs.exceljsStrings.doubleAccounting
import typings.exceljs.exceljsStrings.major
import typings.exceljs.exceljsStrings.minor
import typings.exceljs.exceljsStrings.none_
import typings.exceljs.exceljsStrings.single
import typings.exceljs.exceljsStrings.singleAccounting
import typings.exceljs.exceljsStrings.subscript
import typings.exceljs.exceljsStrings.superscript
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Font> */
@js.native
trait PartialFont extends StObject {
  
  var bold: js.UndefOr[Boolean] = js.native
  
  var charset: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[PartialColor] = js.native
  
  var family: js.UndefOr[Double] = js.native
  
  var italic: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var outline: js.UndefOr[Boolean] = js.native
  
  var scheme: js.UndefOr[minor | major | none_] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var strike: js.UndefOr[Boolean] = js.native
  
  var underline: js.UndefOr[Boolean | none_ | single | double | singleAccounting | doubleAccounting] = js.native
  
  var vertAlign: js.UndefOr[superscript | subscript] = js.native
}
object PartialFont {
  
  @scala.inline
  def apply(): PartialFont = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFont]
  }
  
  @scala.inline
  implicit class PartialFontMutableBuilder[Self <: PartialFont] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    @scala.inline
    def setCharset(value: Double): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    @scala.inline
    def setColor(value: PartialColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setScheme(value: minor | major | none_): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStrike(value: Boolean): Self = StObject.set(x, "strike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikeUndefined: Self = StObject.set(x, "strike", js.undefined)
    
    @scala.inline
    def setUnderline(value: Boolean | none_ | single | double | singleAccounting | doubleAccounting): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
    
    @scala.inline
    def setVertAlign(value: superscript | subscript): Self = StObject.set(x, "vertAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertAlignUndefined: Self = StObject.set(x, "vertAlign", js.undefined)
  }
}
