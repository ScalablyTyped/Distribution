package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextRange extends js.Object {
  def appendParagraph(text: java.lang.String): Paragraph = js.native
  def appendRange(textRange: TextRange): TextRange = js.native
  def appendRange(textRange: TextRange, matchSourceFormatting: scala.Boolean): TextRange = js.native
  def appendText(text: java.lang.String): TextRange = js.native
  def asRenderedString(): java.lang.String = js.native
  def asString(): java.lang.String = js.native
  def clear(): scala.Unit = js.native
  def clear(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): scala.Unit = js.native
  def find(pattern: java.lang.String): js.Array[TextRange] = js.native
  def find(pattern: java.lang.String, startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): js.Array[TextRange] = js.native
  def getAutoTexts(): js.Array[AutoText] = js.native
  def getEndIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getLength(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getLinks(): js.Array[TextRange] = js.native
  def getListParagraphs(): js.Array[Paragraph] = js.native
  def getListStyle(): ListStyle = js.native
  def getParagraphStyle(): ParagraphStyle = js.native
  def getParagraphs(): js.Array[Paragraph] = js.native
  def getRange(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): TextRange = js.native
  def getRuns(): js.Array[TextRange] = js.native
  def getStartIndex(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getTextStyle(): TextStyle = js.native
  def insertParagraph(startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, text: java.lang.String): Paragraph = js.native
  def insertRange(startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, textRange: TextRange): TextRange = js.native
  def insertRange(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    textRange: TextRange,
    matchSourceFormatting: scala.Boolean
  ): TextRange = js.native
  def insertText(startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, text: java.lang.String): TextRange = js.native
  def isEmpty(): scala.Boolean = js.native
  def replaceAllText(findText: java.lang.String, replaceText: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def replaceAllText(findText: java.lang.String, replaceText: java.lang.String, matchCase: scala.Boolean): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def select(): scala.Unit = js.native
  def setText(newText: java.lang.String): TextRange = js.native
}

