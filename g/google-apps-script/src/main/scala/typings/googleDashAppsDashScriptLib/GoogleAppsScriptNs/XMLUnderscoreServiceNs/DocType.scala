package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocType extends js.Object {
  def detach(): Content
  def getElementName(): java.lang.String
  def getInternalSubset(): java.lang.String
  def getParentElement(): Element
  def getPublicId(): java.lang.String
  def getSystemId(): java.lang.String
  def getValue(): java.lang.String
  def setElementName(name: java.lang.String): DocType
  def setInternalSubset(data: java.lang.String): DocType
  def setPublicId(id: java.lang.String): DocType
  def setSystemId(id: java.lang.String): DocType
}

object DocType {
  @scala.inline
  def apply(
    detach: () => Content,
    getElementName: () => java.lang.String,
    getInternalSubset: () => java.lang.String,
    getParentElement: () => Element,
    getPublicId: () => java.lang.String,
    getSystemId: () => java.lang.String,
    getValue: () => java.lang.String,
    setElementName: java.lang.String => DocType,
    setInternalSubset: java.lang.String => DocType,
    setPublicId: java.lang.String => DocType,
    setSystemId: java.lang.String => DocType
  ): DocType = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getElementName = js.Any.fromFunction0(getElementName), getInternalSubset = js.Any.fromFunction0(getInternalSubset), getParentElement = js.Any.fromFunction0(getParentElement), getPublicId = js.Any.fromFunction0(getPublicId), getSystemId = js.Any.fromFunction0(getSystemId), getValue = js.Any.fromFunction0(getValue), setElementName = js.Any.fromFunction1(setElementName), setInternalSubset = js.Any.fromFunction1(setInternalSubset), setPublicId = js.Any.fromFunction1(setPublicId), setSystemId = js.Any.fromFunction1(setSystemId))
  
    __obj.asInstanceOf[DocType]
  }
}

