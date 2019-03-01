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
    deleteAttachment: js.Function0[scala.Unit],
    getAs: js.Function1[java.lang.String, googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getAttachmentType: js.Function0[AttachmentType],
    getBlob: js.Function0[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Blob],
    getContentType: js.Function0[java.lang.String],
    getDatePublished: js.Function0[stdLib.Date],
    getDescription: js.Function0[java.lang.String],
    getLastUpdated: js.Function0[stdLib.Date],
    getParent: js.Function0[Page],
    getTitle: js.Function0[java.lang.String],
    getUrl: js.Function0[java.lang.String],
    setContentType: js.Function1[java.lang.String, Attachment],
    setDescription: js.Function1[java.lang.String, Attachment],
    setFrom: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.BlobSource, Attachment],
    setParent: js.Function1[Page, Attachment],
    setTitle: js.Function1[java.lang.String, Attachment],
    setUrl: js.Function1[java.lang.String, Attachment]
  ): Attachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deleteAttachment")(deleteAttachment)
    __obj.updateDynamic("getAs")(getAs)
    __obj.updateDynamic("getAttachmentType")(getAttachmentType)
    __obj.updateDynamic("getBlob")(getBlob)
    __obj.updateDynamic("getContentType")(getContentType)
    __obj.updateDynamic("getDatePublished")(getDatePublished)
    __obj.updateDynamic("getDescription")(getDescription)
    __obj.updateDynamic("getLastUpdated")(getLastUpdated)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getTitle")(getTitle)
    __obj.updateDynamic("getUrl")(getUrl)
    __obj.updateDynamic("setContentType")(setContentType)
    __obj.updateDynamic("setDescription")(setDescription)
    __obj.updateDynamic("setFrom")(setFrom)
    __obj.updateDynamic("setParent")(setParent)
    __obj.updateDynamic("setTitle")(setTitle)
    __obj.updateDynamic("setUrl")(setUrl)
    __obj.asInstanceOf[Attachment]
  }
}

