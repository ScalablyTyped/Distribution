package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for Rich Text values.
  */
@js.native
trait RichTextValueBuilder extends StObject {
  
  def build(): RichTextValue = js.native
  
  def setLinkUrl(): RichTextValueBuilder = js.native
  def setLinkUrl(linkUrl: String): RichTextValueBuilder = js.native
  def setLinkUrl(startOffset: Integer, endOffset: Integer): RichTextValueBuilder = js.native
  def setLinkUrl(startOffset: Integer, endOffset: Integer, linkUrl: String): RichTextValueBuilder = js.native
  
  def setText(text: String): RichTextValueBuilder = js.native
  
  def setTextStyle(): RichTextValueBuilder = js.native
  def setTextStyle(startOffset: Integer, endOffset: Integer): RichTextValueBuilder = js.native
  def setTextStyle(startOffset: Integer, endOffset: Integer, textStyle: TextStyle): RichTextValueBuilder = js.native
  def setTextStyle(textStyle: TextStyle): RichTextValueBuilder = js.native
}
