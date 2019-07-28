package typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attribute extends js.Object {
  def getName(): String
  def getNamespace(): Namespace
  def getValue(): String
  def setName(name: String): Attribute
  def setNamespace(namespace: Namespace): Attribute
  def setValue(value: String): Attribute
}

object Attribute {
  @scala.inline
  def apply(
    getName: () => String,
    getNamespace: () => Namespace,
    getValue: () => String,
    setName: String => Attribute,
    setNamespace: Namespace => Attribute,
    setValue: String => Attribute
  ): Attribute = {
    val __obj = js.Dynamic.literal(getName = js.Any.fromFunction0(getName), getNamespace = js.Any.fromFunction0(getNamespace), getValue = js.Any.fromFunction0(getValue), setName = js.Any.fromFunction1(setName), setNamespace = js.Any.fromFunction1(setNamespace), setValue = js.Any.fromFunction1(setValue))
  
    __obj.asInstanceOf[Attribute]
  }
}

