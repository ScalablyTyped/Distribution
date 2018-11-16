package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  def addContent(content: Content): Document = js.native
  def addContent(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, content: Content): Document = js.native
  def cloneContent(): js.Array[Content] = js.native
  def detachRootElement(): Element = js.native
  def getAllContent(): js.Array[Content] = js.native
  def getContent(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Content = js.native
  def getContentSize(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer = js.native
  def getDescendants(): js.Array[Content] = js.native
  def getDocType(): DocType = js.native
  def getRootElement(): Element = js.native
  def hasRootElement(): scala.Boolean = js.native
  def removeContent(): js.Array[Content] = js.native
  def removeContent(content: Content): scala.Boolean = js.native
  def removeContent(index: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Content = js.native
  def setDocType(docType: DocType): Document = js.native
  def setRootElement(element: Element): Document = js.native
}

