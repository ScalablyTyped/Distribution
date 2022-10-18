package typings.dwt.anon

import typings.dwt.dwtBooleans.`false`
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTImageType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Format extends StObject {
  
  /**
    * Set the output format.
    */
  var format: js.UndefOr[EnumDWTImageType | Double] = js.undefined
  
  /**
    * A callback triggered during the outputting.
    * @argument fileInfo A JSON object that contains the fileName, percentage, statusCode, responseString, etc.
    */
  var funcHttpUploadStatus: js.UndefOr[js.Function1[/* fileInfo */ Any, Unit]] = js.undefined
  
  /**
    * Setup for HTTP upload via Post.
    */
  var httpParams: js.UndefOr[FileName] = js.undefined
  
  /**
    * Setup for PDF output.
    */
  var pdfSetup: js.UndefOr[Author] = js.undefined
  
  /**
    * Specify how many times the library will try the output.
    */
  var reTries: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether to remove the images after outputting.
    */
  var removeAfterOutput: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to show a progress bar when outputting.
    */
  var showProgressBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to upload all images in one HTTP post.
    */
  var singlePost: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Setup for TIFF output.
    */
  var tiffSetup: js.UndefOr[Compression] = js.undefined
  
  /**
    * Output type. "http" is the only supported type for now.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to use the FileUploader.
    */
  var useUploader: js.UndefOr[`false`] = js.undefined
}
object Format {
  
  inline def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  
  extension [Self <: Format](x: Self) {
    
    inline def setFormat(value: EnumDWTImageType | Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFuncHttpUploadStatus(value: /* fileInfo */ Any => Unit): Self = StObject.set(x, "funcHttpUploadStatus", js.Any.fromFunction1(value))
    
    inline def setFuncHttpUploadStatusUndefined: Self = StObject.set(x, "funcHttpUploadStatus", js.undefined)
    
    inline def setHttpParams(value: FileName): Self = StObject.set(x, "httpParams", value.asInstanceOf[js.Any])
    
    inline def setHttpParamsUndefined: Self = StObject.set(x, "httpParams", js.undefined)
    
    inline def setPdfSetup(value: Author): Self = StObject.set(x, "pdfSetup", value.asInstanceOf[js.Any])
    
    inline def setPdfSetupUndefined: Self = StObject.set(x, "pdfSetup", js.undefined)
    
    inline def setReTries(value: Double): Self = StObject.set(x, "reTries", value.asInstanceOf[js.Any])
    
    inline def setReTriesUndefined: Self = StObject.set(x, "reTries", js.undefined)
    
    inline def setRemoveAfterOutput(value: Boolean): Self = StObject.set(x, "removeAfterOutput", value.asInstanceOf[js.Any])
    
    inline def setRemoveAfterOutputUndefined: Self = StObject.set(x, "removeAfterOutput", js.undefined)
    
    inline def setShowProgressBar(value: Boolean): Self = StObject.set(x, "showProgressBar", value.asInstanceOf[js.Any])
    
    inline def setShowProgressBarUndefined: Self = StObject.set(x, "showProgressBar", js.undefined)
    
    inline def setSinglePost(value: Boolean): Self = StObject.set(x, "singlePost", value.asInstanceOf[js.Any])
    
    inline def setSinglePostUndefined: Self = StObject.set(x, "singlePost", js.undefined)
    
    inline def setTiffSetup(value: Compression): Self = StObject.set(x, "tiffSetup", value.asInstanceOf[js.Any])
    
    inline def setTiffSetupUndefined: Self = StObject.set(x, "tiffSetup", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseUploader(value: `false`): Self = StObject.set(x, "useUploader", value.asInstanceOf[js.Any])
    
    inline def setUseUploaderUndefined: Self = StObject.set(x, "useUploader", js.undefined)
  }
}
