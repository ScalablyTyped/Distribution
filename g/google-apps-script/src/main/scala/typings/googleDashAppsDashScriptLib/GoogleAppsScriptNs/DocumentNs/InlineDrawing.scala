package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineDrawing extends js.Object {
  def copy(): InlineDrawing
  def getAltDescription(): java.lang.String
  def getAltTitle(): java.lang.String
  def getAttributes(): js.Object
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): scala.Boolean
  def merge(): InlineDrawing
  def removeFromParent(): InlineDrawing
  def setAltDescription(description: java.lang.String): InlineDrawing
  def setAltTitle(title: java.lang.String): InlineDrawing
  def setAttributes(attributes: js.Object): InlineDrawing
}

object InlineDrawing {
  @scala.inline
  def apply(
    copy: () => InlineDrawing,
    getAltDescription: () => java.lang.String,
    getAltTitle: () => java.lang.String,
    getAttributes: () => js.Object,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => scala.Boolean,
    merge: () => InlineDrawing,
    removeFromParent: () => InlineDrawing,
    setAltDescription: java.lang.String => InlineDrawing,
    setAltTitle: java.lang.String => InlineDrawing,
    setAttributes: js.Object => InlineDrawing
  ): InlineDrawing = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAltDescription = js.Any.fromFunction0(getAltDescription), getAltTitle = js.Any.fromFunction0(getAltTitle), getAttributes = js.Any.fromFunction0(getAttributes), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAltDescription = js.Any.fromFunction1(setAltDescription), setAltTitle = js.Any.fromFunction1(setAltTitle), setAttributes = js.Any.fromFunction1(setAttributes))
  
    __obj.asInstanceOf[InlineDrawing]
  }
}

