package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An element representing an horizontal rule. A HorizontalRule can be contained within a
  * ListItem or Paragraph, but cannot itself contain any other element. For more
  * information on document structure, see the guide to extending Google Docs.
  */
trait HorizontalRule extends js.Object {
  def copy(): HorizontalRule
  def getAttributes(): js.Any
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): Boolean
  def removeFromParent(): HorizontalRule
  def setAttributes(attributes: js.Any): HorizontalRule
}

object HorizontalRule {
  @scala.inline
  def apply(
    copy: () => HorizontalRule,
    getAttributes: () => js.Any,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => Boolean,
    removeFromParent: () => HorizontalRule,
    setAttributes: js.Any => HorizontalRule
  ): HorizontalRule = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAttributes = js.Any.fromFunction0(getAttributes), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), removeFromParent = js.Any.fromFunction0(removeFromParent), setAttributes = js.Any.fromFunction1(setAttributes))
  
    __obj.asInstanceOf[HorizontalRule]
  }
}

