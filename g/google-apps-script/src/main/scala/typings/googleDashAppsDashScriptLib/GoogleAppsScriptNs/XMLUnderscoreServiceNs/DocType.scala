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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detach")(detach)
    __obj.updateDynamic("getElementName")(getElementName)
    __obj.updateDynamic("getInternalSubset")(getInternalSubset)
    __obj.updateDynamic("getParentElement")(getParentElement)
    __obj.updateDynamic("getPublicId")(getPublicId)
    __obj.updateDynamic("getSystemId")(getSystemId)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("setElementName")(setElementName)
    __obj.updateDynamic("setInternalSubset")(setInternalSubset)
    __obj.updateDynamic("setPublicId")(setPublicId)
    __obj.updateDynamic("setSystemId")(setSystemId)
    __obj.asInstanceOf[DocType]
  }
}

