package typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def addContent(content: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content): Element = js.native
  def addContent(index: Integer, content: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content): Element = js.native
  def cloneContent(): js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content] = js.native
  def detach(): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content = js.native
  def getAllContent(): js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content] = js.native
  def getAttribute(name: String): Attribute = js.native
  def getAttribute(name: String, namespace: Namespace): Attribute = js.native
  def getAttributes(): js.Array[Attribute] = js.native
  def getChild(name: String): Element = js.native
  def getChild(name: String, namespace: Namespace): Element = js.native
  def getChildText(name: String): String = js.native
  def getChildText(name: String, namespace: Namespace): String = js.native
  def getChildren(): js.Array[Element] = js.native
  def getChildren(name: String): js.Array[Element] = js.native
  def getChildren(name: String, namespace: Namespace): js.Array[Element] = js.native
  def getContent(index: Integer): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content = js.native
  def getContentSize(): Integer = js.native
  def getDescendants(): js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content] = js.native
  def getDocument(): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Document = js.native
  def getName(): String = js.native
  def getNamespace(): Namespace = js.native
  def getNamespace(prefix: String): Namespace = js.native
  def getParentElement(): Element = js.native
  def getQualifiedName(): String = js.native
  def getText(): String = js.native
  def getValue(): String = js.native
  def isAncestorOf(other: Element): Boolean = js.native
  def isRootElement(): Boolean = js.native
  def removeAttribute(attributeName: String): Boolean = js.native
  def removeAttribute(attributeName: String, namespace: Namespace): Boolean = js.native
  def removeAttribute(attribute: Attribute): Boolean = js.native
  def removeContent(): js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content] = js.native
  def removeContent(content: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content): Boolean = js.native
  def removeContent(index: Integer): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content = js.native
  def setAttribute(attribute: Attribute): Element = js.native
  def setAttribute(name: String, value: String): Element = js.native
  def setAttribute(name: String, value: String, namespace: Namespace): Element = js.native
  def setName(name: String): Element = js.native
  def setNamespace(namespace: Namespace): Element = js.native
  def setText(text: String): Element = js.native
}

