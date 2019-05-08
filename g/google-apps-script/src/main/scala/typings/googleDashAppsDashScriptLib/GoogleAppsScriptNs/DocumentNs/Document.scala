package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocumentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Document extends js.Object {
  def addBookmark(position: Position): Bookmark = js.native
  def addEditor(emailAddress: java.lang.String): Document = js.native
  def addEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Document = js.native
  def addEditors(emailAddresses: js.Array[java.lang.String]): Document = js.native
  def addFooter(): FooterSection = js.native
  def addHeader(): HeaderSection = js.native
  def addNamedRange(name: java.lang.String, range: Range): NamedRange = js.native
  def addViewer(emailAddress: java.lang.String): Document = js.native
  def addViewer(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Document = js.native
  def addViewers(emailAddresses: js.Array[java.lang.String]): Document = js.native
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob = js.native
  def getBody(): Body = js.native
  def getBookmark(id: java.lang.String): Bookmark = js.native
  def getBookmarks(): js.Array[Bookmark] = js.native
  def getCursor(): Position = js.native
  def getEditors(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def getFooter(): FooterSection = js.native
  def getFootnotes(): js.Array[Footnote] = js.native
  def getHeader(): HeaderSection = js.native
  def getId(): java.lang.String = js.native
  def getLanguage(): java.lang.String = js.native
  def getName(): java.lang.String = js.native
  def getNamedRangeById(id: java.lang.String): NamedRange = js.native
  def getNamedRanges(): js.Array[NamedRange] = js.native
  def getNamedRanges(name: java.lang.String): js.Array[NamedRange] = js.native
  def getSelection(): Range = js.native
  def getSupportedLanguageCodes(): js.Array[java.lang.String] = js.native
  def getUrl(): java.lang.String = js.native
  def getViewers(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def newPosition(element: Element, offset: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): Position = js.native
  def newRange(): RangeBuilder = js.native
  def removeEditor(emailAddress: java.lang.String): Document = js.native
  def removeEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Document = js.native
  def removeViewer(emailAddress: java.lang.String): Document = js.native
  def removeViewer(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Document = js.native
  def saveAndClose(): scala.Unit = js.native
  def setCursor(position: Position): Document = js.native
  def setLanguage(languageCode: java.lang.String): Document = js.native
  def setName(name: java.lang.String): Document = js.native
  def setSelection(range: Range): Document = js.native
}

