package typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  def addContent(content: typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.Content): Document = js.native
  def addContent(
    index: Integer,
    content: typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.Content
  ): Document = js.native
  def cloneContent(): js.Array[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.Content
  ] = js.native
  def detachRootElement(): Element = js.native
  def getAllContent(): js.Array[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.Content
  ] = js.native
  def getContent(index: Integer): typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.Content = js.native
  def getContentSize(): Integer = js.native
  def getDescendants(): js.Array[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.Content
  ] = js.native
  def getDocType(): DocType = js.native
  def getRootElement(): Element = js.native
  def hasRootElement(): Boolean = js.native
  def removeContent(): js.Array[
    typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.Content
  ] = js.native
  def removeContent(content: typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.Content): Boolean = js.native
  def removeContent(index: Integer): typings.googleDashAppsDashScript.GoogleAppsScriptNs.XMLUnderscoreServiceNs.Content = js.native
  def setDocType(docType: DocType): Document = js.native
  def setRootElement(element: Element): Document = js.native
}

