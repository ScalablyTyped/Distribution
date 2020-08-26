package typings.googleAppsScript.GoogleAppsScript.Sites

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import typings.googleAppsScript.GoogleAppsScript.Base.BlobSource
import typings.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait Attachment extends js.Object {
  def deleteAttachment(): Unit = js.native
  def getAs(contentType: String): Blob = js.native
  def getAttachmentType(): AttachmentType = js.native
  def getBlob(): Blob = js.native
  def getContentType(): String = js.native
  def getDatePublished(): Date = js.native
  def getDescription(): String = js.native
  def getLastUpdated(): Date = js.native
  def getParent(): Page = js.native
  def getTitle(): String = js.native
  def getUrl(): String = js.native
  def setContentType(contentType: String): Attachment = js.native
  def setDescription(description: String): Attachment = js.native
  def setFrom(blob: BlobSource): Attachment = js.native
  def setParent(parent: Page): Attachment = js.native
  def setTitle(title: String): Attachment = js.native
  def setUrl(url: String): Attachment = js.native
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
  implicit class AttachmentOps[Self <: Attachment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeleteAttachment(value: () => Unit): Self = this.set("deleteAttachment", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAs(value: String => Blob): Self = this.set("getAs", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAttachmentType(value: () => AttachmentType): Self = this.set("getAttachmentType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBlob(value: () => Blob): Self = this.set("getBlob", js.Any.fromFunction0(value))
    @scala.inline
    def setGetContentType(value: () => String): Self = this.set("getContentType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDatePublished(value: () => Date): Self = this.set("getDatePublished", js.Any.fromFunction0(value))
    @scala.inline
    def setGetDescription(value: () => String): Self = this.set("getDescription", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLastUpdated(value: () => Date): Self = this.set("getLastUpdated", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParent(value: () => Page): Self = this.set("getParent", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetUrl(value: () => String): Self = this.set("getUrl", js.Any.fromFunction0(value))
    @scala.inline
    def setSetContentType(value: String => Attachment): Self = this.set("setContentType", js.Any.fromFunction1(value))
    @scala.inline
    def setSetDescription(value: String => Attachment): Self = this.set("setDescription", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFrom(value: BlobSource => Attachment): Self = this.set("setFrom", js.Any.fromFunction1(value))
    @scala.inline
    def setSetParent(value: Page => Attachment): Self = this.set("setParent", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTitle(value: String => Attachment): Self = this.set("setTitle", js.Any.fromFunction1(value))
    @scala.inline
    def setSetUrl(value: String => Attachment): Self = this.set("setUrl", js.Any.fromFunction1(value))
  }
  
}

