package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  def addColumn(name: java.lang.String): Column = js.native
  def addComment(content: java.lang.String): Comment = js.native
  def addHostedAttachment(blob: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): Attachment = js.native
  def addHostedAttachment(
    blob: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource,
    description: java.lang.String
  ): Attachment = js.native
  def addListItem(values: js.Array[java.lang.String]): ListItem = js.native
  def addWebAttachment(title: java.lang.String, description: java.lang.String, url: java.lang.String): Attachment = js.native
  def createAnnouncement(title: java.lang.String, html: java.lang.String): Page = js.native
  def createAnnouncement(title: java.lang.String, html: java.lang.String, asDraft: scala.Boolean): Page = js.native
  def createAnnouncementsPage(title: java.lang.String, name: java.lang.String, html: java.lang.String): Page = js.native
  def createFileCabinetPage(title: java.lang.String, name: java.lang.String, html: java.lang.String): Page = js.native
  def createListPage(
    title: java.lang.String,
    name: java.lang.String,
    html: java.lang.String,
    columnNames: js.Array[java.lang.String]
  ): Page = js.native
  def createPageFromTemplate(title: java.lang.String, name: java.lang.String, template: Page): Page = js.native
  def createWebPage(title: java.lang.String, name: java.lang.String, html: java.lang.String): Page = js.native
  def deletePage(): scala.Unit = js.native
  def getAllDescendants(): js.Array[Page] = js.native
  def getAllDescendants(options: js.Any): js.Array[Page] = js.native
  def getAnnouncements(): js.Array[Page] = js.native
  def getAnnouncements(optOptions: js.Any): js.Array[Page] = js.native
  def getAttachments(): js.Array[Attachment] = js.native
  def getAttachments(optOptions: js.Any): js.Array[Attachment] = js.native
  def getAuthors(): js.Array[java.lang.String] = js.native
  def getChildByName(name: java.lang.String): Page = js.native
  def getChildren(): js.Array[Page] = js.native
  def getChildren(options: js.Any): js.Array[Page] = js.native
  def getColumns(): js.Array[Column] = js.native
  def getComments(): js.Array[Comment] = js.native
  def getComments(optOptions: js.Any): js.Array[Comment] = js.native
  def getDatePublished(): stdLib.Date = js.native
  def getHtmlContent(): java.lang.String = js.native
  def getIsDraft(): scala.Boolean = js.native
  def getLastEdited(): stdLib.Date = js.native
  def getLastUpdated(): stdLib.Date = js.native
  def getListItems(): js.Array[ListItem] = js.native
  def getListItems(optOptions: js.Any): js.Array[ListItem] = js.native
  def getName(): java.lang.String = js.native
  def getPageName(): java.lang.String = js.native
  def getPageType(): PageType = js.native
  def getParent(): Page = js.native
  def getSelfLink(): java.lang.String = js.native
  def getTextContent(): java.lang.String = js.native
  def getTitle(): java.lang.String = js.native
  def getUrl(): java.lang.String = js.native
  def isDeleted(): scala.Boolean = js.native
  def isTemplate(): scala.Boolean = js.native
  def publishAsTemplate(name: java.lang.String): Page = js.native
  def search(query: java.lang.String): js.Array[Page] = js.native
  def search(query: java.lang.String, options: js.Any): js.Array[Page] = js.native
  def setHtmlContent(html: java.lang.String): Page = js.native
  def setIsDraft(draft: scala.Boolean): Page = js.native
  def setName(name: java.lang.String): Page = js.native
  def setParent(parent: Page): Page = js.native
  def setTitle(title: java.lang.String): Page = js.native
}

