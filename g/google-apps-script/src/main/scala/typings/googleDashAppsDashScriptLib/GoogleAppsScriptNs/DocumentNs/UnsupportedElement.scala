package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedElement extends js.Object {
  def copy(): UnsupportedElement
  def getAttributes(): js.Object
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): scala.Boolean
  def merge(): UnsupportedElement
  def removeFromParent(): UnsupportedElement
  def setAttributes(attributes: js.Object): UnsupportedElement
}

object UnsupportedElement {
  @scala.inline
  def apply(
    copy: js.Function0[UnsupportedElement],
    getAttributes: js.Function0[js.Object],
    getNextSibling: js.Function0[Element],
    getParent: js.Function0[ContainerElement],
    getPreviousSibling: js.Function0[Element],
    getType: js.Function0[ElementType],
    isAtDocumentEnd: js.Function0[scala.Boolean],
    merge: js.Function0[UnsupportedElement],
    removeFromParent: js.Function0[UnsupportedElement],
    setAttributes: js.Function1[js.Object, UnsupportedElement]
  ): UnsupportedElement = {
    val __obj = js.Dynamic.literal(copy = copy, getAttributes = getAttributes, getNextSibling = getNextSibling, getParent = getParent, getPreviousSibling = getPreviousSibling, getType = getType, isAtDocumentEnd = isAtDocumentEnd, merge = merge, removeFromParent = removeFromParent, setAttributes = setAttributes)
  
    __obj.asInstanceOf[UnsupportedElement]
  }
}

