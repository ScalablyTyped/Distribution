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
    detach: js.Function0[Content],
    getElementName: js.Function0[java.lang.String],
    getInternalSubset: js.Function0[java.lang.String],
    getParentElement: js.Function0[Element],
    getPublicId: js.Function0[java.lang.String],
    getSystemId: js.Function0[java.lang.String],
    getValue: js.Function0[java.lang.String],
    setElementName: js.Function1[java.lang.String, DocType],
    setInternalSubset: js.Function1[java.lang.String, DocType],
    setPublicId: js.Function1[java.lang.String, DocType],
    setSystemId: js.Function1[java.lang.String, DocType]
  ): DocType = {
    val __obj = js.Dynamic.literal(detach = detach, getElementName = getElementName, getInternalSubset = getInternalSubset, getParentElement = getParentElement, getPublicId = getPublicId, getSystemId = getSystemId, getValue = getValue, setElementName = setElementName, setInternalSubset = setInternalSubset, setPublicId = setPublicId, setSystemId = setSystemId)
  
    __obj.asInstanceOf[DocType]
  }
}

