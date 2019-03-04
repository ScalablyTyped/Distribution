package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HorizontalRule extends js.Object {
  def copy(): HorizontalRule
  def getAttributes(): js.Object
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): scala.Boolean
  def removeFromParent(): HorizontalRule
  def setAttributes(attributes: js.Object): HorizontalRule
}

object HorizontalRule {
  @scala.inline
  def apply(
    copy: js.Function0[HorizontalRule],
    getAttributes: js.Function0[js.Object],
    getNextSibling: js.Function0[Element],
    getParent: js.Function0[ContainerElement],
    getPreviousSibling: js.Function0[Element],
    getType: js.Function0[ElementType],
    isAtDocumentEnd: js.Function0[scala.Boolean],
    removeFromParent: js.Function0[HorizontalRule],
    setAttributes: js.Function1[js.Object, HorizontalRule]
  ): HorizontalRule = {
    val __obj = js.Dynamic.literal(copy = copy, getAttributes = getAttributes, getNextSibling = getNextSibling, getParent = getParent, getPreviousSibling = getPreviousSibling, getType = getType, isAtDocumentEnd = isAtDocumentEnd, removeFromParent = removeFromParent, setAttributes = setAttributes)
  
    __obj.asInstanceOf[HorizontalRule]
  }
}

