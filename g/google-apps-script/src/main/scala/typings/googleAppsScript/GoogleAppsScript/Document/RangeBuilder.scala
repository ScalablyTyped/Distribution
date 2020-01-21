package typings.googleAppsScript.GoogleAppsScript.Document

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A builder used to construct Range objects from document elements.
  *
  *     // Change the user's selection to a range that includes every table in the document.
  *     var doc = DocumentApp.getActiveDocument();
  *     var rangeBuilder = doc.newRange();
  *     var tables = doc.getBody().getTables();
  *     for (var i = 0; i < tables.length; i++) {
  *       rangeBuilder.addElement(tables[i]);
  *     }
  *     doc.setSelection(rangeBuilder.build());
  */
@js.native
trait RangeBuilder extends js.Object {
  def addElement(element: Element): RangeBuilder = js.native
  def addElement(textElement: Text, startOffset: Integer, endOffsetInclusive: Integer): RangeBuilder = js.native
  def addElementsBetween(startElement: Element, endElementInclusive: Element): RangeBuilder = js.native
  def addElementsBetween(
    startTextElement: Text,
    startOffset: Integer,
    endTextElementInclusive: Text,
    endOffsetInclusive: Integer
  ): RangeBuilder = js.native
  def addRange(range: Range): RangeBuilder = js.native
  def build(): Range = js.native
  def getRangeElements(): js.Array[RangeElement] = js.native
  /** @deprecated DO NOT USE */ def getSelectedElements(): js.Array[RangeElement] = js.native
}

