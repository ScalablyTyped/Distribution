package typings.googleDashAppsDashScript.GoogleAppsScript.Sites

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Site extends js.Object {
  /** @deprecated DO NOT USE */
  def addCollaborator(email: String): Site = js.native
  /** @deprecated DO NOT USE */
  def addCollaborator(user: User): Site = js.native
  def addEditor(emailAddress: String): Site = js.native
  def addEditor(user: User): Site = js.native
  def addEditors(emailAddresses: js.Array[String]): Site = js.native
  def addOwner(email: String): Site = js.native
  def addOwner(user: User): Site = js.native
  def addViewer(emailAddress: String): Site = js.native
  def addViewer(user: User): Site = js.native
  def addViewers(emailAddresses: js.Array[String]): Site = js.native
  /** @deprecated DO NOT USE */
  def createAnnouncement(title: String, html: String, parent: Page): Page = js.native
  def createAnnouncementsPage(title: String, name: String, html: String): Page = js.native
  /** @deprecated DO NOT USE */
  def createComment(inReplyTo: String, html: String, parent: Page): Comment = js.native
  def createFileCabinetPage(title: String, name: String, html: String): Page = js.native
  /** @deprecated DO NOT USE */
  def createListItem(html: String, columnNames: js.Array[String], values: js.Array[String], parent: Page): ListItem = js.native
  def createListPage(title: String, name: String, html: String, columnNames: js.Array[String]): Page = js.native
  def createPageFromTemplate(title: String, name: String, template: Page): Page = js.native
  /** @deprecated DO NOT USE */
  def createWebAttachment(title: String, url: String, parent: Page): Attachment = js.native
  def createWebPage(title: String, name: String, html: String): Page = js.native
  /** @deprecated DO NOT USE */
  def deleteSite(): Unit = js.native
  def getAllDescendants(): js.Array[Page] = js.native
  def getAllDescendants(options: PageAdvancedParameters): js.Array[Page] = js.native
  /** @deprecated DO NOT USE */
  def getAnnouncements(): js.Array[Page] = js.native
  /** @deprecated DO NOT USE */
  def getAnnouncementsPages(): js.Array[Page] = js.native
  /** @deprecated DO NOT USE */
  def getAttachments(): js.Array[Attachment] = js.native
  def getChildByName(name: String): Page = js.native
  def getChildren(): js.Array[Page] = js.native
  def getChildren(options: PageAdvancedParameters): js.Array[Page] = js.native
  /** @deprecated DO NOT USE */
  def getCollaborators(): js.Array[User] = js.native
  /** @deprecated DO NOT USE */
  def getComments(): js.Array[Comment] = js.native
  def getEditors(): js.Array[User] = js.native
  /** @deprecated DO NOT USE */
  def getFileCabinetPages(): js.Array[Page] = js.native
  /** @deprecated DO NOT USE */
  def getListItems(): js.Array[ListItem] = js.native
  /** @deprecated DO NOT USE */
  def getListPages(): js.Array[Page] = js.native
  def getName(): String = js.native
  def getOwners(): js.Array[User] = js.native
  /** @deprecated DO NOT USE */
  def getSelfLink(): String = js.native
  /** @deprecated DO NOT USE */
  def getSiteName(): String = js.native
  def getSummary(): String = js.native
  def getTemplates(): js.Array[Page] = js.native
  def getTheme(): String = js.native
  def getTitle(): String = js.native
  def getUrl(): String = js.native
  def getViewers(): js.Array[User] = js.native
  /** @deprecated DO NOT USE */
  def getWebAttachments(): js.Array[Attachment] = js.native
  /** @deprecated DO NOT USE */
  def getWebPages(): js.Array[Page] = js.native
  /** @deprecated DO NOT USE */
  def removeCollaborator(email: String): Site = js.native
  /** @deprecated DO NOT USE */
  def removeCollaborator(user: User): Site = js.native
  def removeEditor(emailAddress: String): Site = js.native
  def removeEditor(user: User): Site = js.native
  def removeOwner(email: String): Site = js.native
  def removeOwner(user: User): Site = js.native
  def removeViewer(emailAddress: String): Site = js.native
  def removeViewer(user: User): Site = js.native
  def search(query: String): js.Array[Page] = js.native
  def search(query: String, options: PageAdvancedParameters): js.Array[Page] = js.native
  def setSummary(summary: String): Site = js.native
  def setTheme(theme: String): Site = js.native
  def setTitle(title: String): Site = js.native
}

