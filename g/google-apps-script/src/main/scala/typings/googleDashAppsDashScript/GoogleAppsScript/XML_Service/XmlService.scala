package typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service allows scripts to parse, navigate, and programmatically create XML documents.
  *
  *     // Log the title and labels for the first page of blog posts on the G Suite Developer blog.
  *     function parseXml() {
  *       var url = 'https://gsuite-developers.googleblog.com/atom.xml';
  *       var xml = UrlFetchApp.fetch(url).getContentText();
  *       var document = XmlService.parse(xml);
  *       var root = document.getRootElement();
  *       var atom = XmlService.getNamespace('http://www.w3.org/2005/Atom');
  *
  *       var entries = root.getChildren('entry', atom);
  *       for (var i = 0; i < entries.length; i++) {
  *         var title = entries[i].getChild('title', atom).getText();
  *         var categoryElements = entries[i].getChildren('category', atom);
  *         var labels = [];
  *         for (var j = 0; j < categoryElements.length; j++) {
  *           labels.push(categoryElements[j].getAttribute('term').getValue());
  *         }
  *         Logger.log('%s (%s)', title, labels.join(', '));
  *       }
  *     }
  *
  *     // Create and log an XML representation of the threads in your Gmail inbox.
  *     function createXml() {
  *       var root = XmlService.createElement('threads');
  *       var threads = GmailApp.getInboxThreads();
  *       for (var i = 0; i < threads.length; i++) {
  *         var child = XmlService.createElement('thread')
  *             .setAttribute('messageCount', threads[i].getMessageCount())
  *             .setAttribute('isUnread', threads[i].isUnread())
  *             .setText(threads[i].getFirstMessageSubject());
  *         root.addContent(child);
  *       }
  *       var document = XmlService.createDocument(root);
  *       var xml = XmlService.getPrettyFormat().format(document);
  *       Logger.log(xml);
  *     }
  */
@js.native
trait XmlService extends js.Object {
  var ContentTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ContentType */ js.Any = js.native
  def createCdata(text: String): Cdata = js.native
  def createComment(text: String): Comment = js.native
  def createDocType(elementName: String): DocType = js.native
  def createDocType(elementName: String, publicId: String, systemId: String): DocType = js.native
  def createDocType(elementName: String, systemId: String): DocType = js.native
  def createDocument(): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Document = js.native
  def createDocument(rootElement: Element): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Document = js.native
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
  def parse(xml: String): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Document = js.native
}

