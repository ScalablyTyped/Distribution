package typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityRef extends js.Object {
  def detach(): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content
  def getName(): String
  def getParentElement(): Element
  def getPublicId(): String
  def getSystemId(): String
  def getValue(): String
  def setName(name: String): EntityRef
  def setPublicId(id: String): EntityRef
  def setSystemId(id: String): EntityRef
}

object EntityRef {
  @scala.inline
  def apply(
    detach: () => typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content,
    getName: () => String,
    getParentElement: () => Element,
    getPublicId: () => String,
    getSystemId: () => String,
    getValue: () => String,
    setName: String => EntityRef,
    setPublicId: String => EntityRef,
    setSystemId: String => EntityRef
  ): EntityRef = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getName = js.Any.fromFunction0(getName), getParentElement = js.Any.fromFunction0(getParentElement), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), getValue = js.Any.fromFunction0(getValue), setName = js.Any.fromFunction1(setName), setPublicId = js.Any.fromFunction1(setPublicId), setSystemId = js.Any.fromFunction1(setSystemId))
  
    __obj.asInstanceOf[EntityRef]
  }
}

