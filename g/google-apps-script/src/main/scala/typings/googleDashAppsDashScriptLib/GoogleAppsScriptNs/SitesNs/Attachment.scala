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

