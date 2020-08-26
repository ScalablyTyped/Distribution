package typings.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of a generic XML node.
  * Implementing classes
  *
  * NameBrief description
  *
  * CdataA representation of an XML CDATASection node.
  *
  * CommentA representation of an XML Comment node.
  *
  * DocTypeA representation of an XML DocumentType node.
  *
  * ElementA representation of an XML Element node.
  *
  * EntityRefA representation of an XML EntityReference node.
  *
  * ProcessingInstructionA representation of an XML ProcessingInstruction node.
  *
  * TextA representation of an XML Text node.
  */
@js.native
trait Content extends js.Object {
  def asCdata(): Cdata = js.native
  def asComment(): Comment = js.native
  def asDocType(): DocType = js.native
  def asElement(): Element = js.native
  def asEntityRef(): EntityRef = js.native
  def asProcessingInstruction(): ProcessingInstruction = js.native
  def asText(): Text = js.native
  def detach(): Content = js.native
  def getParentElement(): Element = js.native
  def getType(): ContentType = js.native
  def getValue(): String = js.native
}

object Content {
  @scala.inline
  def apply(
    asCdata: () => Cdata,
    asComment: () => Comment,
    asDocType: () => DocType,
    asElement: () => Element,
    asEntityRef: () => EntityRef,
    asProcessingInstruction: () => ProcessingInstruction,
    asText: () => Text,
    detach: () => Content,
    getParentElement: () => Element,
    getType: () => ContentType,
    getValue: () => String
  ): Content = {
    val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[Content]
  }
  @scala.inline
  implicit class ContentOps[Self <: Content] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsCdata(value: () => Cdata): Self = this.set("asCdata", js.Any.fromFunction0(value))
    @scala.inline
    def setAsComment(value: () => Comment): Self = this.set("asComment", js.Any.fromFunction0(value))
    @scala.inline
    def setAsDocType(value: () => DocType): Self = this.set("asDocType", js.Any.fromFunction0(value))
    @scala.inline
    def setAsElement(value: () => Element): Self = this.set("asElement", js.Any.fromFunction0(value))
    @scala.inline
    def setAsEntityRef(value: () => EntityRef): Self = this.set("asEntityRef", js.Any.fromFunction0(value))
    @scala.inline
    def setAsProcessingInstruction(value: () => ProcessingInstruction): Self = this.set("asProcessingInstruction", js.Any.fromFunction0(value))
    @scala.inline
    def setAsText(value: () => Text): Self = this.set("asText", js.Any.fromFunction0(value))
    @scala.inline
    def setDetach(value: () => Content): Self = this.set("detach", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParentElement(value: () => Element): Self = this.set("getParentElement", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => ContentType): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValue(value: () => String): Self = this.set("getValue", js.Any.fromFunction0(value))
  }
  
}

