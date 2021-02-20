package typings.exceljs.mod

import typings.exceljs.anon.PartialColor
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

@js.native
trait Font extends StObject {
  
  var bold: Boolean = js.native
  
  var charset: Double = js.native
  
  var color: PartialColor = js.native
  
  var family: Double = js.native
  
  var italic: Boolean = js.native
  
  var name: String = js.native
  
  var outline: Boolean = js.native
  
  var scheme: minor | major | none_ = js.native
  
  var size: Double = js.native
  
  var strike: Boolean = js.native
  
  var underline: Boolean | none_ | single | double | singleAccounting | doubleAccounting = js.native
  
  var vertAlign: superscript | subscript = js.native
}
object Font {
  
  @scala.inline
  def apply(
    bold: Boolean,
    charset: Double,
    color: PartialColor,
    family: Double,
    italic: Boolean,
    name: String,
    outline: Boolean,
    scheme: minor | major | none_,
    size: Double,
    strike: Boolean,
    underline: Boolean | none_ | single | double | singleAccounting | doubleAccounting,
    vertAlign: superscript | subscript
  ): Font = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], strike = strike.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], vertAlign = vertAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharset(value: Double): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: PartialColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutline(value: Boolean): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: minor | major | none_): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrike(value: Boolean): Self = StObject.set(x, "strike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: Boolean | none_ | single | double | singleAccounting | doubleAccounting): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertAlign(value: superscript | subscript): Self = StObject.set(x, "vertAlign", value.asInstanceOf[js.Any])
  }
}
