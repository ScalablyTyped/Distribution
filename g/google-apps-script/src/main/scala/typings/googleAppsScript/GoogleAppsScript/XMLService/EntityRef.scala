package typings.googleAppsScript.GoogleAppsScript.XMLService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML EntityReference node.
  */
trait EntityRef extends Content {
  def getName(): String
  def getPublicId(): String
  def getSystemId(): String
  def setName(name: String): EntityRef
  def setPublicId(id: String): EntityRef
  def setSystemId(id: String): EntityRef
}

object EntityRef {
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
    getName: () => String,
    getParentElement: () => Element,
    getPublicId: () => String,
    getSystemId: () => String,
    getType: () => ContentType,
    getValue: () => String,
    setName: String => EntityRef,
    setPublicId: String => EntityRef,
    setSystemId: String => EntityRef
  ): EntityRef = {
    val __obj = js.Dynamic.literal(asCdata = js.Any.fromFunction0(asCdata), asComment = js.Any.fromFunction0(asComment), asDocType = js.Any.fromFunction0(asDocType), asElement = js.Any.fromFunction0(asElement), asEntityRef = js.Any.fromFunction0(asEntityRef), asProcessingInstruction = js.Any.fromFunction0(asProcessingInstruction), asText = js.Any.fromFunction0(asText), detach = js.Any.fromFunction0(detach), getName = js.Any.fromFunction0(getName), getParentElement = js.Any.fromFunction0(getParentElement), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), getType = js.Any.fromFunction0(getType), getValue = js.Any.fromFunction0(getValue), setName = js.Any.fromFunction1(setName), setPublicId = js.Any.fromFunction1(setPublicId), setSystemId = js.Any.fromFunction1(setSystemId))
  
    __obj.asInstanceOf[EntityRef]
  }
}

