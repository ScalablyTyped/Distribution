package typings.dwt.anon

import typings.dwt.dwtBooleans.`false`
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTImageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format extends StObject {
  
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
  implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: EnumDWTImageType | Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFuncHttpUploadStatus(value: /* fileInfo */ js.Any => Unit): Self = StObject.set(x, "funcHttpUploadStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFuncHttpUploadStatusUndefined: Self = StObject.set(x, "funcHttpUploadStatus", js.undefined)
    
    @scala.inline
    def setHttpParams(value: FileName): Self = StObject.set(x, "httpParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpParamsUndefined: Self = StObject.set(x, "httpParams", js.undefined)
    
    @scala.inline
    def setPdfSetup(value: Author): Self = StObject.set(x, "pdfSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfSetupUndefined: Self = StObject.set(x, "pdfSetup", js.undefined)
    
    @scala.inline
    def setReTries(value: Double): Self = StObject.set(x, "reTries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReTriesUndefined: Self = StObject.set(x, "reTries", js.undefined)
    
    @scala.inline
    def setRemoveAfterOutput(value: Boolean): Self = StObject.set(x, "removeAfterOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveAfterOutputUndefined: Self = StObject.set(x, "removeAfterOutput", js.undefined)
    
    @scala.inline
    def setShowProgressBar(value: Boolean): Self = StObject.set(x, "showProgressBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowProgressBarUndefined: Self = StObject.set(x, "showProgressBar", js.undefined)
    
    @scala.inline
    def setSinglePost(value: Boolean): Self = StObject.set(x, "singlePost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinglePostUndefined: Self = StObject.set(x, "singlePost", js.undefined)
    
    @scala.inline
    def setTiffSetup(value: Compression): Self = StObject.set(x, "tiffSetup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiffSetupUndefined: Self = StObject.set(x, "tiffSetup", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUseUploader(value: `false`): Self = StObject.set(x, "useUploader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUploaderUndefined: Self = StObject.set(x, "useUploader", js.undefined)
  }
}
