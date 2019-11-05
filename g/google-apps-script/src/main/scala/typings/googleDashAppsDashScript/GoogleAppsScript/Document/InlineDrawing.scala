package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element representing an embedded drawing. An InlineDrawing can be contained within a
  * ListItem or Paragraph, unless the ListItem or Paragraph is within
  * a FootnoteSection. An InlineDrawing cannot itself contain any other element. For
  * more information on document structure, see the guide to extending Google Docs.
  */
trait InlineDrawing extends js.Object {
  def copy(): InlineDrawing
  def getAltDescription(): String
  def getAltTitle(): String
  def getAttributes(): js.Any
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): Boolean
  def merge(): InlineDrawing
  def removeFromParent(): InlineDrawing
  def setAltDescription(description: String): InlineDrawing
  def setAltTitle(title: String): InlineDrawing
  def setAttributes(attributes: js.Any): InlineDrawing
}

object InlineDrawing {
  @scala.inline
  def apply(
    copy: () => InlineDrawing,
    getAltDescription: () => String,
    getAltTitle: () => String,
    getAttributes: () => js.Any,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => Boolean,
    merge: () => InlineDrawing,
    removeFromParent: () => InlineDrawing,
    setAltDescription: String => InlineDrawing,
    setAltTitle: String => InlineDrawing,
    setAttributes: js.Any => InlineDrawing
  ): InlineDrawing = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAltDescription = js.Any.fromFunction0(getAltDescription), getAltTitle = js.Any.fromFunction0(getAltTitle), getAttributes = js.Any.fromFunction0(getAttributes), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAltDescription = js.Any.fromFunction1(setAltDescription), setAltTitle = js.Any.fromFunction1(setAltTitle), setAttributes = js.Any.fromFunction1(setAttributes))
  
    __obj.asInstanceOf[InlineDrawing]
  }
}

