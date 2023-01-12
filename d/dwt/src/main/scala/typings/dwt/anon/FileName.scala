package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileName extends StObject {
  
  /**
    * Specify the name(s) (pattern) of the uploaded files.
    * Example: "uploadedFile<%06d>.jpg"
    */
  var fileName: js.UndefOr[String] = js.undefined
  
  /**
    * Custom form fields.
    * Example: {"UploadedBy": "Dynamsoft"}
    */
  var formFields: js.UndefOr[Any] = js.undefined
  
  /**
    * Custom headers in the form.
    * Example: {md5: ""}
    */
  var headers: js.UndefOr[Any] = js.undefined
  
  /**
    * The maximum size of a file to be uploaded (in bytes).
    */
  var maxSizeLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify the names for the files in the form.
    * Example: "RemoteName<%06d>"
    */
  var remoteName: js.UndefOr[String] = js.undefined
  
  /**
    * Specify how many threads (<=4) are to be used. Only valid when {useUploader} is true.
    */
  var threads: js.UndefOr[Double] = js.undefined
  
  /**
    * Target of the request.
    * Example: "http://dynamsoft.com/receivepost.aspx"
    */
  var url: js.UndefOr[String] = js.undefined
}
object FileName {
  
  inline def apply(): FileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileName] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setFormFields(value: Any): Self = StObject.set(x, "formFields", value.asInstanceOf[js.Any])
    
    inline def setFormFieldsUndefined: Self = StObject.set(x, "formFields", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMaxSizeLimit(value: Double): Self = StObject.set(x, "maxSizeLimit", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeLimitUndefined: Self = StObject.set(x, "maxSizeLimit", js.undefined)
    
    inline def setRemoteName(value: String): Self = StObject.set(x, "remoteName", value.asInstanceOf[js.Any])
    
    inline def setRemoteNameUndefined: Self = StObject.set(x, "remoteName", js.undefined)
    
    inline def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    inline def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
