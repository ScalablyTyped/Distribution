package typings.figma.mod.global

import typings.figma.figmaStrings.TEXT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyle
  extends StObject
     with BaseStyle {
  
  var fontName: FontName
  
  var fontSize: Double
  
  var letterSpacing: LetterSpacing
  
  var lineHeight: LineHeight
  
  var paragraphIndent: Double
  
  var paragraphSpacing: Double
  
  var textCase: TextCase
  
  var textDecoration: TextDecoration
  
  @JSName("type")
  var type_TextStyle: TEXT
}
object TextStyle {
  
  inline def apply(
    description: String,
    fontName: FontName,
    fontSize: Double,
    id: String,
    key: String,
    letterSpacing: LetterSpacing,
    lineHeight: LineHeight,
    name: String,
    paragraphIndent: Double,
    paragraphSpacing: Double,
    remote: Boolean,
    remove: () => Unit,
    textCase: TextCase,
    textDecoration: TextDecoration
  ): TextStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paragraphIndent = paragraphIndent.asInstanceOf[js.Any], paragraphSpacing = paragraphSpacing.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), textCase = textCase.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TEXT")
    __obj.asInstanceOf[TextStyle]
  }
  
  extension [Self <: TextStyle](x: Self) {
    
    inline def setFontName(value: FontName): Self = StObject.set(x, "fontName", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacing(value: LetterSpacing): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: LineHeight): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setParagraphIndent(value: Double): Self = StObject.set(x, "paragraphIndent", value.asInstanceOf[js.Any])
    
    inline def setParagraphSpacing(value: Double): Self = StObject.set(x, "paragraphSpacing", value.asInstanceOf[js.Any])
    
    inline def setTextCase(value: TextCase): Self = StObject.set(x, "textCase", value.asInstanceOf[js.Any])
    
    inline def setTextDecoration(value: TextDecoration): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setType(value: TEXT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
