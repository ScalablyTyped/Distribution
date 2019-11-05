package typings.googleDashAppsDashScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for objects that can export their data as a Blob.
  * Implementing classes
  *
  * NameBrief description
  *
  * AttachmentA Sites Attachment such as a file attached to a page.
  *
  * BlobA data interchange object for Apps Script services.
  *
  * ChartA Chart object, which can be converted to a static image.
  *
  * DocumentA document, containing rich text and elements such as tables and lists.
  *
  * EmbeddedChartRepresents a chart that has been embedded into a spreadsheet.
  *
  * FileA file in Google Drive.
  *
  * GmailAttachmentAn attachment from Gmail.
  *
  * HTTPResponseThis class allows users to access specific information on HTTP responses.
  *
  * HtmlOutputAn HtmlOutput object that can be served from a script.
  *
  * ImageA PageElement representing an image.
  *
  * InlineImageAn element representing an embedded image.
  *
  * JdbcBlobA JDBC Blob.
  *
  * JdbcClobA JDBC Clob.
  *
  * PictureFillA fill that renders an image that's stretched to the dimensions of its container.
  *
  * PositionedImageFixed position image anchored to a Paragraph.
  *
  * SpreadsheetAccess and modify Google Sheets files.
  *
  * StaticMapAllows for the creation and decoration of static map images.
  */
trait BlobSource extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
}

object BlobSource {
  @scala.inline
  def apply(getAs: String => Blob, getBlob: () => Blob): BlobSource = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob))
  
    __obj.asInstanceOf[BlobSource]
  }
}

