package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SitesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  def deleteAttachment(): scala.Unit
  def getAs(contentType: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getAttachmentType(): AttachmentType
  def getBlob(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob
  def getContentType(): java.lang.String
  def getDatePublished(): stdLib.Date
  def getDescription(): java.lang.String
  def getLastUpdated(): stdLib.Date
  def getParent(): Page
  def getTitle(): java.lang.String
  def getUrl(): java.lang.String
  def setContentType(contentType: java.lang.String): Attachment
  def setDescription(description: java.lang.String): Attachment
  def setFrom(blob: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource): Attachment
  def setParent(parent: Page): Attachment
  def setTitle(title: java.lang.String): Attachment
  def setUrl(url: java.lang.String): Attachment
}

object Attachment {
  @scala.inline
  def apply(
    deleteAttachment: () => scala.Unit,
    getAs: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getAttachmentType: () => AttachmentType,
    getBlob: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob,
    getContentType: () => java.lang.String,
    getDatePublished: () => stdLib.Date,
    getDescription: () => java.lang.String,
    getLastUpdated: () => stdLib.Date,
    getParent: () => Page,
    getTitle: () => java.lang.String,
    getUrl: () => java.lang.String,
    setContentType: java.lang.String => Attachment,
    setDescription: java.lang.String => Attachment,
    setFrom: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource => Attachment,
    setParent: Page => Attachment,
    setTitle: java.lang.String => Attachment,
    setUrl: java.lang.String => Attachment
  ): Attachment = {
    val __obj = js.Dynamic.literal(deleteAttachment = js.Any.fromFunction0(deleteAttachment), getAs = js.Any.fromFunction1(getAs), getAttachmentType = js.Any.fromFunction0(getAttachmentType), getBlob = js.Any.fromFunction0(getBlob), getContentType = js.Any.fromFunction0(getContentType), getDatePublished = js.Any.fromFunction0(getDatePublished), getDescription = js.Any.fromFunction0(getDescription), getLastUpdated = js.Any.fromFunction0(getLastUpdated), getParent = js.Any.fromFunction0(getParent), getTitle = js.Any.fromFunction0(getTitle), getUrl = js.Any.fromFunction0(getUrl), setContentType = js.Any.fromFunction1(setContentType), setDescription = js.Any.fromFunction1(setDescription), setFrom = js.Any.fromFunction1(setFrom), setParent = js.Any.fromFunction1(setParent), setTitle = js.Any.fromFunction1(setTitle), setUrl = js.Any.fromFunction1(setUrl))
  
    __obj.asInstanceOf[Attachment]
  }
}

