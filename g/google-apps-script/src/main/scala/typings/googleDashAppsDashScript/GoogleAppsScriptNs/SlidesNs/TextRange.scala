package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SlidesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextRange extends js.Object {
  def appendParagraph(text: String): Paragraph = js.native
  def appendRange(textRange: TextRange): TextRange = js.native
  def appendRange(textRange: TextRange, matchSourceFormatting: Boolean): TextRange = js.native
  def appendText(text: String): TextRange = js.native
  def asRenderedString(): String = js.native
  def asString(): String = js.native
  def clear(): Unit = js.native
  def clear(startOffset: Integer, endOffset: Integer): Unit = js.native
  def find(pattern: String): js.Array[TextRange] = js.native
  def find(pattern: String, startOffset: Integer): js.Array[TextRange] = js.native
  def getAutoTexts(): js.Array[AutoText] = js.native
  def getEndIndex(): Integer = js.native
  def getLength(): Integer = js.native
  def getLinks(): js.Array[TextRange] = js.native
  def getListParagraphs(): js.Array[Paragraph] = js.native
  def getListStyle(): ListStyle = js.native
  def getParagraphStyle(): ParagraphStyle = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  def getRange(startOffset: Integer, endOffset: Integer): TextRange = js.native
  def getRuns(): js.Array[TextRange] = js.native
  def getStartIndex(): Integer = js.native
  def getTextStyle(): TextStyle = js.native
  def insertParagraph(startOffset: Integer, text: String): Paragraph = js.native
  def insertRange(startOffset: Integer, textRange: TextRange): TextRange = js.native
  def insertRange(startOffset: Integer, textRange: TextRange, matchSourceFormatting: Boolean): TextRange = js.native
  def insertText(startOffset: Integer, text: String): TextRange = js.native
  def isEmpty(): Boolean = js.native
  def replaceAllText(findText: String, replaceText: String): Integer = js.native
  def replaceAllText(findText: String, replaceText: String, matchCase: Boolean): Integer = js.native
  def select(): Unit = js.native
  def setText(newText: String): TextRange = js.native
}

