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
    getName: () => java.lang.String,
    getNamespace: () => Namespace,
    getValue: () => java.lang.String,
    setName: java.lang.String => Attribute,
    setNamespace: Namespace => Attribute,
    setValue: java.lang.String => Attribute
  ): Attribute = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), getNamespace = js.Any.fromFunction0(getNamespace), getValue = js.Any.fromFunction0(getValue), setName = js.Any.fromFunction1(setName), setNamespace = js.Any.fromFunction1(setNamespace), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[Attribute]
  }
}

