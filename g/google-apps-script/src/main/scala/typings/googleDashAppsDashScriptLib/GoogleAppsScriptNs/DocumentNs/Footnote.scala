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

object Footnote {
  @scala.inline
  def apply(
    copy: () => Footnote,
    getAttributes: () => js.Object,
    getFootnoteContents: () => FootnoteSection,
    getNextSibling: () => Element,
    getParent: () => ContainerElement,
    getPreviousSibling: () => Element,
    getType: () => ElementType,
    isAtDocumentEnd: () => scala.Boolean,
    removeFromParent: () => Footnote,
    setAttributes: js.Object => Footnote
  ): Footnote = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), getAttributes = js.Any.fromFunction0(getAttributes), getFootnoteContents = js.Any.fromFunction0(getFootnoteContents), getNextSibling = js.Any.fromFunction0(getNextSibling), getParent = js.Any.fromFunction0(getParent), getPreviousSibling = js.Any.fromFunction0(getPreviousSibling), getType = js.Any.fromFunction0(getType), isAtDocumentEnd = js.Any.fromFunction0(isAtDocumentEnd), removeFromParent = js.Any.fromFunction0(removeFromParent), setAttributes = js.Any.fromFunction1(setAttributes))
  
    __obj.asInstanceOf[Footnote]
  }
}

