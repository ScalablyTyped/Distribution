package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlService extends js.Object {
  var ContentTypes: js.Any = js.native
  def createCdata(text: java.lang.String): Cdata = js.native
  def createComment(text: java.lang.String): Comment = js.native
  def createDocType(elementName: java.lang.String): DocType = js.native
  def createDocType(elementName: java.lang.String, publicId: java.lang.String, systemId: java.lang.String): DocType = js.native
  def createDocType(elementName: java.lang.String, systemId: java.lang.String): DocType = js.native
  def createDocument(): Document = js.native
  def createDocument(rootElement: Element): Document = js.native
  def createElement(name: java.lang.String): Element = js.native
  def createElement(name: java.lang.String, namespace: Namespace): Element = js.native
  def createText(text: java.lang.String): Text = js.native
  def getCompactFormat(): Format = js.native
  def getNamespace(prefix: java.lang.String, uri: java.lang.String): Namespace = js.native
  def getNamespace(uri: java.lang.String): Namespace = js.native
  def getNoNamespace(): Namespace = js.native
  def getPrettyFormat(): Format = js.native
  def getRawFormat(): Format = js.native
  def getXmlNamespace(): Namespace = js.native
  def parse(xml: java.lang.String): Document = js.native
}

