package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Text extends js.Object {
  def appendText(text: java.lang.String): Text = js.native
  def copy(): Text = js.native
  def deleteText(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Text = js.native
  def editAsText(): Text = js.native
  def findText(searchPattern: java.lang.String): RangeElement = js.native
  def findText(searchPattern: java.lang.String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Object = js.native
  def getAttributes(offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): js.Object = js.native
  def getBackgroundColor(): java.lang.String = js.native
  def getBackgroundColor(offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String = js.native
  def getFontFamily(): java.lang.String = js.native
  def getFontFamily(offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String = js.native
  def getFontSize(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getFontSize(offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getForegroundColor(): java.lang.String = js.native
  def getForegroundColor(offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String = js.native
  def getLinkUrl(): java.lang.String = js.native
  def getLinkUrl(offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): java.lang.String = js.native
  def getNextSibling(): Element = js.native
  def getParent(): ContainerElement = js.native
  def getPreviousSibling(): Element = js.native
  def getText(): java.lang.String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getTextAlignment(offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): TextAlignment = js.native
  def getTextAttributeIndices(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer] = js.native
  def getType(): ElementType = js.native
  def insertText(offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, text: java.lang.String): Text = js.native
  def isAtDocumentEnd(): scala.Boolean = js.native
  def isBold(): scala.Boolean = js.native
  def isBold(offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def isItalic(): scala.Boolean = js.native
  def isItalic(offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def isStrikethrough(): scala.Boolean = js.native
  def isStrikethrough(offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def isUnderline(): scala.Boolean = js.native
  def isUnderline(offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): scala.Boolean = js.native
  def merge(): Text = js.native
  def removeFromParent(): Text = js.native
  def replaceText(searchPattern: java.lang.String, replacement: java.lang.String): Element = js.native
  def setAttributes(attributes: js.Object): Text = js.native
  def setAttributes(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    attributes: js.Object
  ): Text = js.native
  def setBackgroundColor(color: java.lang.String): Text = js.native
  def setBackgroundColor(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    color: java.lang.String
  ): Text = js.native
  def setBold(bold: scala.Boolean): Text = js.native
  def setBold(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    bold: scala.Boolean
  ): Text = js.native
  def setFontFamily(fontFamilyName: java.lang.String): Text = js.native
  def setFontFamily(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    fontFamilyName: java.lang.String
  ): Text = js.native
  def setFontSize(size: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Text = js.native
  def setFontSize(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    size: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): Text = js.native
  def setForegroundColor(color: java.lang.String): Text = js.native
  def setForegroundColor(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    color: java.lang.String
  ): Text = js.native
  def setItalic(italic: scala.Boolean): Text = js.native
  def setItalic(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    italic: scala.Boolean
  ): Text = js.native
  def setLinkUrl(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    url: java.lang.String
  ): Text = js.native
  def setLinkUrl(url: java.lang.String): Text = js.native
  def setStrikethrough(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    strikethrough: scala.Boolean
  ): Text = js.native
  def setStrikethrough(strikethrough: scala.Boolean): Text = js.native
  def setText(text: java.lang.String): Text = js.native
  def setTextAlignment(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    textAlignment: TextAlignment
  ): Text = js.native
  def setTextAlignment(textAlignment: TextAlignment): Text = js.native
  def setUnderline(
    startOffset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    endOffsetInclusive: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    underline: scala.Boolean
  ): Text = js.native
  def setUnderline(underline: scala.Boolean): Text = js.native
}

