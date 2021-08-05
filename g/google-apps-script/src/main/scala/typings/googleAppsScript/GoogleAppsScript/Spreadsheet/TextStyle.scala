package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The rendered style of text in a cell.
  *
  * Text styles can have a corresponding RichTextValue. If the RichTextValue spans multiple text runs that have different values for a given text style read
  * method, the method returns null. To avoid this, query for text styles using the Rich Text
  * values returned by the RichTextValue.getRuns() method.
  */
trait TextStyle extends StObject {
  
  def copy(): TextStyleBuilder
  
  def getFontFamily(): String | Null
  
  def getFontSize(): Integer | Null
  
  def getForegroundColor(): String | Null
  
  def isBold(): Boolean | Null
  
  def isItalic(): Boolean | Null
  
  def isStrikethrough(): Boolean | Null
  
  def isUnderline(): Boolean | Null
}
object TextStyle {
  
  inline def apply(
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
  
  extension [Self <: TextStyle](x: Self) {
    
    inline def setCopy(value: () => TextStyleBuilder): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
    
    inline def setGetFontFamily(value: () => String | Null): Self = StObject.set(x, "getFontFamily", js.Any.fromFunction0(value))
    
    inline def setGetFontSize(value: () => Integer | Null): Self = StObject.set(x, "getFontSize", js.Any.fromFunction0(value))
    
    inline def setGetForegroundColor(value: () => String | Null): Self = StObject.set(x, "getForegroundColor", js.Any.fromFunction0(value))
    
    inline def setIsBold(value: () => Boolean | Null): Self = StObject.set(x, "isBold", js.Any.fromFunction0(value))
    
    inline def setIsItalic(value: () => Boolean | Null): Self = StObject.set(x, "isItalic", js.Any.fromFunction0(value))
    
    inline def setIsStrikethrough(value: () => Boolean | Null): Self = StObject.set(x, "isStrikethrough", js.Any.fromFunction0(value))
    
    inline def setIsUnderline(value: () => Boolean | Null): Self = StObject.set(x, "isUnderline", js.Any.fromFunction0(value))
  }
}
