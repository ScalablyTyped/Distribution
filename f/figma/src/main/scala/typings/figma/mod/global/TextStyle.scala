package typings.figma.mod.global

import typings.figma.figmaStrings.TEXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyle extends BaseStyle {
  
  var fontName: FontName = js.native
  
  var fontSize: Double = js.native
  
  var letterSpacing: LetterSpacing = js.native
  
  var lineHeight: LineHeight = js.native
  
  var paragraphIndent: Double = js.native
  
  var paragraphSpacing: Double = js.native
  
  var textCase: TextCase = js.native
  
  var textDecoration: TextDecoration = js.native
  
  @JSName("type")
  var type_TextStyle: TEXT = js.native
}
object TextStyle {
  
  @scala.inline
  def apply(
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
    textDecoration: TextDecoration,
    `type`: TEXT
  ): TextStyle = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], fontName = fontName.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paragraphIndent = paragraphIndent.asInstanceOf[js.Any], paragraphSpacing = paragraphSpacing.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), textCase = textCase.asInstanceOf[js.Any], textDecoration = textDecoration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
  
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFontName(value: FontName): Self = this.set("fontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacing(value: LetterSpacing): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeight(value: LineHeight): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphIndent(value: Double): Self = this.set("paragraphIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParagraphSpacing(value: Double): Self = this.set("paragraphSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextCase(value: TextCase): Self = this.set("textCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecoration(value: TextDecoration): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TEXT): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
