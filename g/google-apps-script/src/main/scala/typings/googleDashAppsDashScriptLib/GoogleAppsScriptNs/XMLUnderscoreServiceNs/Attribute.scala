package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  def getName(): java.lang.String
  def getNamespace(): Namespace
  def getValue(): java.lang.String
  def setName(name: java.lang.String): Attribute
  def setNamespace(namespace: Namespace): Attribute
  def setValue(value: java.lang.String): Attribute
}

object Attribute {
  @scala.inline
  def apply(
    getName: js.Function0[java.lang.String],
    getNamespace: js.Function0[Namespace],
    getValue: js.Function0[java.lang.String],
    setName: js.Function1[java.lang.String, Attribute],
    setNamespace: js.Function1[Namespace, Attribute],
    setValue: js.Function1[java.lang.String, Attribute]
  ): Attribute = {
    val __obj = js.Dynamic.literal(getName = getName, getNamespace = getNamespace, getValue = getValue, setName = setName, setNamespace = setNamespace, setValue = setValue)
  
    __obj.asInstanceOf[Attribute]
  }
}

