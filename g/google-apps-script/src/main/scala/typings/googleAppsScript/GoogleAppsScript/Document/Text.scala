package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An element representing a rich text region. All text in a Document is contained within Text elements.
  * A Text element can be contained within an Equation, EquationFunction,
  * ListItem, or Paragraph, but cannot itself contain any other element. For more
  * information on document structure, see the guide to extending Google Docs.
  *
  *     var body = DocumentApp.getActiveDocument().getBody();
  *
  *     // Use editAsText to obtain a single text element containing
  *     // all the characters in the document.
  *     var text = body.editAsText();
  *
  *     // Insert text at the beginning of the document.
  *     text.insertText(0, 'Inserted text.\n');
  *
  *     // Insert text at the end of the document.
  *     text.appendText('\nAppended text.');
  *
  *     // Make the first half of the document blue.
  *     text.setForegroundColor(0, text.getText().length / 2, '#00FFFF');
  */
@js.native
trait Text extends Element {
  
  def appendText(text: String): Text = js.native
  
  def deleteText(startOffset: Integer, endOffsetInclusive: Integer): Text = js.native
  
  def editAsText(): Text = js.native
  
  def findText(searchPattern: String): RangeElement = js.native
  def findText(searchPattern: String, from: RangeElement): RangeElement = js.native
  
  def getAttributes(offset: Integer): js.Any = js.native
  
  def getBackgroundColor(): String = js.native
  def getBackgroundColor(offset: Integer): String = js.native
  
  def getFontFamily(): String = js.native
  def getFontFamily(offset: Integer): String = js.native
  
  def getFontSize(): Integer = js.native
  def getFontSize(offset: Integer): Integer = js.native
  
  def getForegroundColor(): String = js.native
  def getForegroundColor(offset: Integer): String = js.native
  
  def getLinkUrl(): String = js.native
  def getLinkUrl(offset: Integer): String = js.native
  
  def getText(): String = js.native
  
  def getTextAlignment(): TextAlignment = js.native
  def getTextAlignment(offset: Integer): TextAlignment = js.native
  
  def getTextAttributeIndices(): js.Array[Integer] = js.native
  
  def insertText(offset: Integer, text: String): Text = js.native
  
  def isBold(): Boolean = js.native
  def isBold(offset: Integer): Boolean = js.native
  
  def isItalic(): Boolean = js.native
  def isItalic(offset: Integer): Boolean = js.native
  
  def isStrikethrough(): Boolean = js.native
  def isStrikethrough(offset: Integer): Boolean = js.native
  
  def isUnderline(): Boolean = js.native
  def isUnderline(offset: Integer): Boolean = js.native
  
  def replaceText(searchPattern: String, replacement: String): Element = js.native
  
  def setAttributes(startOffset: Integer, endOffsetInclusive: Integer, attributes: js.Any): Text = js.native
  
  def setBackgroundColor(color: String): Text = js.native
  def setBackgroundColor(startOffset: Integer, endOffsetInclusive: Integer, color: String): Text = js.native
  
  def setBold(bold: Boolean): Text = js.native
  def setBold(startOffset: Integer, endOffsetInclusive: Integer, bold: Boolean): Text = js.native
  
  def setFontFamily(fontFamilyName: String): Text = js.native
  def setFontFamily(startOffset: Integer, endOffsetInclusive: Integer, fontFamilyName: String): Text = js.native
  
  def setFontSize(size: Integer): Text = js.native
  def setFontSize(startOffset: Integer, endOffsetInclusive: Integer, size: Integer): Text = js.native
  
  def setForegroundColor(color: String): Text = js.native
  def setForegroundColor(startOffset: Integer, endOffsetInclusive: Integer, color: String): Text = js.native
  
  def setItalic(italic: Boolean): Text = js.native
  def setItalic(startOffset: Integer, endOffsetInclusive: Integer, italic: Boolean): Text = js.native
  
  def setLinkUrl(startOffset: Integer, endOffsetInclusive: Integer, url: String): Text = js.native
  def setLinkUrl(url: String): Text = js.native
  
  def setStrikethrough(startOffset: Integer, endOffsetInclusive: Integer, strikethrough: Boolean): Text = js.native
  def setStrikethrough(strikethrough: Boolean): Text = js.native
  
  def setText(text: String): Text = js.native
  
  def setTextAlignment(startOffset: Integer, endOffsetInclusive: Integer, textAlignment: TextAlignment): Text = js.native
  def setTextAlignment(textAlignment: TextAlignment): Text = js.native
  
  def setUnderline(startOffset: Integer, endOffsetInclusive: Integer, underline: Boolean): Text = js.native
  def setUnderline(underline: Boolean): Text = js.native
}
