package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageBreak extends js.Object {
  def copy(): PageBreak
  def getAttributes(): js.Object
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): scala.Boolean
  def removeFromParent(): PageBreak
  def setAttributes(attributes: js.Object): PageBreak
}

object PageBreak {
  @scala.inline
  def apply(
    copy: js.Function0[PageBreak],
    getAttributes: js.Function0[js.Object],
    getNextSibling: js.Function0[Element],
    getParent: js.Function0[ContainerElement],
    getPreviousSibling: js.Function0[Element],
    getType: js.Function0[ElementType],
    isAtDocumentEnd: js.Function0[scala.Boolean],
    removeFromParent: js.Function0[PageBreak],
    setAttributes: js.Function1[js.Object, PageBreak]
  ): PageBreak = {
    val __obj = js.Dynamic.literal(copy = copy, getAttributes = getAttributes, getNextSibling = getNextSibling, getParent = getParent, getPreviousSibling = getPreviousSibling, getType = getType, isAtDocumentEnd = isAtDocumentEnd, removeFromParent = removeFromParent, setAttributes = setAttributes)
  
    __obj.asInstanceOf[PageBreak]
  }
}

