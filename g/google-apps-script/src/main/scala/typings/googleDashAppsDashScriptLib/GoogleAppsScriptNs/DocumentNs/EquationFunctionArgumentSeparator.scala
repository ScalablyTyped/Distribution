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
    copy: () => EquationFunctionArgumentSeparator,
    getAttributes: () => js.Object,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => scala.Boolean,
    merge: () => EquationFunctionArgumentSeparator,
    removeFromParent: () => EquationFunctionArgumentSeparator,
    setAttributes: js.Object => EquationFunctionArgumentSeparator
  ): EquationFunctionArgumentSeparator = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAttributes = js.Any.fromFunction0(getAttributes), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), merge = js.Any.fromFunction0(merge), removeFromParent = js.Any.fromFunction0(removeFromParent), setAttributes = js.Any.fromFunction1(setAttributes))
  
    __obj.asInstanceOf[EquationFunctionArgumentSeparator]
  }
}

