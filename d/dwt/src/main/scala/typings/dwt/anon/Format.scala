package typings.dwt.anon

import typings.dwt.dwtBooleans.`false`
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTImageType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  /**
    * Set the output format.
    */
  var format: js.UndefOr[EnumDWTImageType | Double] = js.native
  /**
    * A callback triggered during the outputting.
    * @argument fileInfo A JSON object that contains the fileName, percentage, statusCode, responseString, etc.
    */
  var funcHttpUploadStatus: js.UndefOr[js.Function1[/* fileInfo */ js.Any, Unit]] = js.native
  /**
    * Setup for HTTP upload via Post.
    */
  var httpParams: js.UndefOr[FileName] = js.native
  /**
    * Setup for PDF output.
    */
  var pdfSetup: js.UndefOr[Author] = js.native
  /**
    * Specify how many times the library will try the output.
    */
  var reTries: js.UndefOr[Double] = js.native
  /**
    * Whether to remove the images after outputting.
    */
  var removeAfterOutput: js.UndefOr[Boolean] = js.native
  /**
    * Whether to show a progress bar when outputting.
    */
  var showProgressBar: js.UndefOr[Boolean] = js.native
  /**
    * Whether to upload all images in one HTTP post.
    */
  var singlePost: js.UndefOr[Boolean] = js.native
  /**
    * Setup for TIFF output.
    */
  var tiffSetup: js.UndefOr[Compression] = js.native
  /**
    * Output type. "http" is the only supported type for now.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Whether to use the FileUploader.
    */
  var useUploader: js.UndefOr[`false`] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
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
    def setFormat(value: EnumDWTImageType | Double): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setFuncHttpUploadStatus(value: /* fileInfo */ js.Any => Unit): Self = this.set("funcHttpUploadStatus", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFuncHttpUploadStatus: Self = this.set("funcHttpUploadStatus", js.undefined)
    @scala.inline
    def setHttpParams(value: FileName): Self = this.set("httpParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpParams: Self = this.set("httpParams", js.undefined)
    @scala.inline
    def setPdfSetup(value: Author): Self = this.set("pdfSetup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdfSetup: Self = this.set("pdfSetup", js.undefined)
    @scala.inline
    def setReTries(value: Double): Self = this.set("reTries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReTries: Self = this.set("reTries", js.undefined)
    @scala.inline
    def setRemoveAfterOutput(value: Boolean): Self = this.set("removeAfterOutput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveAfterOutput: Self = this.set("removeAfterOutput", js.undefined)
    @scala.inline
    def setShowProgressBar(value: Boolean): Self = this.set("showProgressBar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowProgressBar: Self = this.set("showProgressBar", js.undefined)
    @scala.inline
    def setSinglePost(value: Boolean): Self = this.set("singlePost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSinglePost: Self = this.set("singlePost", js.undefined)
    @scala.inline
    def setTiffSetup(value: Compression): Self = this.set("tiffSetup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTiffSetup: Self = this.set("tiffSetup", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUseUploader(value: `false`): Self = this.set("useUploader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseUploader: Self = this.set("useUploader", js.undefined)
  }
  
}

