package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EquationFunction extends js.Object {
  def clear(): EquationFunction = js.native
  def copy(): EquationFunction = js.native
  def editAsText(): Text = js.native
  def findElement(elementType: ElementType): RangeElement = js.native
  def findElement(elementType: ElementType, from: RangeElement): RangeElement = js.native
  def findText(searchPattern: java.lang.String): RangeElement = js.native
  def findText(searchPattern: java.lang.String, from: RangeElement): RangeElement = js.native
  def getAttributes(): js.Object = js.native
  def getChild(childIndex: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Element = js.native
  def getChildIndex(child: Element): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getCode(): java.lang.String = js.native
  def getLinkUrl(): java.lang.String = js.native
  def getNextSibling(): Element = js.native
  def getNumChildren(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getParent(): ContainerElement = js.native
  def getPreviousSibling(): Element = js.native
  def getText(): java.lang.String = js.native
  def getTextAlignment(): TextAlignment = js.native
  def getType(): ElementType = js.native
  def isAtDocumentEnd(): scala.Boolean = js.native
  def merge(): EquationFunction = js.native
  def removeFromParent(): EquationFunction = js.native
  def replaceText(searchPattern: java.lang.String, replacement: java.lang.String): Element = js.native
  def setAttributes(attributes: js.Object): EquationFunction = js.native
  def setLinkUrl(url: java.lang.String): EquationFunction = js.native
  def setTextAlignment(textAlignment: TextAlignment): EquationFunction = js.native
}

