package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Footnote extends js.Object {
  def copy(): Footnote
  def getAttributes(): js.Object
  def getFootnoteContents(): FootnoteSection
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): scala.Boolean
  def removeFromParent(): Footnote
  def setAttributes(attributes: js.Object): Footnote
}

