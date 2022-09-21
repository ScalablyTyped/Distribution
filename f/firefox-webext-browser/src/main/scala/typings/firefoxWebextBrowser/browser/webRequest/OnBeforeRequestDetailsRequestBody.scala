package typings.firefoxWebextBrowser.browser.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the HTTP request body data. Only provided if extraInfoSpec contains 'requestBody'. */
trait OnBeforeRequestDetailsRequestBody extends StObject {
  
  /** Errors when obtaining request body data. */
  var error: js.UndefOr[String] = js.undefined
  
  /**
    * If the request method is POST and the body is a sequence of key-value pairs encoded in UTF8, encoded as either multipart/form-data, or application/x-www-form-urlencoded, this dictionary is present and for each key contains the list of all values for that key. If the data is of another media type, or if it is malformed, the dictionary is not present. An example value of this dictionary is {'key': ['value1', 'value2']}.
    */
  var formData: js.UndefOr[js.Object] = js.undefined
  
  /**
    * If the request method is PUT or POST, and the body is not already parsed in formData, then the unparsed request body elements are contained in this array.
    */
  var raw: js.UndefOr[js.Array[UploadData]] = js.undefined
}
object OnBeforeRequestDetailsRequestBody {
  
  inline def apply(): OnBeforeRequestDetailsRequestBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBeforeRequestDetailsRequestBody]
  }
  
  extension [Self <: OnBeforeRequestDetailsRequestBody](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setFormData(value: js.Object): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setRaw(value: js.Array[UploadData]): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setRawVarargs(value: UploadData*): Self = StObject.set(x, "raw", js.Array(value*))
  }
}
