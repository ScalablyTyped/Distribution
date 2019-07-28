package typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlService extends js.Object {
  var ContentTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any = js.native
  def createCdata(text: String): Cdata = js.native
  def createComment(text: String): Comment = js.native
  def createDocType(elementName: String): DocType = js.native
  def createDocType(elementName: String, publicId: String, systemId: String): DocType = js.native
  def createDocType(elementName: String, systemId: String): DocType = js.native
  def createDocument(): Document = js.native
  def createDocument(rootElement: Element): Document = js.native
  def createElement(name: String): Element = js.native
  def createElement(name: String, namespace: Namespace): Element = js.native
  def createText(text: String): Text = js.native
  def getCompactFormat(): Format = js.native
  def getNamespace(prefix: String, uri: String): Namespace = js.native
  def getNamespace(uri: String): Namespace = js.native
  def getNoNamespace(): Namespace = js.native
  def getPrettyFormat(): Format = js.native
  def getRawFormat(): Format = js.native
  def getXmlNamespace(): Namespace = js.native
  def parse(xml: String): Document = js.native
}

