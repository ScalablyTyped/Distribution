package typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML attribute.
  *
  *     // Reads the first and last name of each person and adds a new attribute with the full name.
  *     var xml = '<roster>'
  *         + '<person first="John" last="Doe"/>'
  *         + '<person first="Mary" last="Smith"/>'
  *         + '</roster>';
  *     var document = XmlService.parse(xml);
  *     var people = document.getRootElement().getChildren('person');
  *     for (var i = 0; i < people.length; i++) {
  *       var person = people[i];
  *       var firstName = person.getAttribute('first').getValue();
  *       var lastName = person.getAttribute('last').getValue();
  *       person.setAttribute('full', firstName + ' ' + lastName);
  *     }
  *     xml = XmlService.getPrettyFormat().format(document);
  *     Logger.log(xml);
  */
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

