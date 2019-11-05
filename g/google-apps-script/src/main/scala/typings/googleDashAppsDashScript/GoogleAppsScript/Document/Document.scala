package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A document, containing rich text and elements such as tables and lists.
  *
  * Documents may be opened or created using DocumentApp.
  *
  *     // Open a document by ID.
  *     var doc = DocumentApp.openById("<my-id>");
  *
  *     // Create and open a document.
  *     doc = DocumentApp.create("Document Title");
  */
@js.native
trait Document extends js.Object {
  def addBookmark(position: Position): Bookmark = js.native
  def addEditor(emailAddress: String): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def addEditor(user: User): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def addEditors(emailAddresses: js.Array[String]): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def addFooter(): FooterSection = js.native
  def addHeader(): HeaderSection = js.native
  def addNamedRange(name: String, range: Range): NamedRange = js.native
  def addViewer(emailAddress: String): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def addViewer(user: User): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def addViewers(emailAddresses: js.Array[String]): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def getAs(contentType: String): Blob = js.native
  def getBlob(): Blob = js.native
  def getBody(): Body = js.native
  def getBookmark(id: String): Bookmark = js.native
  def getBookmarks(): js.Array[Bookmark] = js.native
  def getCursor(): Position = js.native
  def getEditors(): js.Array[User] = js.native
  def getFooter(): FooterSection = js.native
  def getFootnotes(): js.Array[Footnote] = js.native
  def getHeader(): HeaderSection = js.native
  def getId(): String = js.native
  def getLanguage(): String = js.native
  def getName(): String = js.native
  def getNamedRangeById(id: String): NamedRange = js.native
  def getNamedRanges(): js.Array[NamedRange] = js.native
  def getNamedRanges(name: String): js.Array[NamedRange] = js.native
  def getSelection(): Range = js.native
  def getSupportedLanguageCodes(): js.Array[String] = js.native
  def getUrl(): String = js.native
  def getViewers(): js.Array[User] = js.native
  def newPosition(element: Element, offset: Integer): Position = js.native
  def newRange(): RangeBuilder = js.native
  def removeEditor(emailAddress: String): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def removeEditor(user: User): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def removeViewer(emailAddress: String): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def removeViewer(user: User): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def saveAndClose(): Unit = js.native
  def setCursor(position: Position): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def setLanguage(languageCode: String): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def setName(name: String): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
  def setSelection(range: Range): typings.googleDashAppsDashScript.GoogleAppsScript.Document.Document = js.native
}

