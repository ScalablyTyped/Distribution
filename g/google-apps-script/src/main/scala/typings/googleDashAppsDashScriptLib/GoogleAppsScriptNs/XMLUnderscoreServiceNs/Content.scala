package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  def asCdata(): Cdata
  def asComment(): Comment
  def asDocType(): DocType
  def asElement(): Element
  def asEntityRef(): EntityRef
  def asProcessingInstruction(): ProcessingInstruction
  def asText(): Text
  def detach(): Content
  def getParentElement(): Element
  def getType(): ContentType
  def getValue(): java.lang.String
}

object Content {
  @scala.inline
  def apply(
    asCdata: js.Function0[Cdata],
    asComment: js.Function0[Comment],
    asDocType: js.Function0[DocType],
    asElement: js.Function0[Element],
    asEntityRef: js.Function0[EntityRef],
    asProcessingInstruction: js.Function0[ProcessingInstruction],
    asText: js.Function0[Text],
    detach: js.Function0[Content],
    getParentElement: js.Function0[Element],
    getType: js.Function0[ContentType],
    getValue: js.Function0[java.lang.String]
  ): Content = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asCdata")(asCdata)
    __obj.updateDynamic("asComment")(asComment)
    __obj.updateDynamic("asDocType")(asDocType)
    __obj.updateDynamic("asElement")(asElement)
    __obj.updateDynamic("asEntityRef")(asEntityRef)
    __obj.updateDynamic("asProcessingInstruction")(asProcessingInstruction)
    __obj.updateDynamic("asText")(asText)
    __obj.updateDynamic("detach")(detach)
    __obj.updateDynamic("getParentElement")(getParentElement)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("getValue")(getValue)
    __obj.asInstanceOf[Content]
  }
}

