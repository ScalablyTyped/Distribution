package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def addContent(content: Content): Element = js.native
  def addContent(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, content: Content): Element = js.native
  def cloneContent(): js.Array[Content] = js.native
  def detach(): Content = js.native
  def getAllContent(): js.Array[Content] = js.native
  def getAttribute(name: java.lang.String): Attribute = js.native
  def getAttribute(name: java.lang.String, namespace: Namespace): Attribute = js.native
  def getAttributes(): js.Array[Attribute] = js.native
  def getChild(name: java.lang.String): Element = js.native
  def getChild(name: java.lang.String, namespace: Namespace): Element = js.native
  def getChildText(name: java.lang.String): java.lang.String = js.native
  def getChildText(name: java.lang.String, namespace: Namespace): java.lang.String = js.native
  def getChildren(): js.Array[Element] = js.native
  def getChildren(name: java.lang.String): js.Array[Element] = js.native
  def getChildren(name: java.lang.String, namespace: Namespace): js.Array[Element] = js.native
  def getContent(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Content = js.native
  def getContentSize(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getDescendants(): js.Array[Content] = js.native
  def getDocument(): Document = js.native
  def getName(): java.lang.String = js.native
  def getNamespace(): Namespace = js.native
  def getNamespace(prefix: java.lang.String): Namespace = js.native
  def getParentElement(): Element = js.native
  def getQualifiedName(): java.lang.String = js.native
  def getText(): java.lang.String = js.native
  def getValue(): java.lang.String = js.native
  def isAncestorOf(other: Element): scala.Boolean = js.native
  def isRootElement(): scala.Boolean = js.native
  def removeAttribute(attributeName: java.lang.String): scala.Boolean = js.native
  def removeAttribute(attributeName: java.lang.String, namespace: Namespace): scala.Boolean = js.native
  def removeAttribute(attribute: Attribute): scala.Boolean = js.native
  def removeContent(): js.Array[Content] = js.native
  def removeContent(content: Content): scala.Boolean = js.native
  def removeContent(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Content = js.native
  def setAttribute(attribute: Attribute): Element = js.native
  def setAttribute(name: java.lang.String, value: java.lang.String): Element = js.native
  def setAttribute(name: java.lang.String, value: java.lang.String, namespace: Namespace): Element = js.native
  def setName(name: java.lang.String): Element = js.native
  def setNamespace(namespace: Namespace): Element = js.native
  def setText(text: java.lang.String): Element = js.native
}

