package typings.googleDashAppsDashScript.GoogleAppsScriptNs.SitesNs

import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.Blob
import typings.googleDashAppsDashScript.GoogleAppsScriptNs.BaseNs.BlobSource
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
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
}

