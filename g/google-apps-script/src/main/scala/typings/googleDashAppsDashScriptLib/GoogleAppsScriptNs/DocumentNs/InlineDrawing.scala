package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InlineDrawing extends js.Object {
  def copy(): InlineDrawing
  def getAltDescription(): java.lang.String
  def getAltTitle(): java.lang.String
  def getAttributes(): js.Object
  def getNextSibling(): Element
  def getParent(): ContainerElement
  def getPreviousSibling(): Element
  def getType(): ElementType
  def isAtDocumentEnd(): scala.Boolean
  def merge(): InlineDrawing
  def removeFromParent(): InlineDrawing
  def setAltDescription(description: java.lang.String): InlineDrawing
  def setAltTitle(title: java.lang.String): InlineDrawing
  def setAttributes(attributes: js.Object): InlineDrawing
}

object InlineDrawing {
  @scala.inline
  def apply(
    copy: js.Function0[InlineDrawing],
    getAltDescription: js.Function0[java.lang.String],
    getAltTitle: js.Function0[java.lang.String],
    getAttributes: js.Function0[js.Object],
    getNextSibling: js.Function0[Element],
    getParent: js.Function0[ContainerElement],
    getPreviousSibling: js.Function0[Element],
    getType: js.Function0[ElementType],
    isAtDocumentEnd: js.Function0[scala.Boolean],
    merge: js.Function0[InlineDrawing],
    removeFromParent: js.Function0[InlineDrawing],
    setAltDescription: js.Function1[java.lang.String, InlineDrawing],
    setAltTitle: js.Function1[java.lang.String, InlineDrawing],
    setAttributes: js.Function1[js.Object, InlineDrawing]
  ): InlineDrawing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy)
    __obj.updateDynamic("getAltDescription")(getAltDescription)
    __obj.updateDynamic("getAltTitle")(getAltTitle)
    __obj.updateDynamic("getAttributes")(getAttributes)
    __obj.updateDynamic("getNextSibling")(getNextSibling)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getPreviousSibling")(getPreviousSibling)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("isAtDocumentEnd")(isAtDocumentEnd)
    __obj.updateDynamic("merge")(merge)
    __obj.updateDynamic("removeFromParent")(removeFromParent)
    __obj.updateDynamic("setAltDescription")(setAltDescription)
    __obj.updateDynamic("setAltTitle")(setAltTitle)
    __obj.updateDynamic("setAttributes")(setAttributes)
    __obj.asInstanceOf[InlineDrawing]
  }
}

