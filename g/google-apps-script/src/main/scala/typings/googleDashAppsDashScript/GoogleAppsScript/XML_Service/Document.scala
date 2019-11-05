package typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service

import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML document.
  */
@js.native
trait Document extends js.Object {
  def addContent(content: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Document = js.native
  def addContent(index: Integer, content: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Document = js.native
  def cloneContent(): js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content] = js.native
  def detachRootElement(): Element = js.native
  def getAllContent(): js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content] = js.native
  def getContent(index: Integer): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content = js.native
  def getContentSize(): Integer = js.native
  def getDescendants(): js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content] = js.native
  def getDocType(): DocType = js.native
  def getRootElement(): Element = js.native
  def hasRootElement(): Boolean = js.native
  def removeContent(): js.Array[typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content] = js.native
  def removeContent(content: typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content): Boolean = js.native
  def removeContent(index: Integer): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Content = js.native
  def setDocType(docType: DocType): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Document = js.native
  def setRootElement(element: Element): typings.googleDashAppsDashScript.GoogleAppsScript.XML_Service.Document = js.native
}

