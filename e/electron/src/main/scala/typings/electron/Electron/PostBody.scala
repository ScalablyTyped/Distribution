package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostBody extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/post-body
  /**
    * The boundary used to separate multiple parts of the message. Only valid when
    * `contentType` is `multipart/form-data`.
    */
  var boundary: js.UndefOr[String] = js.undefined
  
  /**
    * The `content-type` header used for the data. One of
    * `application/x-www-form-urlencoded` or `multipart/form-data`. Corresponds to the
    * `enctype` attribute of the submitted HTML form.
    */
  var contentType: String
  
  /**
    * The post data to be sent to the new window.
    */
  var data: js.Array[UploadRawData | UploadFile]
}
object PostBody {
  
  inline def apply(contentType: String, data: js.Array[UploadRawData | UploadFile]): PostBody = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBody]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostBody] (val x: Self) extends AnyVal {
    
    inline def setBoundary(value: String): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
    
    inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[UploadRawData | UploadFile]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (UploadRawData | UploadFile)*): Self = StObject.set(x, "data", js.Array(value*))
  }
}
