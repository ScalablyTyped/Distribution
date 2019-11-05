package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element representing a region that is unknown or cannot be affected by a script, such as a
  * page number.
  */
trait UnsupportedElement extends js.Object {
  def copy(): UnsupportedElement
  def getAttributes(): js.Any
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): Boolean
  def merge(): UnsupportedElement
  def removeFromParent(): UnsupportedElement
  def setAttributes(attributes: js.Any): UnsupportedElement
}

object UnsupportedElement {
  @scala.inline
  def apply(
    copy: () => UnsupportedElement,
    getAttributes: () => js.Any,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => Boolean,
    merge: () => UnsupportedElement,
    removeFromParent: () => UnsupportedElement,
    setAttributes: js.Any => UnsupportedElement
  ): UnsupportedElement = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAttributes = js.Any.fromFunction0(getAttributes), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAttributes = js.Any.fromFunction1(setAttributes))
  
    __obj.asInstanceOf[UnsupportedElement]
  }
}

