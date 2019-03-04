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
    copy: js.Function0[Footnote],
    getAttributes: js.Function0[js.Object],
    getFootnoteContents: js.Function0[FootnoteSection],
    getNextSibling: js.Function0[Element],
    getParent: js.Function0[ContainerElement],
    getPreviousSibling: js.Function0[Element],
    getType: js.Function0[ElementType],
    isAtDocumentEnd: js.Function0[scala.Boolean],
    removeFromParent: js.Function0[Footnote],
    setAttributes: js.Function1[js.Object, Footnote]
  ): Footnote = {
    val __obj = js.Dynamic.literal(copy = copy, getAttributes = getAttributes, getFootnoteContents = getFootnoteContents, getNextSibling = getNextSibling, getParent = getParent, getPreviousSibling = getPreviousSibling, getType = getType, isAtDocumentEnd = isAtDocumentEnd, removeFromParent = removeFromParent, setAttributes = setAttributes)
  
    __obj.asInstanceOf[Footnote]
  }
}

