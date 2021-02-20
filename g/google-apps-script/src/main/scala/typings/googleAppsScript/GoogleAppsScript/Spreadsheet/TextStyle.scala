package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The rendered style of text in a cell.
  *
  * Text styles can have a corresponding RichTextValue. If the RichTextValue spans multiple text runs that have different values for a given text style read
  * method, the method returns null. To avoid this, query for text styles using the Rich Text
  * values returned by the RichTextValue.getRuns() method.
  */
@js.native
trait TextStyle extends StObject {
  
  def copy(): TextStyleBuilder = js.native
  
  def getFontFamily(): String | Null = js.native
  
  def getFontSize(): Integer | Null = js.native
  
  def getForegroundColor(): String | Null = js.native
  
  def isBold(): Boolean | Null = js.native
  
  def isItalic(): Boolean | Null = js.native
  
  def isStrikethrough(): Boolean | Null = js.native
  
  def isUnderline(): Boolean | Null = js.native
}
object TextStyle {
  
  @scala.inline
  def apply(
    copy: () => TextStyleBuilder,
    getFontFamily: () => String | Null,
    getFontSize: () => Integer | Null,
    getForegroundColor: () => String | Null,
    isBold: () => Boolean | Null,
    isItalic: () => Boolean | Null,
    isStrikethrough: () => Boolean | Null,
    isUnderline: () => Boolean | Null
  ): TextStyle = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getFontFamily = js.Any.fromFunction0(getFontFamily), getFontSize = js.Any.fromFunction0(getFontSize), getForegroundColor = js.Any.fromFunction0(getForegroundColor), isBold = js.Any.fromFunction0(isBold), isItalic = js.Any.fromFunction0(isItalic), isStrikethrough = js.Any.fromFunction0(isStrikethrough), isUnderline = js.Any.fromFunction0(isUnderline))
    __obj.asInstanceOf[TextStyle]
  }
  
  @scala.inline
  implicit class TextStyleMutableBuilder[Self <: TextStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: () => TextStyleBuilder): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFontFamily(value: () => String | Null): Self = StObject.set(x, "getFontFamily", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFontSize(value: () => Integer | Null): Self = StObject.set(x, "getFontSize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetForegroundColor(value: () => String | Null): Self = StObject.set(x, "getForegroundColor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsBold(value: () => Boolean | Null): Self = StObject.set(x, "isBold", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsItalic(value: () => Boolean | Null): Self = StObject.set(x, "isItalic", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsStrikethrough(value: () => Boolean | Null): Self = StObject.set(x, "isStrikethrough", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsUnderline(value: () => Boolean | Null): Self = StObject.set(x, "isUnderline", js.Any.fromFunction0(value))
  }
}
