package typings.googleDashAppsDashScript.GoogleAppsScript.Sites

import typings.googleDashAppsDashScript.Anon_Max
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.BlobSource
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Page on a Google Site.
  * A rebuilt
  * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
  * modify Sites made with this version, but script can still access
  * classic Sites.
  */
@js.native
trait Page extends js.Object {
  def addColumn(name: String): Column = js.native
  /** @deprecated DO NOT USE */ def addComment(content: String): Comment = js.native
  def addHostedAttachment(blob: BlobSource): Attachment = js.native
  def addHostedAttachment(blob: BlobSource, description: String): Attachment = js.native
  def addListItem(values: js.Array[String]): ListItem = js.native
  def addWebAttachment(title: String, description: String, url: String): Attachment = js.native
  def createAnnouncement(title: String, html: String): Page = js.native
  def createAnnouncement(title: String, html: String, asDraft: Boolean): Page = js.native
  def createAnnouncementsPage(title: String, name: String, html: String): Page = js.native
  def createFileCabinetPage(title: String, name: String, html: String): Page = js.native
  def createListPage(title: String, name: String, html: String, columnNames: js.Array[String]): Page = js.native
  def createPageFromTemplate(title: String, name: String, template: Page): Page = js.native
  def createWebPage(title: String, name: String, html: String): Page = js.native
  def deletePage(): Unit = js.native
  def getAllDescendants(): js.Array[Page] = js.native
  def getAllDescendants(options: PageAdvancedParameters): js.Array[Page] = js.native
  def getAnnouncements(): js.Array[Page] = js.native
  def getAnnouncements(optOptions: PageAdvancedParameters): js.Array[Page] = js.native
  def getAttachments(): js.Array[Attachment] = js.native
  def getAttachments(optOptions: Anon_Max): js.Array[Attachment] = js.native
  def getAuthors(): js.Array[String] = js.native
  def getChildByName(name: String): Page = js.native
  def getChildren(): js.Array[Page] = js.native
  def getChildren(options: PageAdvancedParameters): js.Array[Page] = js.native
  def getColumns(): js.Array[Column] = js.native
  /** @deprecated DO NOT USE */ def getComments(): js.Array[Comment] = js.native
  /** @deprecated DO NOT USE */ def getComments(optOptions: Anon_Max): js.Array[Comment] = js.native
  def getDatePublished(): Date = js.native
  def getHtmlContent(): String = js.native
  def getIsDraft(): Boolean = js.native
  def getLastEdited(): Date = js.native
  def getLastUpdated(): Date = js.native
  def getListItems(): js.Array[ListItem] = js.native
  def getListItems(optOptions: Anon_Max): js.Array[ListItem] = js.native
  def getName(): String = js.native
  /** @deprecated DO NOT USE */ def getPageName(): String = js.native
  def getPageType(): PageType = js.native
  def getParent(): Page = js.native
  /** @deprecated DO NOT USE */ def getSelfLink(): String = js.native
  def getTextContent(): String = js.native
  def getTitle(): String = js.native
  def getUrl(): String = js.native
  def isDeleted(): Boolean = js.native
  def isTemplate(): Boolean = js.native
  def publishAsTemplate(name: String): Page = js.native
  def search(query: String): js.Array[Page] = js.native
  def search(query: String, options: PageAdvancedParameters): js.Array[Page] = js.native
  def setHtmlContent(html: String): Page = js.native
  def setIsDraft(draft: Boolean): Page = js.native
  def setName(name: String): Page = js.native
  def setParent(parent: Page): Page = js.native
  def setTitle(title: String): Page = js.native
}

