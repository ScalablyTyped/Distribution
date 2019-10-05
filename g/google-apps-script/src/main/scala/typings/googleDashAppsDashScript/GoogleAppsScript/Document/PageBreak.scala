package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageBreak extends js.Object {
  def copy(): PageBreak
  def getAttributes(): js.Any
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): Boolean
  def removeFromParent(): PageBreak
  def setAttributes(attributes: js.Any): PageBreak
}

object PageBreak {
  @scala.inline
  def apply(
    copy: () => PageBreak,
    getAttributes: () => js.Any,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => Boolean,
    removeFromParent: () => PageBreak,
    setAttributes: js.Any => PageBreak
  ): PageBreak = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAttributes = js.Any.fromFunction0(getAttributes), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), removeFromParent = js.Any.fromFunction0(removeFromParent), setAttributes = js.Any.fromFunction1(setAttributes))
  
    __obj.asInstanceOf[PageBreak]
  }
}

