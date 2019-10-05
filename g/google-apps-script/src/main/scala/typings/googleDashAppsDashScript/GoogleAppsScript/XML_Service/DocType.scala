package typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocType extends js.Object {
  def detach(): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content
  def getElementName(): String
  def getInternalSubset(): String
  def getParentElement(): Element
  def getPublicId(): String
  def getSystemId(): String
  def getValue(): String
  def setElementName(name: String): DocType
  def setInternalSubset(data: String): DocType
  def setPublicId(id: String): DocType
  def setSystemId(id: String): DocType
}

object DocType {
  @scala.inline
  def apply(
    detach: () => typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content,
    getElementName: () => String,
    getInternalSubset: () => String,
    getParentElement: () => Element,
    getPublicId: () => String,
    getSystemId: () => String,
    getValue: () => String,
    setElementName: String => DocType,
    setInternalSubset: String => DocType,
    setPublicId: String => DocType,
    setSystemId: String => DocType
  ): DocType = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getElementName = js.Any.fromFunction0(getElementName), getInternalSubset = js.Any.fromFunction0(getInternalSubset), getParentElement = js.Any.fromFunction0(getParentElement), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), getValue = js.Any.fromFunction0(getValue), setElementName = js.Any.fromFunction1(setElementName), setInternalSubset = js.Any.fromFunction1(setInternalSubset), setPublicId = js.Any.fromFunction1(setPublicId), setSystemId = js.Any.fromFunction1(setSystemId))
  
    __obj.asInstanceOf[DocType]
  }
}

