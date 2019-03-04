package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EquationSymbol extends js.Object {
  def copy(): EquationSymbol
  def getAttributes(): js.Object
  def getCode(): java.lang.String
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): scala.Boolean
  def merge(): EquationSymbol
  def removeFromParent(): EquationSymbol
  def setAttributes(attributes: js.Object): EquationSymbol
}

object EquationSymbol {
  @scala.inline
  def apply(
    copy: js.Function0[EquationSymbol],
    getAttributes: js.Function0[js.Object],
    getCode: js.Function0[java.lang.String],
    getNextSibling: js.Function0[Element],
    getParent: js.Function0[ContainerElement],
    getPreviousSibling: js.Function0[Element],
    getType: js.Function0[ElementType],
    isAtDocumentEnd: js.Function0[scala.Boolean],
    merge: js.Function0[EquationSymbol],
    removeFromParent: js.Function0[EquationSymbol],
    setAttributes: js.Function1[js.Object, EquationSymbol]
  ): EquationSymbol = {
    val __obj = js.Dynamic.literal(copy = copy, getAttributes = getAttributes, getCode = getCode, getNextSibling = getNextSibling, getParent = getParent, getPreviousSibling = getPreviousSibling, getType = getType, isAtDocumentEnd = isAtDocumentEnd, merge = merge, removeFromParent = removeFromParent, setAttributes = setAttributes)
  
    __obj.asInstanceOf[EquationSymbol]
  }
}

