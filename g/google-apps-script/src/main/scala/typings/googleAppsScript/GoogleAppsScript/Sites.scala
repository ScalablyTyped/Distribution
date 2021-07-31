package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Base.Date
import typings.googleAppsScript.GoogleAppsScript.Base.User
import typings.googleAppsScript.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sites {
  
  @js.native
  sealed trait AttachmentType extends StObject
  /**
    * A typesafe enum for sites attachment type.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    */
  @JSGlobal("GoogleAppsScript.Sites.AttachmentType")
  @js.native
  object AttachmentType extends StObject {
    
    @js.native
    sealed trait HOSTED
      extends StObject
         with AttachmentType
    
    @js.native
    sealed trait WEB
      extends StObject
         with AttachmentType
  }
  
  @js.native
  sealed trait PageType extends StObject
  /**
    * A typesafe enum for sites page type.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    */
  @JSGlobal("GoogleAppsScript.Sites.PageType")
  @js.native
  object PageType extends StObject {
    
    @js.native
    sealed trait ANNOUNCEMENT
      extends StObject
         with PageType
    
    @js.native
    sealed trait ANNOUNCEMENTS_PAGE
      extends StObject
         with PageType
    
    @js.native
    sealed trait FILE_CABINET_PAGE
      extends StObject
         with PageType
    
    @js.native
    sealed trait LIST_PAGE
      extends StObject
         with PageType
    
    @js.native
    sealed trait WEB_PAGE
      extends StObject
         with PageType
  }
  
  /**
    * A Sites Attachment such as a file attached to a page.
    *
    * Note that an Attachment is a Blob and can be used anywhere Blob input is expected.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    *
    *     var filesPage = SitesApp.getSite('example.com', 'mysite').getChildByName("files");
    *     var attachments = filesPage.getAttachments();
    *
    *     // DocsList.createFile accepts a blob input. Since an Attachment is just a blob, we can
    *     // just pass it directly to that method
    *     var file = DocsList.createFile(attachments[0]);
    */
  trait Attachment extends StObject {
    
    def deleteAttachment(): Unit
    
    def getAs(contentType: String): Blob
    
    def getAttachmentType(): AttachmentType
    
    def getBlob(): Blob
    
    def getContentType(): String
    
    def getDatePublished(): Date
    
    def getDescription(): String
    
    def getLastUpdated(): Date
    
    def getParent(): Page
    
    def getTitle(): String
    
    def getUrl(): String
    
    def setContentType(contentType: String): Attachment
    
    def setDescription(description: String): Attachment
    
    def setFrom(blob: BlobSource): Attachment
    
    def setParent(parent: Page): Attachment
    
    def setTitle(title: String): Attachment
    
    def setUrl(url: String): Attachment
  }
  object Attachment {
    
    @scala.inline
    def apply(
      deleteAttachment: () => Unit,
      getAs: String => Blob,
      getAttachmentType: () => AttachmentType,
      getBlob: () => Blob,
      getContentType: () => String,
      getDatePublished: () => Date,
      getDescription: () => String,
      getLastUpdated: () => Date,
      getParent: () => Page,
      getTitle: () => String,
      getUrl: () => String,
      setContentType: String => Attachment,
      setDescription: String => Attachment,
      setFrom: BlobSource => Attachment,
      setParent: Page => Attachment,
      setTitle: String => Attachment,
      setUrl: String => Attachment
    ): Attachment = {
      val __obj = js.Dynamic.literal(deleteAttachment = js.Any.fromFunction0(deleteAttachment), getAs = js.Any.fromFunction1(getAs), getAttachmentType = js.Any.fromFunction0(getAttachmentType), getBlob = js.Any.fromFunction0(getBlob), getContentType = js.Any.fromFunction0(getContentType), getDatePublished = js.Any.fromFunction0(getDatePublished), getDescription = js.Any.fromFunction0(getDescription), getLastUpdated = js.Any.fromFunction0(getLastUpdated), getParent = js.Any.fromFunction0(getParent), getTitle = js.Any.fromFunction0(getTitle), getUrl = js.Any.fromFunction0(getUrl), setContentType = js.Any.fromFunction1(setContentType), setDescription = js.Any.fromFunction1(setDescription), setFrom = js.Any.fromFunction1(setFrom), setParent = js.Any.fromFunction1(setParent), setTitle = js.Any.fromFunction1(setTitle), setUrl = js.Any.fromFunction1(setUrl))
      __obj.asInstanceOf[Attachment]
    }
    
    @scala.inline
    implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteAttachment(value: () => Unit): Self = StObject.set(x, "deleteAttachment", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAs(value: String => Blob): Self = StObject.set(x, "getAs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetAttachmentType(value: () => AttachmentType): Self = StObject.set(x, "getAttachmentType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetBlob(value: () => Blob): Self = StObject.set(x, "getBlob", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContentType(value: () => String): Self = StObject.set(x, "getContentType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDatePublished(value: () => Date): Self = StObject.set(x, "getDatePublished", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDescription(value: () => String): Self = StObject.set(x, "getDescription", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLastUpdated(value: () => Date): Self = StObject.set(x, "getLastUpdated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParent(value: () => Page): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUrl(value: () => String): Self = StObject.set(x, "getUrl", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetContentType(value: String => Attachment): Self = StObject.set(x, "setContentType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetDescription(value: String => Attachment): Self = StObject.set(x, "setDescription", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetFrom(value: BlobSource => Attachment): Self = StObject.set(x, "setFrom", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetParent(value: Page => Attachment): Self = StObject.set(x, "setParent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetTitle(value: String => Attachment): Self = StObject.set(x, "setTitle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUrl(value: String => Attachment): Self = StObject.set(x, "setUrl", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A Sites Column - a column from a Sites List page.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    */
  trait Column extends StObject {
    
    def deleteColumn(): Unit
    
    def getName(): String
    
    def getParent(): Page
    
    def setName(name: String): Column
  }
  object Column {
    
    @scala.inline
    def apply(deleteColumn: () => Unit, getName: () => String, getParent: () => Page, setName: String => Column): Column = {
      val __obj = js.Dynamic.literal(deleteColumn = js.Any.fromFunction0(deleteColumn), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), setName = js.Any.fromFunction1(setName))
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit class ColumnMutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteColumn(value: () => Unit): Self = StObject.set(x, "deleteColumn", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParent(value: () => Page): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetName(value: String => Column): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A Comment attached to any Sites page.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    */
  trait Comment extends StObject {
    
    def deleteComment(): Unit
    
    def getAuthorEmail(): String
    
    def getAuthorName(): String
    
    def getContent(): String
    
    def getDatePublished(): Date
    
    def getLastUpdated(): Date
    
    def getParent(): Page
    
    def setContent(content: String): Comment
    
    def setParent(parent: Page): Comment
  }
  object Comment {
    
    @scala.inline
    def apply(
      deleteComment: () => Unit,
      getAuthorEmail: () => String,
      getAuthorName: () => String,
      getContent: () => String,
      getDatePublished: () => Date,
      getLastUpdated: () => Date,
      getParent: () => Page,
      setContent: String => Comment,
      setParent: Page => Comment
    ): Comment = {
      val __obj = js.Dynamic.literal(deleteComment = js.Any.fromFunction0(deleteComment), getAuthorEmail = js.Any.fromFunction0(getAuthorEmail), getAuthorName = js.Any.fromFunction0(getAuthorName), getContent = js.Any.fromFunction0(getContent), getDatePublished = js.Any.fromFunction0(getDatePublished), getLastUpdated = js.Any.fromFunction0(getLastUpdated), getParent = js.Any.fromFunction0(getParent), setContent = js.Any.fromFunction1(setContent), setParent = js.Any.fromFunction1(setParent))
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteComment(value: () => Unit): Self = StObject.set(x, "deleteComment", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAuthorEmail(value: () => String): Self = StObject.set(x, "getAuthorEmail", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetAuthorName(value: () => String): Self = StObject.set(x, "getAuthorName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetContent(value: () => String): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDatePublished(value: () => Date): Self = StObject.set(x, "getDatePublished", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLastUpdated(value: () => Date): Self = StObject.set(x, "getLastUpdated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParent(value: () => Page): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetContent(value: String => Comment): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetParent(value: Page => Comment): Self = StObject.set(x, "setParent", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A Sites ListItem - a list element from a Sites List page.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    */
  trait ListItem extends StObject {
    
    def deleteListItem(): Unit
    
    def getDatePublished(): Date
    
    def getLastUpdated(): Date
    
    def getParent(): Page
    
    def getValueByIndex(index: Integer): String
    
    def getValueByName(name: String): String
    
    def setParent(parent: Page): ListItem
    
    def setValueByIndex(index: Integer, value: String): ListItem
    
    def setValueByName(name: String, value: String): ListItem
  }
  object ListItem {
    
    @scala.inline
    def apply(
      deleteListItem: () => Unit,
      getDatePublished: () => Date,
      getLastUpdated: () => Date,
      getParent: () => Page,
      getValueByIndex: Integer => String,
      getValueByName: String => String,
      setParent: Page => ListItem,
      setValueByIndex: (Integer, String) => ListItem,
      setValueByName: (String, String) => ListItem
    ): ListItem = {
      val __obj = js.Dynamic.literal(deleteListItem = js.Any.fromFunction0(deleteListItem), getDatePublished = js.Any.fromFunction0(getDatePublished), getLastUpdated = js.Any.fromFunction0(getLastUpdated), getParent = js.Any.fromFunction0(getParent), getValueByIndex = js.Any.fromFunction1(getValueByIndex), getValueByName = js.Any.fromFunction1(getValueByName), setParent = js.Any.fromFunction1(setParent), setValueByIndex = js.Any.fromFunction2(setValueByIndex), setValueByName = js.Any.fromFunction2(setValueByName))
      __obj.asInstanceOf[ListItem]
    }
    
    @scala.inline
    implicit class ListItemMutableBuilder[Self <: ListItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeleteListItem(value: () => Unit): Self = StObject.set(x, "deleteListItem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetDatePublished(value: () => Date): Self = StObject.set(x, "getDatePublished", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLastUpdated(value: () => Date): Self = StObject.set(x, "getLastUpdated", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetParent(value: () => Page): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueByIndex(value: Integer => String): Self = StObject.set(x, "getValueByIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValueByName(value: String => String): Self = StObject.set(x, "getValueByName", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetParent(value: Page => ListItem): Self = StObject.set(x, "setParent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetValueByIndex(value: (Integer, String) => ListItem): Self = StObject.set(x, "setValueByIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetValueByName(value: (String, String) => ListItem): Self = StObject.set(x, "setValueByName", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * A Page on a Google Site.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    */
  @js.native
  trait Page extends StObject {
    
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
    def getAttachments(optOptions: Max): js.Array[Attachment] = js.native
    
    def getAuthors(): js.Array[String] = js.native
    
    def getChildByName(name: String): Page = js.native
    
    def getChildren(): js.Array[Page] = js.native
    def getChildren(options: PageAdvancedParameters): js.Array[Page] = js.native
    
    def getColumns(): js.Array[Column] = js.native
    
    /** @deprecated DO NOT USE */ def getComments(): js.Array[Comment] = js.native
    /** @deprecated DO NOT USE */ def getComments(optOptions: Max): js.Array[Comment] = js.native
    
    def getDatePublished(): Date = js.native
    
    def getHtmlContent(): String = js.native
    
    def getIsDraft(): Boolean = js.native
    
    def getLastEdited(): Date = js.native
    
    def getLastUpdated(): Date = js.native
    
    def getListItems(): js.Array[ListItem] = js.native
    def getListItems(optOptions: Max): js.Array[ListItem] = js.native
    
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
  
  trait PageAdvancedParameters extends StObject {
    
    /** whether to include deleted pages (default false) */
    var includeDeleted: js.UndefOr[Boolean] = js.undefined
    
    /** whether to include draft pages (default false) */
    var includeDrafts: js.UndefOr[Boolean] = js.undefined
    
    /** the max number of results (default 200) */
    var max: js.UndefOr[Integer] = js.undefined
    
    /** only return pages matching this query */
    var search: js.UndefOr[String] = js.undefined
    
    /** start the results here */
    var start: js.UndefOr[Integer] = js.undefined
    
    /** only get pages of this type */
    var `type`: js.UndefOr[js.Array[PageType]] = js.undefined
  }
  object PageAdvancedParameters {
    
    @scala.inline
    def apply(): PageAdvancedParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageAdvancedParameters]
    }
    
    @scala.inline
    implicit class PageAdvancedParametersMutableBuilder[Self <: PageAdvancedParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDeletedUndefined: Self = StObject.set(x, "includeDeleted", js.undefined)
      
      @scala.inline
      def setIncludeDrafts(value: Boolean): Self = StObject.set(x, "includeDrafts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeDraftsUndefined: Self = StObject.set(x, "includeDrafts", js.undefined)
      
      @scala.inline
      def setMax(value: Integer): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
      
      @scala.inline
      def setStart(value: Integer): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setType(value: js.Array[PageType]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeVarargs(value: PageType*): Self = StObject.set(x, "type", js.Array(value :_*))
    }
  }
  
  /**
    * An object representing a Google Site.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    */
  @js.native
  trait Site extends StObject {
    
    /** @deprecated DO NOT USE */ def addCollaborator(email: String): Site = js.native
    /** @deprecated DO NOT USE */ def addCollaborator(user: User): Site = js.native
    
    def addEditor(emailAddress: String): Site = js.native
    def addEditor(user: User): Site = js.native
    
    def addEditors(emailAddresses: js.Array[String]): Site = js.native
    
    def addOwner(email: String): Site = js.native
    def addOwner(user: User): Site = js.native
    
    def addViewer(emailAddress: String): Site = js.native
    def addViewer(user: User): Site = js.native
    
    def addViewers(emailAddresses: js.Array[String]): Site = js.native
    
    /** @deprecated DO NOT USE */ def createAnnouncement(title: String, html: String, parent: Page): Page = js.native
    
    def createAnnouncementsPage(title: String, name: String, html: String): Page = js.native
    
    /** @deprecated DO NOT USE */ def createComment(inReplyTo: String, html: String, parent: Page): Comment = js.native
    
    def createFileCabinetPage(title: String, name: String, html: String): Page = js.native
    
    /** @deprecated DO NOT USE */ def createListItem(html: String, columnNames: js.Array[String], values: js.Array[String], parent: Page): ListItem = js.native
    
    def createListPage(title: String, name: String, html: String, columnNames: js.Array[String]): Page = js.native
    
    def createPageFromTemplate(title: String, name: String, template: Page): Page = js.native
    
    /** @deprecated DO NOT USE */ def createWebAttachment(title: String, url: String, parent: Page): Attachment = js.native
    
    def createWebPage(title: String, name: String, html: String): Page = js.native
    
    /** @deprecated DO NOT USE */ def deleteSite(): Unit = js.native
    
    def getAllDescendants(): js.Array[Page] = js.native
    def getAllDescendants(options: PageAdvancedParameters): js.Array[Page] = js.native
    
    /** @deprecated DO NOT USE */ def getAnnouncements(): js.Array[Page] = js.native
    
    /** @deprecated DO NOT USE */ def getAnnouncementsPages(): js.Array[Page] = js.native
    
    /** @deprecated DO NOT USE */ def getAttachments(): js.Array[Attachment] = js.native
    
    def getChildByName(name: String): Page = js.native
    
    def getChildren(): js.Array[Page] = js.native
    def getChildren(options: PageAdvancedParameters): js.Array[Page] = js.native
    
    /** @deprecated DO NOT USE */ def getCollaborators(): js.Array[User] = js.native
    
    /** @deprecated DO NOT USE */ def getComments(): js.Array[Comment] = js.native
    
    def getEditors(): js.Array[User] = js.native
    
    /** @deprecated DO NOT USE */ def getFileCabinetPages(): js.Array[Page] = js.native
    
    /** @deprecated DO NOT USE */ def getListItems(): js.Array[ListItem] = js.native
    
    /** @deprecated DO NOT USE */ def getListPages(): js.Array[Page] = js.native
    
    def getName(): String = js.native
    
    def getOwners(): js.Array[User] = js.native
    
    /** @deprecated DO NOT USE */ def getSelfLink(): String = js.native
    
    /** @deprecated DO NOT USE */ def getSiteName(): String = js.native
    
    def getSummary(): String = js.native
    
    def getTemplates(): js.Array[Page] = js.native
    
    def getTheme(): String = js.native
    
    def getTitle(): String = js.native
    
    def getUrl(): String = js.native
    
    def getViewers(): js.Array[User] = js.native
    
    /** @deprecated DO NOT USE */ def getWebAttachments(): js.Array[Attachment] = js.native
    
    /** @deprecated DO NOT USE */ def getWebPages(): js.Array[Page] = js.native
    
    /** @deprecated DO NOT USE */ def removeCollaborator(email: String): Site = js.native
    /** @deprecated DO NOT USE */ def removeCollaborator(user: User): Site = js.native
    
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
  
  /**
    * Create and access Google Sites.
    * A rebuilt
    * version of Sites was launched on November 22, 2016. Apps Script cannot currently access or
    * modify Sites made with this version, but script can still access
    * classic Sites.
    */
  @js.native
  trait SitesApp extends StObject {
    
    var AttachmentType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AttachmentType */ js.Any = js.native
    
    var PageType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PageType */ js.Any = js.native
    
    def copySite(domain: String, name: String, title: String, summary: String, site: Site): Site = js.native
    
    def createSite(domain: String, name: String, title: String, summary: String): Site = js.native
    
    def getActivePage(): Page = js.native
    
    def getActiveSite(): Site = js.native
    
    def getAllSites(domain: String): js.Array[Site] = js.native
    def getAllSites(domain: String, start: Integer, max: Integer): js.Array[Site] = js.native
    
    def getPageByUrl(url: String): Page = js.native
    
    def getSite(domain: String, name: String): Site = js.native
    def getSite(name: String): Site = js.native
    
    def getSiteByUrl(url: String): Site = js.native
    
    def getSites(): js.Array[Site] = js.native
    def getSites(domain: String): js.Array[Site] = js.native
    def getSites(domain: String, start: Integer, max: Integer): js.Array[Site] = js.native
    def getSites(start: Integer, max: Integer): js.Array[Site] = js.native
  }
}
