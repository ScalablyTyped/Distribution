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
    detach: js.Function0[Content],
    getName: js.Function0[java.lang.String],
    getParentElement: js.Function0[Element],
    getPublicId: js.Function0[java.lang.String],
    getSystemId: js.Function0[java.lang.String],
    getValue: js.Function0[java.lang.String],
    setName: js.Function1[java.lang.String, EntityRef],
    setPublicId: js.Function1[java.lang.String, EntityRef],
    setSystemId: js.Function1[java.lang.String, EntityRef]
  ): EntityRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detach")(detach)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParentElement")(getParentElement)
    __obj.updateDynamic("getPublicId")(getPublicId)
    __obj.updateDynamic("getSystemId")(getSystemId)
    __obj.updateDynamic("getValue")(getValue)
    __obj.updateDynamic("setName")(setName)
    __obj.updateDynamic("setPublicId")(setPublicId)
    __obj.updateDynamic("setSystemId")(setSystemId)
    __obj.asInstanceOf[EntityRef]
  }
}

