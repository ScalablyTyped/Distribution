package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EquationFunctionArgumentSeparator extends js.Object {
  def copy(): EquationFunctionArgumentSeparator
  def getAttributes(): js.Object
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): scala.Boolean
  def merge(): EquationFunctionArgumentSeparator
  def removeFromParent(): EquationFunctionArgumentSeparator
  def setAttributes(attributes: js.Object): EquationFunctionArgumentSeparator
}

object EquationFunctionArgumentSeparator {
  @scala.inline
  def apply(
    copy: js.Function0[EquationFunctionArgumentSeparator],
    getAttributes: js.Function0[js.Object],
    getNextSibling: js.Function0[Element],
    getParent: js.Function0[ContainerElement],
    getPreviousSibling: js.Function0[Element],
    getType: js.Function0[ElementType],
    isAtDocumentEnd: js.Function0[scala.Boolean],
    merge: js.Function0[EquationFunctionArgumentSeparator],
    removeFromParent: js.Function0[EquationFunctionArgumentSeparator],
    setAttributes: js.Function1[js.Object, EquationFunctionArgumentSeparator]
  ): EquationFunctionArgumentSeparator = {
    val __obj = js.Dynamic.literal(copy = copy, getAttributes = getAttributes, getNextSibling = getNextSibling, getParent = getParent, getPreviousSibling = getPreviousSibling, getType = getType, isAtDocumentEnd = isAtDocumentEnd, merge = merge, removeFromParent = removeFromParent, setAttributes = setAttributes)
  
    __obj.asInstanceOf[EquationFunctionArgumentSeparator]
  }
}

