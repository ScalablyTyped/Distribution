package typings.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait BlobSource extends js.Object {
  
  def getAs(contentType: String): Blob = js.native
  
  def getBlob(): Blob = js.native
}
object BlobSource {
  
  @scala.inline
  def apply(getAs: String => Blob, getBlob: () => Blob): BlobSource = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob))
    __obj.asInstanceOf[BlobSource]
  }
  
  @scala.inline
  implicit class BlobSourceOps[Self <: BlobSource] (val x: Self) extends AnyVal {
    
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
    def setGetAs(value: String => Blob): Self = this.set("getAs", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBlob(value: () => Blob): Self = this.set("getBlob", js.Any.fromFunction0(value))
  }
}
