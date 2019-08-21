package typings.figma

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
    val __obj = js.Dynamic.literal(description = description, fontName = fontName, fontSize = fontSize, id = id, key = key, letterSpacing = letterSpacing, lineHeight = lineHeight, name = name, paragraphIndent = paragraphIndent, paragraphSpacing = paragraphSpacing, remote = remote, remove = js.Any.fromFunction0(remove), textCase = textCase, textDecoration = textDecoration)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TextStyle]
  }
}

