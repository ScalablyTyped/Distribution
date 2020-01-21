package typings.figma.mod._Global_

import typings.figma.figmaStrings.TEXT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStyle extends BaseStyle {
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
}

