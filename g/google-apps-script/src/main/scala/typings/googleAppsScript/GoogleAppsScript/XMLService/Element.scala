package typings.googleAppsScript.GoogleAppsScript.XMLService

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A representation of an XML Element node.
  *
  *     // Adds up the values listed in a sample XML document and adds a new element with the total.
  *     var xml = '<things>'
  *         + '<plates>12</plates>'
  *         + '<bowls>18</bowls>'
  *         + '<cups>25</cups>'
  *         + '</things>';
  *     var document = XmlService.parse(xml);
  *     var root = document.getRootElement();
  *     var items = root.getChildren();
  *     var total = 0;
  *     for (var i = 0; i < items.length; i++) {
  *       total += Number(items[i].getText());
  *     }
  *     var totalElement = XmlService.createElement('total').setText(total);
  *     root.addContent(totalElement);
  *     xml = XmlService.getPrettyFormat().format(document);
  *     Logger.log(xml);
  */
@js.native
trait Element extends Content {
  
  def addContent(content: Content): Element = js.native
  def addContent(index: Integer, content: Content): Element = js.native
  
  def cloneContent(): js.Array[Content] = js.native
  
  def getAllContent(): js.Array[Content] = js.native
  
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
  
  def getContent(index: Integer): Content = js.native
  
  def getContentSize(): Integer = js.native
  
  def getDescendants(): js.Array[Content] = js.native
  
  def getDocument(): Document = js.native
  
  def getName(): String = js.native
  
  def getNamespace(): Namespace = js.native
  def getNamespace(prefix: String): Namespace = js.native
  
  def getQualifiedName(): String = js.native
  
  def getText(): String = js.native
  
  def isAncestorOf(other: Element): Boolean = js.native
  
  def isRootElement(): Boolean = js.native
  
  def removeAttribute(attributeName: String): Boolean = js.native
  def removeAttribute(attributeName: String, namespace: Namespace): Boolean = js.native
  def removeAttribute(attribute: Attribute): Boolean = js.native
  
  def removeContent(): js.Array[Content] = js.native
  def removeContent(content: Content): Boolean = js.native
  def removeContent(index: Integer): Content = js.native
  
  def setAttribute(attribute: Attribute): Element = js.native
  def setAttribute(name: String, value: String): Element = js.native
  def setAttribute(name: String, value: String, namespace: Namespace): Element = js.native
  
  def setName(name: String): Element = js.native
  
  def setNamespace(namespace: Namespace): Element = js.native
  
  def setText(text: String): Element = js.native
}
