package typings.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML ProcessingInstruction node.
  */
trait ProcessingInstruction extends Content {
  def getData(): String
  def getTarget(): String
}

object ProcessingInstruction {
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
    getData: () => String,
    getParentElement: () => Element,
    getTarget: () => String,
    getType: () => ContentType,
    getValue: () => String
  ): ProcessingInstruction = {
    val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getData = js.Any.fromFunction0(getData), getParentElement = js.Any.fromFunction0(getParentElement), getTarget = js.Any.fromFunction0(getTarget), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue))
    __obj.asInstanceOf[ProcessingInstruction]
  }
}

