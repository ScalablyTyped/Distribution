package typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service

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
trait Content extends js.Object {
  def asCdata(): Cdata
  def asComment(): Comment
  def asDocType(): DocType
  def asElement(): Element
  def asEntityRef(): EntityRef
  def asProcessingInstruction(): ProcessingInstruction
  def asText(): Text
  def detach(): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content
  def getParentElement(): Element
  def getType(): ContentType
  def getValue(): String
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
    detach: () => typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content,
    getParentElement: () => Element,
    getType: () => ContentType,
    getValue: () => String
  ): Content = {
    val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getParentElement = js.Any.fromFunction0(getParentElement), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue))
  
    __obj.asInstanceOf[Content]
  }
}

