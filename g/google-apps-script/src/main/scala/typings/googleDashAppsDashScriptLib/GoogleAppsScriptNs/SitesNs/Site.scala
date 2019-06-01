package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site extends js.Object {
  def addCollaborator(email: java.lang.String): Site = js.native
  def addCollaborator(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Site = js.native
  def addEditor(emailAddress: java.lang.String): Site = js.native
  def addEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Site = js.native
  def addEditors(emailAddresses: js.Array[java.lang.String]): Site = js.native
  def addOwner(email: java.lang.String): Site = js.native
  def addOwner(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Site = js.native
  def addViewer(emailAddress: java.lang.String): Site = js.native
  def addViewer(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Site = js.native
  def addViewers(emailAddresses: js.Array[java.lang.String]): Site = js.native
  def createAnnouncement(title: java.lang.String, html: java.lang.String, parent: Page): Page = js.native
  def createAnnouncementsPage(title: java.lang.String, name: java.lang.String, html: java.lang.String): Page = js.native
  def createComment(inReplyTo: java.lang.String, html: java.lang.String, parent: Page): Comment = js.native
  def createFileCabinetPage(title: java.lang.String, name: java.lang.String, html: java.lang.String): Page = js.native
  def createListItem(
    html: java.lang.String,
    columnNames: js.Array[java.lang.String],
    values: js.Array[java.lang.String],
    parent: Page
  ): ListItem = js.native
  def createListPage(
    title: java.lang.String,
    name: java.lang.String,
    html: java.lang.String,
    columnNames: js.Array[java.lang.String]
  ): Page = js.native
  def createPageFromTemplate(title: java.lang.String, name: java.lang.String, template: Page): Page = js.native
  def createWebAttachment(title: java.lang.String, url: java.lang.String, parent: Page): Attachment = js.native
  def createWebPage(title: java.lang.String, name: java.lang.String, html: java.lang.String): Page = js.native
  def deleteSite(): scala.Unit = js.native
  def getAllDescendants(): js.Array[Page] = js.native
  def getAllDescendants(options: js.Any): js.Array[Page] = js.native
  def getAnnouncements(): js.Array[Page] = js.native
  def getAnnouncementsPages(): js.Array[Page] = js.native
  def getAttachments(): js.Array[Attachment] = js.native
  def getChildByName(name: java.lang.String): Page = js.native
  def getChildren(): js.Array[Page] = js.native
  def getChildren(options: js.Any): js.Array[Page] = js.native
  def getCollaborators(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def getComments(): js.Array[Comment] = js.native
  def getEditors(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def getFileCabinetPages(): js.Array[Page] = js.native
  def getListItems(): js.Array[ListItem] = js.native
  def getListPages(): js.Array[Page] = js.native
  def getName(): java.lang.String = js.native
  def getOwners(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def getSelfLink(): java.lang.String = js.native
  def getSiteName(): java.lang.String = js.native
  def getSummary(): java.lang.String = js.native
  def getTemplates(): js.Array[Page] = js.native
  def getTheme(): java.lang.String = js.native
  def getTitle(): java.lang.String = js.native
  def getUrl(): java.lang.String = js.native
  def getViewers(): js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User] = js.native
  def getWebAttachments(): js.Array[Attachment] = js.native
  def getWebPages(): js.Array[Page] = js.native
  def removeCollaborator(email: java.lang.String): Site = js.native
  def removeCollaborator(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Site = js.native
  def removeEditor(emailAddress: java.lang.String): Site = js.native
  def removeEditor(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Site = js.native
  def removeOwner(email: java.lang.String): Site = js.native
  def removeOwner(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Site = js.native
  def removeViewer(emailAddress: java.lang.String): Site = js.native
  def removeViewer(user: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.User): Site = js.native
  def search(query: java.lang.String): js.Array[Page] = js.native
  def search(query: java.lang.String, options: js.Any): js.Array[Page] = js.native
  def setSummary(summary: java.lang.String): Site = js.native
  def setTheme(theme: java.lang.String): Site = js.native
  def setTitle(title: java.lang.String): Site = js.native
}

