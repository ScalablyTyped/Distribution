package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityRef extends js.Object {
  def detach(): Content
  def getName(): java.lang.String
  def getParentElement(): Element
  def getPublicId(): java.lang.String
  def getSystemId(): java.lang.String
  def getValue(): java.lang.String
  def setName(name: java.lang.String): EntityRef
  def setPublicId(id: java.lang.String): EntityRef
  def setSystemId(id: java.lang.String): EntityRef
}

object EntityRef {
  @scala.inline
  def apply(
    detach: () => Content,
    getName: () => java.lang.String,
    getParentElement: () => Element,
    getPublicId: () => java.lang.String,
    getSystemId: () => java.lang.String,
    getValue: () => java.lang.String,
    setName: java.lang.String => EntityRef,
    setPublicId: java.lang.String => EntityRef,
    setSystemId: java.lang.String => EntityRef
  ): EntityRef = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getName = js.Any.fromFunction0(getName), getParentElement = js.Any.fromFunction0(getParentElement), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), getValue = js.Any.fromFunction0(getValue), setName = js.Any.fromFunction1(setName), setPublicId = js.Any.fromFunction1(setPublicId), setSystemId = js.Any.fromFunction1(setSystemId))
  
    __obj.asInstanceOf[EntityRef]
  }
}

