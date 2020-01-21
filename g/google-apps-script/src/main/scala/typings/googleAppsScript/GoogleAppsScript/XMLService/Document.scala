package typings.googleAppsScript.GoogleAppsScript.XMLService

import typings.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an XML document.
  */
@js.native
trait Document extends js.Object {
  def addContent(content: Content): Document = js.native
  def addContent(index: Integer, content: Content): Document = js.native
  def cloneContent(): js.Array[Content] = js.native
  def detachRootElement(): Element = js.native
  def getAllContent(): js.Array[Content] = js.native
  def getContent(index: Integer): Content = js.native
  def getContentSize(): Integer = js.native
  def getDescendants(): js.Array[Content] = js.native
  def getDocType(): DocType = js.native
  def getRootElement(): Element = js.native
  def hasRootElement(): Boolean = js.native
  def removeContent(): js.Array[Content] = js.native
  def removeContent(content: Content): Boolean = js.native
  def removeContent(index: Integer): Content = js.native
  def setDocType(docType: DocType): Document = js.native
  def setRootElement(element: Element): Document = js.native
}

