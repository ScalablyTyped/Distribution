package typings.dwt.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileName extends StObject {
  
  /**
    * Specify the name(s) (pattern) of the uploaded files.
    * Example: "uploadedFile<%06d>.jpg"
    */
  var fileName: js.UndefOr[String] = js.native
  
  /**
    * Custom form fields.
    * Example: {"UploadedBy": "Dynamsoft"}
    */
  var formFields: js.UndefOr[js.Any] = js.native
  
  /**
    * Custom headers in the form.
    * Example: {md5: ""}
    */
  var headers: js.UndefOr[js.Any] = js.native
  
  /**
    * The maximum size of a file to be uploaded (in bytes).
    */
  var maxSizeLimit: js.UndefOr[Double] = js.native
  
  /**
    * Specify the names for the files in the form.
    * Example: "RemoteName<%06d>"
    */
  var remoteName: js.UndefOr[String] = js.native
  
  /**
    * Specify how many threads (<=4) are to be used. Only valid when {useUploader} is true.
    */
  var threads: js.UndefOr[Double] = js.native
  
  /**
    * Target of the request.
    * Example: "http://dynamsoft.com/receivepost.aspx"
    */
  var url: js.UndefOr[String] = js.native
}
object FileName {
  
  @scala.inline
  def apply(): FileName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileName]
  }
  
  @scala.inline
  implicit class FileNameMutableBuilder[Self <: FileName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    @scala.inline
    def setFormFields(value: js.Any): Self = StObject.set(x, "formFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormFieldsUndefined: Self = StObject.set(x, "formFields", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMaxSizeLimit(value: Double): Self = StObject.set(x, "maxSizeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeLimitUndefined: Self = StObject.set(x, "maxSizeLimit", js.undefined)
    
    @scala.inline
    def setRemoteName(value: String): Self = StObject.set(x, "remoteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteNameUndefined: Self = StObject.set(x, "remoteName", js.undefined)
    
    @scala.inline
    def setThreads(value: Double): Self = StObject.set(x, "threads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadsUndefined: Self = StObject.set(x, "threads", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
